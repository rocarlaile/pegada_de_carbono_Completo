package model;

import java.time.LocalDate;

public class Chamado {

	private int id;
	private LocalDate dataChamado;
	private String endereco;
	private Double distanciaPercorrida;
	private Colaborador motorista;
	private Veiculo carro;

	public Chamado(int id, LocalDate dataChamado, String endereco, Double distanciaPercorrida, Colaborador motorista,
			Veiculo carro) {
		this.id = id;
		this.dataChamado = dataChamado;
		this.endereco = endereco;
		this.distanciaPercorrida = distanciaPercorrida;
		this.motorista = motorista;
		this.carro = carro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataChamado() {
		return dataChamado;
	}

	public void setDataChamado(LocalDate dataChamado) {
		this.dataChamado = dataChamado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(Double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public Colaborador getMotorista() {
		return motorista;
	}

	public void setMotorista(Colaborador motorista) {
		this.motorista = motorista;
	}

	public Veiculo getCarro() {
		return carro;
	}

	public void setCarro(Veiculo carro) {
		this.carro = carro;
	}

	public double calcularEmissaoCo2() {

		return (this.distanciaPercorrida / carro.getConsumoKm()) * 0.82 * 0.75 * 3.7;

	}
}