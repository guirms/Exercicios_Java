package Entidades;

public class Funcionario {

	private String nome;
	protected Integer hora;
	protected Double valorHora;

	public Funcionario() {
	}

	public Funcionario(String nome, Integer hora, Double valorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome, String nomeCompleto) {
		nomeCompleto = "";
		String[] vetorNome = nome.split(" ");
		int tamVetor = vetorNome.length;

		for (int i = 0; i < tamVetor; i++) {
			String nomeSeparado = vetorNome[i];
			nome = nomeSeparado.substring(0, 1).toUpperCase().concat(nomeSeparado.substring(1));
			nomeCompleto += nome.concat(" ");
		}
		return nomeCompleto;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public double pagamento() {
		return hora * valorHora;
	}

}

