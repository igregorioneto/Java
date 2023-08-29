package org.jpa.modelo.umparaum;

import org.jpa.heranca.BaseEntity;
import org.jpa.modelo.compartilhado.Endereco;

import javax.persistence.*;

@Entity
public class Cliente extends BaseEntity {
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "assento_id", unique = true)
    private Assento assento;

    private Endereco endereco;

    // constructor, getters, setters
}
