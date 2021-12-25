package Aplicacao;

import java.util.HashSet;
import java.util.Set;

public class TestandoFuncoes {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); // mais r�pido por�m sem ordem (se usa quando a ordem n�o importa)

		set.add("Jo�o");
		set.add("Maria");
		set.add("Pedro");

		set.removeIf(x -> x.length() <= 4);

		for (String s : set) {
			System.out.println(s);
		}

	}

}
