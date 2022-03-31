package model;

public class Colaborador {

	private int id;
	private String nome;
	private String endereco;
	private String cpf;
	private String cargo;
	private Double salario;
	private String telefone;
	private String cnhB;

	public Colaborador(int id, String nome, String endereco, String cpf, String cargo, Double salario, String telefone,
			String cnhB) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.telefone = telefone;
		this.cnhB = cnhB;
	}

	
	
	public Colaborador() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnhB() {
		return cnhB;
	}

	public void setCnhB(String cnhB) {
		this.cnhB = cnhB;
	}

}