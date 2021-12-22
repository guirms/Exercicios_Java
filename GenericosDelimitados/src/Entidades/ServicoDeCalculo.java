package Entidades;

import java.util.List;

public class ServicoDeCalculo {
	
	public static <T extends Comparable<? super T>> T max(List<T> lista) {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista não pode estar vazia");
		}
		T maiorPreco = lista.get(0);
		for (T maiorLista: lista) {
			if (maiorLista.compareTo(maiorPreco) > 0) {
				maiorPreco = maiorLista;
			}
		}
		return maiorPreco;
	}

}
