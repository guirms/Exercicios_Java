package Entidades;

public class Funcionario implements Comparable<Funcionario> {
	
	private Double salario;
	private String nome;
	
	public Funcionario(String nome, Double salario) {
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

	@Override
	public int compareTo(Funcionario proximoSalario) {
		return salario.compareTo(proximoSalario.getSalario());
	}
	
}
