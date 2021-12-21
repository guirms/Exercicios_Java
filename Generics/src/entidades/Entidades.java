package entidades;

import java.util.ArrayList;
import java.util.List;

public class Entidades<T> {
	
	List<T> lista = new ArrayList<>();
	
	public void adicionarLista(T objeto) {
		lista.add(objeto);
	}
	
	public void printarLista() {
		System.out.print("[ ");
		for (T listaPrint: lista) {
			System.out.print(listaPrint + ", ");
		}
		System.out.print("]");
	}
	
	public void entsla() {
		System.out.print("joao");
	}
	
}
