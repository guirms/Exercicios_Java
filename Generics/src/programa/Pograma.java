package programa;

import java.util.Scanner;

import entidades.Entidades;

public class Pograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);			
		Entidades<Integer> ent = new Entidades<>();
		
		System.out.print("N�mero de adi��es � lista: ");
		int N = sc.nextInt();
		
		for (int i = 1 ; i <= N ; i++) {
			System.out.print("N�mero " + i + ": ");
			int valor = sc.nextInt();
			ent.adicionarLista(valor);
		}
		
		ent.printarLista();
		
		sc.close();
	}

}
