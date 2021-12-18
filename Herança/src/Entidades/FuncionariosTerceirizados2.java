package Entidades;

public class FuncionariosTerceirizados2 extends Funcionario2 {

	private Double despesaAdicional;
	
	public FuncionariosTerceirizados2() {
		super();
	}

	public FuncionariosTerceirizados2(String nome, Integer hora, Double valorHora, Double despesaAdicional) {
		super(nome, hora, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}

}
