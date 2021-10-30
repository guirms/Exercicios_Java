package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import Entities.Cliente;
import Entities.ItemPedido;
import Entities.Pedido;
import Entities.Produto;
import EntitiesEnum.StatusPedido;

public class ProgramaPrincipal2 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("DADOS DO CLIENTE");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNascimento = sdf2.parse(sc.next());
		sc.nextLine();
		System.out.println("\nDADOS DOS PRODUTOS");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("Quantidade de produtos: ");
		int qtd = sc.nextInt();
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		Pedido pedido = new Pedido(new Date(), StatusPedido.valueOf(status), cliente);
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println("\nDados do produto #" + i);
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
