package Entidades;

public class Funcionarios  {
	
	private Double salario;
	private String nome;
	
	public Funcionarios(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
