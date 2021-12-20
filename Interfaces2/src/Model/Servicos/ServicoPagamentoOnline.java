package Model.Servicos;

public interface ServicoPagamentoOnline {

	double parcelas(double quantia, int meses);
	void valorParcela(double quantia, int meses);
	

}
