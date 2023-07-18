package org.tallyto.br.model.prato;

import jakarta.persistence.*;
import org.tallyto.br.model.restaurante.Restaurante;

import java.math.BigDecimal;

@Entity
@Table(name = "prato")
public class Prato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String nome;

    public String descricao;

    @ManyToOne
    public Restaurante restaurante;

    public BigDecimal preco;
}
