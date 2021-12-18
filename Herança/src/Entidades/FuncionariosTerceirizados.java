package Entidades;

public class FuncionariosTerceirizados extends Funcionario {

	public Double despesaAdicional;

	public FuncionariosTerceirizados() { // construtor padrao precisa de super
		super();
	}

	public FuncionariosTerceirizados(String nome, Integer hora, Double valorHora, Double despesaAdicional) {
		super(nome, hora, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

}
