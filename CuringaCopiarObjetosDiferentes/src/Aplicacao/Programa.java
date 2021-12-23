package Aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> listaInt = Arrays.asList(1, 2, 3);
		List<Double> listaDouble = Arrays.asList(1.0, 2.0, 3.0);
		List<Object> listaObj = new ArrayList<Object>();
		
		copiarLista(listaInt, listaObj);
		printarLista(listaObj);
		copiarLista(listaDouble, listaObj);
		printarLista(listaObj);
		
	}
	
	public static void copiarLista(List<? extends Number> lista1, List<? super Number> lista2) {
		for (Number numeros : lista1) {
			lista2.add(numeros);
		}
	}
	
	public static void printarLista(List<Object> lista) {
		for (Object a : lista) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	

}
