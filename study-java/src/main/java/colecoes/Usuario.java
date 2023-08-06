package colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    public Usuario(String nomeUsuario) {
        this.nome = nomeUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Nome do usuário é " + nome;
    }
}
