package Entidades;

import java.util.function.Function;

public class UpperCaseNome implements Function<Produtos, String> {

	@Override
	public String apply(Produtos p) {
		return p.getNome().toUpperCase();
	}

}
