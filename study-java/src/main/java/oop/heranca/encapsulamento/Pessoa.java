package oop.heranca.encapsulamento;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private int idade;

    public Pessoa() {
        this("Teste", "Teste", 0);
    }

    public Pessoa(String nome, String sobreNome, int idade) {
        setNome(nome);
        setSobreNome(sobreNome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobreNome();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        int i = Math.abs(idade);
        if(i >=0 && i <= 120) {
            this.idade = i;
        }
    }

    @Override
    public String toString() {
        return "O nome é " + getNomeCompleto() + " e sua idade é " + getIdade();
    }
}
