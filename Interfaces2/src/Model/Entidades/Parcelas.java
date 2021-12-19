package Model.Entidades;

import java.util.Date;

public class Parcelas {

	private Date dataVencimento;
	private Double quantia;

	public Parcelas() {
	}

	public Parcelas(Date dataVencimento, Double quantia) {
		this.dataVencimento = dataVencimento;
		this.quantia = quantia;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}

}
