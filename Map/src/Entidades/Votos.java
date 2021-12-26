package Entidades;

import java.util.Objects;

public class Votos {

	private String nomeCandidato;
	private Integer votosCandidato;
	private Integer votosSoma;

	public Votos() {

	}

	public Votos(String nomeCandidato, Integer votosCanditato, Integer votosSoma) {
		this.nomeCandidato = nomeCandidato;
		this.votosCandidato = votosCanditato;
		this.votosSoma = votosSoma;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public Integer getVotosCandidato() {
		if (votosSoma == null) {
			return votosCandidato;
		} else {
			return votosCandidato + votosSoma;
		}
	}

	public void setVotosCanditato(Integer votosCanditato) {
		this.votosCandidato = votosCanditato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeCandidato, votosCandidato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votos other = (Votos) obj;
		return Objects.equals(nomeCandidato, other.nomeCandidato)
				&& Objects.equals(votosCandidato, other.votosCandidato);
	}

}
