package Entidades;

import java.util.List;
import java.util.function.Predicate;

public class SomarProdutos {

	public static double filtroSoma(List<Produtos> lista, Predicate<Produtos> criterio) {
		double soma = 0;
		for (Produtos p : lista) {
			if (criterio.test(p)) {
				soma += p.getPreco();
			}
		}
		return soma;
	}

}
