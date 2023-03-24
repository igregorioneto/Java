public class Ebook extends Livro{

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if(porcentagem > 0.15)
            return false;
//        double desconto = this.getValor() * porcentagem;
//        this.setValor(this.getValor() - desconto);
        return super.aplicarDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return this.waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
