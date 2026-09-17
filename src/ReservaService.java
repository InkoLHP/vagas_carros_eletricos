
import java.util.ArrayList;
import java.util.List;


public class ReservaService {
	
	private List<Reserva> reservas = new ArrayList<>();

	public void fazerReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public void alterarReserva() {
		
	}
	
	public void cancelarReserva(Reserva reserva) {
		reservas.remove(reserva);
	}
	
	
	public void calcularValorTotal() {
		
	}
}
