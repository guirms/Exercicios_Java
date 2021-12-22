package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Entidades.Produto;
import Entidades.ServicoDeCalculo;

public class Programa {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();

		String caminhoArquivo = new String("c:\\temp\\GenericoDelimitado.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] numero = linha.split(",");
				lista.add(new Produto(numero[0], Double.parseDouble(numero[1])));
				linha = br.readLine();
			}
			
			Produto x = ServicoDeCalculo.max(lista);
			System.out.println("Máximo:\n" + x);
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		}

	}

}
