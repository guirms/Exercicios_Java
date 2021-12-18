package Program;

public class Capitalize {

	public static void main(String[] args) {
		String nome = "your name";
		System.out.println(letraMaiuscula(nome, ""));

	}

	public static String letraMaiuscula(String nome, String nomeCompleto) {
		nomeCompleto = "";
		String[] vetorNome = nome.split(" ");
		int tamVetor = vetorNome.length;

		for (int i = 0; i < tamVetor; i++) {
			String nomeSeparado = vetorNome[i];
			nome = nomeSeparado.substring(0, 1).toUpperCase().concat(nomeSeparado.substring(1));
			nomeCompleto += nome.concat(" ");
		}
		return (nomeCompleto);

	}

}
