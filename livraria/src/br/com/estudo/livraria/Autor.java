package br.com.estudo.livraria;

public class Autor {
    String nome;
    String email;
    String cpf;

    @Override
    public String toString() {
        System.out.println("Mostrando detalhes do autor ");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        return "";
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Autor)) return false;
        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome);
    }
}
