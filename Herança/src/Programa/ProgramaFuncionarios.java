package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionariosTerceirizados;

public class ProgramaFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de funcionários: ");
		int N = sc.nextInt();
		sc.nextLine();

		List<Funcionario> listaFuncionario = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			double despesaAdicional = 0.0;
			System.out.println("\nDados do funcionário #" + i);
			System.out.print("Terceirizado? (S/N): ");
			String resp = sc.next().substring(0, 1).toUpperCase();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			sc.nextLine();
			System.out.print("Valor por hora trabalhada: ");
			double valorHora = sc.nextDouble();
			if (resp.equals("S")) {
				System.out.print("Valor despesa adicional: ");
				despesaAdicional = sc.nextDouble();
				FuncionariosTerceirizados ft = new FuncionariosTerceirizados(nome, horas, valorHora, despesaAdicional);
				Funcionario fun = new Funcionario(nome, horas, valorHora, ft);
				listaFuncionario.add(fun);
			} else {
				FuncionariosTerceirizados ft = new FuncionariosTerceirizados(nome, horas, valorHora, 0.0);
				Funcionario fun = new Funcionario(nome, horas, valorHora, ft);
				listaFuncionario.add(fun);
			}
		}

		System.out.println("\nPAGAMENTOS:");
		for (Funcionario lista : listaFuncionario) {
			System.out.println(lista.getNome() + " - " + lista.pagamento());
		}
	}

}
