package Entidades;

import java.util.Objects;

public class AlunosCurso {

	private Integer id;

	public AlunosCurso(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunosCurso other = (AlunosCurso) obj;
		return Objects.equals(id, other.id);
	}

}
