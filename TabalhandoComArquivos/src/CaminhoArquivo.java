import java.io.File;
import java.util.Scanner;

public class CaminhoArquivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o caminho da pasta: ");
		String caminhoPasta = sc.nextLine();
		
		File pasta = new File(caminhoPasta);
		
		System.out.println("\ngetName: " + pasta.getName());
		System.out.println("\ngetParent: " + pasta.getParent());
		System.out.println("\ngetPath: " + pasta.getPath());
		
		sc.close();
	}

}
