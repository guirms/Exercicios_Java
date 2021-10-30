package Entities;

import java.util.Date;

public class Cliente {
	
	private String nomeCLiente;
	private String email;
	private Date dataNascimento;
	
	public Cliente() {
	}

	public Cliente(String nomeCLiente, String email, Date dataNascimento) {
		this.nomeCLiente = nomeCLiente;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getnomeCLiente() {
		return nomeCLiente;
	}

	public void setnomeCLiente(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	

}
