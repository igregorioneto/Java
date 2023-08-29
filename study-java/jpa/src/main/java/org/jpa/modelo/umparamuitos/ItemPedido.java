package org.jpa.modelo.umparamuitos;

import javax.persistence.*;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantidade;
    private Double price;

    @ManyToOne(fetch = FetchType.EAGER)
    private Pedido pedido;
    // construtor, getters, setters
}
