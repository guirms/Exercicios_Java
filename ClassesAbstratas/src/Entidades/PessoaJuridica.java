package Entidades;

public class PessoaJuridica extends Contribuintes {

	private Integer numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double imposto() {
		double imposto;
		if (numeroFuncionarios <= 10) {
			imposto = rendaAnual * 0.16;
		} else {
			imposto = rendaAnual * 0.14;
		}

		return imposto;
	}

}
