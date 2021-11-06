package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Contribuintes;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;

public class ProgramaContribuintes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuintes> listaContribuintes = new ArrayList<>();

		System.out.print("Número de contribuintes: ");
		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= N; i++) {
			System.out.println("\nDados do contribuinte #" + i);
			System.out.print("Pessoa fisica ou jurídica (f/j)? ");
			String resp = sc.next().substring(0, 1).toUpperCase();
			sc.nextLine();
			if (!(resp.equals("F") || resp.equals("J"))) {
				System.out.println("Digitação incorreta");
				continue;
			}
			System.out.print("Nome: ");
			String nome = letraMaiuscula(sc.nextLine(), "");
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (resp.equals("F")) {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				listaContribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				listaContribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}

		sc.close();

		System.out.println("\nIMPOSTOS PAGOS:");
		for (Contribuintes lista : listaContribuintes) {
			System.out.println(lista.getNome() + ": $" + String.format("%.2f", lista.imposto()));
		}

		double soma = 0.0;
		for (Contribuintes lista : listaContribuintes) {
			soma += lista.imposto();
		}
		System.out.println("\nIMPOSTOS TOTAIS:\n$" + String.format("%.2f", soma));

	}

	public static String letraMaiuscula(String nome, String nomeCompleto) {
		nomeCompleto = "";
		String[] vetorNome = nome.split(" ");
		int tamVetor = vetorNome.length;

		for (int i = 0; i < tamVetor; i++) {
			String nomeSeparado = vetorNome[i];
			nome = nomeSeparado.substring(0, 1).toUpperCase().concat(nomeSeparado.substring(1));
			nomeCompleto += nome.concat(" ");
		}
		return (nomeCompleto);

	}
}
