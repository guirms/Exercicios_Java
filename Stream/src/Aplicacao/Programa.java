package Aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		
		Stream<Integer> st1 = lista.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("João", "Maria", "Pedro");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
	}

}
