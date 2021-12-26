package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import Entidades.Votos;

public class ProgramaVotos {

	public static void main(String[] args) {

		String caminhoArquivo = new String("c:\\temp\\exercicioMap.txt");
		Map<String, Integer> votos = new TreeMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] infoLinha = linha.split(",");
				String nomeCandidato = infoLinha[0];
				int numeroVotos = Integer.parseInt(infoLinha[1]);
				Integer votosSoma = votos.get(nomeCandidato);
				Votos votosEntidade = new Votos(nomeCandidato, numeroVotos, votosSoma);
				votos.put(votosEntidade.getNomeCandidato(), votosEntidade.getVotosCandidato());
				linha = br.readLine();
			}

			for (String chave : votos.keySet()) {
				System.out.println(chave + ": " + votos.get(chave));
			}

		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		}

	}

}
