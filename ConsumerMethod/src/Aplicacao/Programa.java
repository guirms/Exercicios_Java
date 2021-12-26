package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import Entidades.ConsumerTeste;
import Entidades.Produtos;

public class Programa {

	public static void main(String[] args) {

		List<Produtos> lista = new ArrayList<>();

		lista.add(new Produtos("TV", 900.00));
		lista.add(new Produtos("Fone", 100.00));
		lista.add(new Produtos("Relógio", 60.00));

		Consumer<Produtos> consumerProdutos = p -> p.setPreco(p.getPreco() * 1.1);

		lista.forEach(consumerProdutos);

		lista.forEach(System.out::println);

	}

}
