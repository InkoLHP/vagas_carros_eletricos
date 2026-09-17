import java.time.LocalDate;

public class Carro {
	
	private String marca; 
	private String modelo; 
	private LocalDate ano; 
	private String tipoCarregador; 
	private String placa;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public LocalDate getAno() {
		return ano;
	}
	public void setAno(LocalDate ano) {
		this.ano = ano;
	}
	public String getTipoCarregador() {
		return tipoCarregador;
	}
	public void setTipoCarregador(String tipoCarregador) {
		this.tipoCarregador = tipoCarregador;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	} 
	
	
	
	
}
