import java.io.File;
import java.util.Scanner;

public class ManipulandoPasta {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma pasta: ");
		String pastaStr = sc.nextLine();
		sc.close();

		File pasta = new File(pastaStr);
		File[] pastas = pasta.listFiles(File::isDirectory);
		File[] arquivos = pasta.listFiles(File::isFile);
		
		System.out.println("Pastas: ");
		for (File pastaPrint : pastas) {
			System.out.println(pastaPrint);
		}
		System.out.println("\nArquivos: ");
		for (File arquivoPrint : arquivos) {
			System.out.println(arquivoPrint);
		}
		
		boolean sucesso = new File(pastaStr + "\\pastaTeste").mkdir(); //p criar uma pasta
		if (sucesso) {
			System.out.println("\nPasta criada com sucesso");
		}
		
	}
}
