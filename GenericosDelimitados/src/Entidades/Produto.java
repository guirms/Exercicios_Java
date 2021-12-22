package Entidades;

public class Produto implements Comparable<Produto>{
	
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Preco: " + preco ;
	}

	@Override
	public int compareTo(Produto outro) {
		return preco.compareTo(outro.getPreco());
	}

}
