package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import Entities.HoraContrato;
import Entities.Departamento;
import Entities.Trabalhador;
import EntitiesEnum.NivelTrabalhador;

public class ProgramaPrincipal {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");

		System.out.print("Nome do departamento: ");
		String departamento = sc.nextLine();
		System.out.print("Nome do funcion�rio: ");
		String nome = sc.nextLine();
		System.out.print("N�vel do funcion�rio: ");
		String nivel = sc.nextLine();
		System.out.print("Base salarial do funcion�rio: ");
		double basesalarial = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel), basesalarial, new Departamento(departamento));

		System.out.print("N�mero de contratos: ");
		int nContratos = sc.nextInt();

		for (int i = 1; i <= nContratos; i++) {
			System.out.println("\nContato: " + i);
			System.out.print("Data: ");
			Date data = sdf1.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Dura��o do contrato em horas: ");
			int horas = sc.nextInt();
			HoraContrato contratoPorHora = new HoraContrato(data, valorHora, horas);
			trabalhador.adicionarContrato(contratoPorHora);
		}
		
		System.out.print("\nM�s e ano para an�lise (MM/yyyy)");
		Date data2 = sdf2.parse(sc.next());
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data2);
		
		int mes = cal.get(Calendar.MONTH) + 1;
		int ano = cal.get(Calendar.YEAR);
		
		System.out.print("Nome: " + trabalhador.getNome());
		System.out.print(" ; Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println(" ; Renda em " + sdf2.format(data2) + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));

		sc.close();
	}

}
