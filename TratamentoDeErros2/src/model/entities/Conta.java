package model.entities;

import model.exceptions.ErroBanco;

public class Conta {

	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limiteSaque;

	public Conta() {

	}

	public Conta(Integer numero, String nome, Double saldo, Double limiteSaque) throws ErroBanco {
		if (saldo == 0) {
			throw new ErroBanco("Erro: Saldo nulo");
		}
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void deposito(double quantidade) {
		saldo += quantidade;
	}

	public void saque(double quantidade) throws ErroBanco {
		if (saldo == 0) {
			throw new ErroBanco("Erro: Saldo nulo");
		}
		if (quantidade >= limiteSaque) {
			throw new ErroBanco("Erro: Saque maior que o limite");
		}

		this.saldo -= quantidade;
	}

}
