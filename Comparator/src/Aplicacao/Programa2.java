package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Entidades.Comparador;
import Entidades.Funcionarios;

public class Programa2 {

	public static void main(String[] args) {

		String caminhoArquivo = new String("c:\\temp\\in.txt");

		List<Funcionarios> lista = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] dados = linha.split(",");
				lista.add(new Funcionarios(dados[0], Double.parseDouble(dados[1])));
				linha = br.readLine();
			}

			Comparator<Funcionarios> comp = (f1, f2) -> f1.getNome().toUpperCase().compareTo(f2.getNome().toUpperCase());

			lista.sort(comp);

			for (Funcionarios dados : lista) {
				System.out.println(dados.getNome() + ", " + dados.getSalario());
			}
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		}

	}
}