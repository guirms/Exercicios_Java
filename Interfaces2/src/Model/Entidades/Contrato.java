package Model.Entidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Model.Servicos.ServicoPagamentoOnline;

public class Contrato {

	private Integer numeroContrato;
	private Integer numeroMeses;
	private Date data;
	private Double valorTotal;

	ServicoPagamentoOnline pagamentoOnline;

	public Contrato() {
	}

	public Contrato(Integer numeroContrato, Integer numeroMeses, Date data, Double valorTotal,
			ServicoPagamentoOnline pagamentoOnline) {
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.valorTotal = valorTotal;
		this.numeroMeses = numeroMeses;
		this.pagamentoOnline = pagamentoOnline;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getNumeroMeses() {
		return numeroMeses;
	}

	public void setNumeroMeses(Integer numeroMeses) {
		this.numeroMeses = numeroMeses;
	}

	public void printarParcelas() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		pagamentoOnline.valorParcela(valorTotal, numeroMeses);
		System.out.println("\nParcelas:");
		for (int i = 1; i <= getNumeroMeses(); i++) {
			cal.add(Calendar.MONTH, 1);
			data = cal.getTime();
			double sla = pagamentoOnline.parcelas(valorTotal, i);
			System.out.println("(" + sdf.format(data) + "), " + "Parcela " + i + ": " + sla);
		}
	}
}
