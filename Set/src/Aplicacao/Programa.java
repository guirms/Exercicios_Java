package Aplicacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); // mais rápido porém sem ordem (se usa quando a ordem não importa)

		set.add("João");
		set.add("Maria");
		set.add("Pedro");

		System.out.println(set.contains("João") + "\n");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new TreeSet<>(); // mais lento e ordena por ordem alfabética (compareTo)
		
		set2.add("João");
		set2.add("Maria");
		set2.add("Ana");

		System.out.println(set2.contains("João") + "\n");
		
		for (String s : set2) {
			System.out.println(s);
		}
		
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("João");
		set3.add("Maria");
		set3.add("Ana");

		System.out.println(set3.contains("João") + "\n"); //velocidade intermediária, imprime na ordem que foi alocado
		
		for (String s : set3) {
			System.out.println(s);
		}

	}

}
