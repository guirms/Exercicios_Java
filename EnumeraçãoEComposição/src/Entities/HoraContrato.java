package Entities;

import java.util.Date;

public class HoraContrato {

	Date data;
	Double valorHora;
	Integer horas;

	public HoraContrato() {
	}

	public HoraContrato(Date data, Double valorHora, Integer horas) {
		this.data = data;
		this.valorHora = valorHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double valorTotal() {
		return valorHora * horas;
	}
}
