public class LivroFisico extends Livro {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaDeImpressao() {
        return this.getValor() * 0.5;
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.3)
            return false;

        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("aplicando desconto no LivroFisico");
        return true;
    }
}
