package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import Entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		
		List <Produtos> lista = new ArrayList<>();
		
		lista.add(new Produtos("TV", 900.00));
		lista.add(new Produtos("Fone", 100.00));
		lista.add(new Produtos("Relógio", 60.00));
		
		Predicate <Produtos> predicateProdutos = p -> p.getPreco() > 100;
		
		lista.removeIf(predicateProdutos);
		
		for (Produtos l : lista) {
			System.out.println(l.getNome() + ", " + String.format("%.2f", l.getPreco()));
		}

	}

}
