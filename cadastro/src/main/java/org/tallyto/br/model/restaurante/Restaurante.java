package org.tallyto.br.model.restaurante;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.tallyto.br.model.localizacao.Localizacao;

import java.util.Date;

@Entity
@Table(name = "restaurante")
public class Restaurante extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String propretario;

    public String cnpj;

    public String nome;

    @ManyToOne
    public Localizacao localizacao;

    @CreationTimestamp
    public Date dataCriacao;

    @UpdateTimestamp
    public Date dataAtualizacao;
}
