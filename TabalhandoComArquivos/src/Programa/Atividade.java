package Programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Atividade {

	public static void main(String[] args) {

		String caminhoPrograma = ("C:\\temp\\ws-eclipse\\TabalhandoComArquivos\\ProgramaArquivos\\Produtos.txt");
		String caminhoPrecoFinal = ("C:\\temp\\ws-eclipse\\TabalhandoComArquivos\\ProgramaArquivos\\Total.txt");
	
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoPrograma))) {
			String linha = br.readLine();
			while (linha != null) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoPrecoFinal))){
					String[] vetorLinha = linha.split(", ");
					double precoFinal = Double.parseDouble(vetorLinha[1]) * Integer.parseInt(vetorLinha[2]);
					bw.write(vetorLinha[0] + ", " + precoFinal);
					linha = br.readLine();
					bw.newLine();
				}catch (IOException IO) {
					System.out.println("Erro encontrado: " + IO.getMessage());
					break;
				}catch (NumberFormatException nfe) {
					System.out.println("Erro encontrado no arquivo: " + nfe.getMessage());
					break;
				}finally {
					System.out.println("Sucesso na conversão de preços");
				}
			}
			
			
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		}
	}

}
