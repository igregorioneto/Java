package org.jpa.modelo.muitosparamuitos;

import org.jpa.heranca.BaseEntity;
import org.jpa.modelo.compartilhado.Endereco;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ator extends BaseEntity {

    @ManyToMany(mappedBy = "atores", cascade = CascadeType.PERSIST)
    private List<Filme> filmes;

    private Endereco endereco;
}
