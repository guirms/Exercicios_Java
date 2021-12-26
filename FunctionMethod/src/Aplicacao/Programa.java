package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import Entidades.Produtos;
import Entidades.UpperCaseNome;

public class Programa {

	public static void main(String[] args) {

		List<Produtos> lista = new ArrayList<>();

		lista.add(new Produtos("TV", 900.00));
		lista.add(new Produtos("Fone", 100.00));
		lista.add(new Produtos("Relógio", 60.00));

		Consumer<Produtos> consumerProdutos = p -> p.setPreco(p.getPreco() * 1.1);
		
		//map so funciona em stream
		//Function<Produtos, String> functionMetodo = p -> p.getNome().toUpperCase(); (método lambda)
		List<String> nomes = lista.stream().map(new UpperCaseNome()).collect(Collectors.toList()); //converter lista pra stream e stream pra lista de novo
		
		nomes.forEach(System.out::println); //printar listas de uma só vez a partir de funções internas do método System.out

	}

}
