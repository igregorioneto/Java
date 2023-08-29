package org.jpa.modelo.muitosparamuitos;

import javax.persistence.*;
import java.util.List;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "atores_filmes",
            joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id")
    )
    private List<Ator> atores;
}
