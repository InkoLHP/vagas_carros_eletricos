public class Pagamento {
    private float valor;
    private MetodoPagamento metodo;

    public Pagamento(float valor, MetodoPagamento metodo) {
        this.valor = valor;
        this.metodo = metodo;
    }

    public void pagar() {
        if (metodo != null) {
            metodo.pagar();
        }
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }
    public void setMetodo(MetodoPagamento metodo) {
        this.metodo = metodo;
    }
}