package Aplicacao;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestandoCopias {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//união
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersecção
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//diferença
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
