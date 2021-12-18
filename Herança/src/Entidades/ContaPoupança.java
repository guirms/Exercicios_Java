package Entidades;

public class ContaPoupan�a extends Conta {

	private Double taxaJuros;
	
	public ContaPoupan�a() {
		super();
	}

	public ContaPoupan�a(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public final void saque(double quantia) {
		saldo -= quantia;
	}
}
