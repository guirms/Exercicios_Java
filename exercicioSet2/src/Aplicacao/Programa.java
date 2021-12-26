package Aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import Entidades.AlunosCurso;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<AlunosCurso> alunosCurso = new HashSet<>();

		String[] cursos = { "A", "B", "C" };

		for (int i = 0; i < 3; i++) {
			System.out.print("Quantidade de estudantes do curso " + cursos[i] + ": ");
			int quantidade = sc.nextInt();

			for (int j = 0; j < quantidade; j++) {
				int alunoId = sc.nextInt();
				alunosCurso.add(new AlunosCurso(alunoId));
			}
		}
		
		System.out.println("Total de alunos: " + alunosCurso.size());

	}

}
