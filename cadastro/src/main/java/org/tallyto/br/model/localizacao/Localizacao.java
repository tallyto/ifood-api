package org.tallyto.br.model.localizacao;

import jakarta.persistence.*;

@Entity
@Table(name = "localizacao")
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public Double latitude;

    public Double longitude;
}
