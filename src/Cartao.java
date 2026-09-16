import java.util.Date;

public class Cartao implements MetodoPagamento {
    private String nome;
    private int numero;
    private String funcao;
    private Date validade;
    private int cvc;

    public Cartao(String nome, int numero, String funcao, Date validade, int cvc) {
        this.nome = nome;
        this.numero = numero;
        this.funcao = funcao;
        this.validade = validade;
        this.cvc = cvc;
    }

    @Override
    public void pagar() {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Date getValidade() {
        return validade;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getCvc() {
        return cvc;
    }
    public void setCvc(int cvc) {
        this.cvc = cvc;
    }
}