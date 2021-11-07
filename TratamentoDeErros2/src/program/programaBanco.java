package program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.ErroBanco;

public class programaBanco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite os dados da conta: ");
			System.out.print("Número da conta: ");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome do titular: ");
			String nome = sc.nextLine();
			System.out.print("Saldo inicial da conta: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();

			Conta conta = new Conta(numero, nome, saldo, limiteSaque);

			System.out.println("\nDigite o valor do saque: ");
			System.out.print("Valor saque: ");
			double valorSaque = sc.nextDouble();
			conta.saque(valorSaque);
			System.out.println("Novo saldo: $" + conta.getSaldo());
			} 
		catch (ErroBanco ed) {
			System.out.println(ed.getMessage());
		}
		catch (InputMismatchException ime) {
			System.out.println("Informações digitadas incorretamente");
		}
		
		sc.close();

	}
}
