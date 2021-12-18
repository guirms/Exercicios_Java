package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario2;
import Entidades.FuncionariosTerceirizados2;

public class ProgramaFuncionarios2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario2> listaFuncionario = new ArrayList<>();
		Funcionario2 f2 = new Funcionario2();

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
				Funcionario2 funcionarioTerceirizado = new FuncionariosTerceirizados2(nome, horas, valorHora, despesaAdicional);
				listaFuncionario.add(funcionarioTerceirizado);
			} else {
				Funcionario2 funcionario = new Funcionario2(nome, horas, valorHora);
				listaFuncionario.add(funcionario);
			}
		}

		for (Funcionario2 lista : listaFuncionario) {
			System.out.print("\n" + lista.getNome() + " - " + lista.pagamento());
		}
	}

}
