package Entidades;

import java.util.Date;
import java.util.Objects;

public class EntradaLogin {

	private String nome;
	private Date data;

	public EntradaLogin(String nome, Date data) {
		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntradaLogin other = (EntradaLogin) obj;
		return Objects.equals(nome, other.nome);
	}

}
