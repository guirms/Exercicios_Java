package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionarioTerceirizado;

public class ProgramaFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> listaFuncionario = new ArrayList<>();
		Funcionario f2 = new Funcionario();

		System.out.print("Número de funcionários: ");
		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= N; i++) {
			System.out.println("\nDados do funcionário #" + i);
			System.out.print("Terceirizado? (S/N): ");
			String resp = sc.next().substring(0, 1).toUpperCase();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = f2.setNome(sc.nextLine(), "");
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			sc.nextLine();
			System.out.print("Valor por hora trabalhada: ");
			double valorHora = sc.nextDouble();
			if (resp.equals("S")) {
				System.out.print("Valor despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				Funcionario funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horas, valorHora, despesaAdicional);
				listaFuncionario.add(funcionarioTerceirizado);
			} else {
				Funcionario funcionario = new Funcionario(nome, horas, valorHora);
				listaFuncionario.add(funcionario);
			}
		}
		
		sc.close();

		for (Funcionario lista : listaFuncionario) {
			System.out.print("\n" + lista.getNome() + " - " + lista.pagamento());
		}
	}

}

