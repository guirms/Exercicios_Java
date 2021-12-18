import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileeBuffedReaderProg {

	public static void main(String[] args) {

		String caminhoArquivo = new String("c:\\temp\\texto.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		} 
	}
}