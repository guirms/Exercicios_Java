package Entidades;

import java.util.Comparator;

public class Comparador implements Comparator<Funcionarios>{

	@Override
	public int compare(Funcionarios f1, Funcionarios f2) {
		return f1.getNome().toUpperCase().compareTo(f2.getNome().toUpperCase());
	}
	
	

}
