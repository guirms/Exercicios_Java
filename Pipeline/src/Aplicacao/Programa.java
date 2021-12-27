package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import Entidades.Produtos;

public class Programa {

	public static void main(String[] args) {

		String caminhoArquivo = new String("c:\\temp\\produtos.txt");
		List<Produtos> lista = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] info = linha.split(",");
				lista.add(new Produtos(info[0], Double.parseDouble(info[1])));
				linha = br.readLine();
			}
			
			double precoMedio = lista.stream().map(x -> x.getPreco()).reduce(0.0, (x, y) -> x + y) / lista.size();
			
			System.out.println("Preço médio: " + String.format("%.2f", precoMedio));
			
			Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
			
			Stream<String> listaNomes = lista.stream().filter(x -> x.getPreco() < precoMedio).map(p -> p.getNome()).sorted(comp.reversed());
			
			System.out.println(Arrays.toString(listaNomes.toArray()));
			
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		}
	}

}
