package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		String caminhoArquivo = new String("c:\\temp\\ws-eclipse\\Pipelines2\\funcionariostxt.txt");
		List<Funcionario> lista = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] info = linha.split(", ");
				String nome = info[0];
				String email = info[1];
				Double salario = Double.parseDouble(info[2]);
				lista.add(new Funcionario(nome, email, salario));
				linha = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
					
			List<String> filtro = lista.stream().filter(x -> x.getSalario() > 2000.0).map(x -> x.getEmail()).sorted(comp).collect(Collectors.toList());
			
			filtro.forEach(System.out::println);
			
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		} 

	}

}
