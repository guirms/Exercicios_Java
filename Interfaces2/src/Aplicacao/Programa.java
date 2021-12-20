package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Model.Entidades.Contrato;
import Model.Servicos.ServicoPayPal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.nextLine());
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Número de parcelas: ");
		int numParcelas = sc.nextInt();
		sc.close();
		
		Contrato contrato = new Contrato(numero, numParcelas, data, preco, new ServicoPayPal());
		contrato.printarParcelas();
	}

}
