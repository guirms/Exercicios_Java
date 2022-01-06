package Aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa2 {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

		Stream<Integer> stream = lista.stream().map(x -> x * 10);

		System.out.println(Arrays.toString(stream.toArray()));

		int soma = lista.stream().reduce(0, (x, y) -> x + y);
		System.out.println(soma);
		
		int multiplicacao = lista.stream().reduce(1, (x, y) -> x * y);
		System.out.println(multiplicacao);
		
		List<Integer> lista2 = lista.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(Arrays.toString(lista2.toArray()));
	}

}
