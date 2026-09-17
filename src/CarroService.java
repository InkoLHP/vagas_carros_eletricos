import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class CarroService {

	private List<Carro> carros = new ArrayList<>();
	
	public void cadastrarCarro(Carro carro) {
		carros.add(carro);
	}
	
	public void alterarCarro() {
		
	}
	
	public void excluirCarro(Carro carro) {
		carros.remove(carro); 
	}
	
}
