package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import Entidades.EntradaLogin;

public class Programa {

	public static void main(String[] args) {
		
		String caminhoArquivo = new String("c:\\temp\\exSet.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			
			Set<EntradaLogin> set = new HashSet<>();
			
			String linha = br.readLine();
			while (linha != null) {
				String[] infoLinha = linha.split(" ");
				String nome = infoLinha[0];
				Date data = Date.from(Instant.parse(infoLinha[1]));
			
				set.add(new EntradaLogin(nome, data));
				
				linha = br.readLine();
			}
			
			System.out.println("Total de usuários: " + set.size());
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		} 

	}

}
