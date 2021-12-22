package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		String caminhoArquivo = new String("c:\\temp\\in.txt");
		
		List<Funcionario> lista = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] dados = linha.split(",");
				lista.add(new Funcionario(dados[0], Double.parseDouble(dados[1])));
				linha = br.readLine();
			}
			
			Collections.sort(lista);
			for (Funcionario dados : lista) {
				System.out.println(dados.getNome() + ", " + dados.getSalario());
			}
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		}

	}
}
