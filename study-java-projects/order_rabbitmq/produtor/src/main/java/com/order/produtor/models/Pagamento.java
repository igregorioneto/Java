package com.order.produtor.models;

import jakarta.persistence.*;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Column(name = "valor_pagamento")
    private Double valorPagamento;

    public Pagamento() {
    }

    public Pagamento(String nomeCliente, Double valorPagamento) {
        this.nomeCliente = nomeCliente;
        this.valorPagamento = valorPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
}
