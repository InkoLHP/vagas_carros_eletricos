import java.time.LocalDateTime;

public class Reserva {
    private LocalDateTime horarioInicio;
    private LocalDateTime horarioFim;
    private Vaga vaga;
    private Carro carro;
    private Pagamento pagamento;

    public Reserva(LocalDateTime horarioInicio, LocalDateTime horarioFim, Vaga vaga, Carro carro, Pagamento pagamento) {
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.vaga = vaga;
        this.carro = carro;
        this.pagamento = pagamento;
    }

    public void calcularValorTotal() {

    }

    public LocalDateTime getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(LocalDateTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalDateTime getHorarioFim() {
        return horarioFim;
    }
    public void setHorarioFim(LocalDateTime horarioFim) {
        this.horarioFim = horarioFim;
    }

    public Vaga getVaga() {
        return vaga;
    }
    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}