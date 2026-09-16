public class Pix implements MetodoPagamento {
    private String chave;


    public Pix(String chave) {
        this.chave = chave;
    }

    @Override
    public void pagar() {

    }

    public String getChave() {
        return chave;
    }
    public void setChave(String chave) {
        this.chave = chave;
    }
}