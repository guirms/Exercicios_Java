package Aplicacao;

import java.util.HashSet;
import java.util.Set;

public class TestandoFuncoes {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); // mais rápido porém sem ordem (se usa quando a ordem não importa)

		set.add("João");
		set.add("Maria");
		set.add("Pedro");

		set.removeIf(x -> x.length() <= 4);

		for (String s : set) {
			System.out.println(s);
		}

	}

}
