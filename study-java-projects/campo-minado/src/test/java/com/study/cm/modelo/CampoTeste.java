package com.study.cm.modelo;

import com.study.cm.modelo.Campo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
    private Campo campo;

    @BeforeEach
    void inicializarCampo() {
        campo = new Campo(3,3);
    }

    @Test
    void testeVizinhoDistancia1() {
        Campo vizinho = new Campo(3,2);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia2() {
        Campo vizinho = new Campo(2,3);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia3() {
        Campo vizinho = new Campo(4,4);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeNaoVizinho() {
        Campo vizinho = new Campo(1,1);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertFalse(resultado);
    }
}
