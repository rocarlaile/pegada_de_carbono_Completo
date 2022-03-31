package model;

public class Veiculo {

	private int id;
	private String placa;
	private String modelo;
	private int ano;
	private float consumoKm;
	private String veiculoDisponivel;

	public Veiculo(int id, String placa, String modelo, int ano, float consumoKm, String veiculoDisponivel) {
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.consumoKm = consumoKm;
		this.veiculoDisponivel = veiculoDisponivel;
	}

	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getConsumoKm() {
		return consumoKm;
	}

	public void setConsumoKm(float consumoKm) {
		this.consumoKm = consumoKm;
	}

	public String getVeiculoDisponivel() {
		return veiculoDisponivel;
	}

	public void setVeiculoDisponivel(String veiculoDisponivel) {
		this.veiculoDisponivel = veiculoDisponivel;
	}

}
