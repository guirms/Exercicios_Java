import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoJava {

	public static void main(String[] args) {
		
		File arquivo = new File("c:\\temp\\texto.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
