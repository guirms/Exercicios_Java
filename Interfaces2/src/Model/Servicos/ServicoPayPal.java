package Model.Servicos;

public class ServicoPayPal implements ServicoPagamentoOnline {

	double valorParcela;

	public double getValorParcela() {
		return valorParcela;
	}

	public void valorParcela(double quantia, int meses) {
		this.valorParcela = quantia / meses;
	}

	public double parcelas(double quantia, int meses) {
		double valorJurosSimples = getValorParcela() + (getValorParcela() * (0.01 * meses));
		double valorTaxa = valorJurosSimples + (valorJurosSimples * 0.02);
		return valorTaxa;
	}

}
