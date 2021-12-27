package Aplicacao;

import java.util.ArrayList;
import java.util.List;

import Entidades.Produtos;
import Entidades.SomarProdutos;

public class Programa {

	public static void main(String[] args) {

		List<Produtos> lista = new ArrayList<>();

		lista.add(new Produtos("TV", 900.00));
		lista.add(new Produtos("Tablet", 1300.50));
		lista.add(new Produtos("Fone", 100.00));
		lista.add(new Produtos("Relógio", 60.00));
		
		double produtosSomados = SomarProdutos.filtroSoma(lista, p -> p.getNome().toUpperCase().charAt(0) == 'T');
		
		System.out.println(String.format("%.2f", produtosSomados));
	
	}

}
