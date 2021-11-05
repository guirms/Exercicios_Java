package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Produtos;
import Entidades.ProdutosImportados;
import Entidades.ProdutosUsados;

public class ProgramaProdutos {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número de produtos: ");
		int N = sc.nextInt();

		List<Produtos> listaProdutos = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			System.out.println("\nProduto #" + i);
			System.out.print("Comúm, usado ou importado (c/u/i)? ");
			String tipo = sc.next().substring(0, 1).toUpperCase();
			sc.nextLine();
			switch (tipo) {
			case ("C"):
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				nome = nome.substring(0, 1).toUpperCase().concat(nome.substring(1));
				System.out.print("Preço: ");
				double preco = sc.nextDouble();
				listaProdutos.add(new Produtos(nome, preco));
				break;
			case ("U"):
				System.out.print("Nome: ");
				nome = sc.nextLine();
				nome = nome.substring(0, 1).toUpperCase().concat(nome.substring(1));
				System.out.print("Preço: ");
				preco = sc.nextDouble();
				System.out.print("Data de fabricação (DD/MM/yyyy): ");
				Date dataFabricacao = sdf1.parse(sc.next());
				listaProdutos.add(new ProdutosUsados(nome, preco, dataFabricacao));
				break;
			case ("I"):
				System.out.print("Nome: ");
				nome = sc.nextLine();
				nome = nome.substring(0, 1).toUpperCase().concat(nome.substring(1));
				System.out.print("Preço: ");
				preco = sc.nextDouble();
				System.out.print("Taxa alfândega: ");
				double taxaAlfandega = sc.nextDouble();
				listaProdutos.add(new ProdutosImportados(nome, preco, taxaAlfandega));
				break;
			default:
				System.out.println("Digitação incorreta");
			}

			for (Produtos lista : listaProdutos) {
				System.out.println(lista.etiqueta());
			}
		}

		sc.close();

	}

}
