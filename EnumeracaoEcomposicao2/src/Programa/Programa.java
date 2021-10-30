package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.ItemPedido;
import Entidades.Pedido;
import Entidades.Produto;
import EntidadesEnum.Status;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados do cliente:\n");
		System.out.print("Nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Email do cliente: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date data = sdf1.parse(sc.next());
		System.out.println("\nDados do produto: ");
		sc.nextLine();
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("Quantos itens serão cadastrados: ");
		int quantidade = sc.nextInt();
		
		Cliente cliente = new Cliente(nomeCliente, email, data);
		Pedido pedido = new Pedido(new Date(), Status.valueOf(status),  cliente);
		
		for (int i = 1 ; i <= quantidade ; i++) {
			System.out.println("\nProduto #" + i);
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade do produto: ");
			int quantidadeProduto = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			ItemPedido item = new ItemPedido(quantidadeProduto, precoProduto, produto);
			pedido.adicionarItem(item);
		}
		
		System.out.println(pedido);
	}

}
