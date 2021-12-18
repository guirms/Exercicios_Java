import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Teste 1", "Teste 2", "Teste 3" };
		String caminhoArquivo = new String("c:\\temp\\texto2.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, true))) { //sem o true ele apaga o arquivo e cria outro
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}

		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		}

	}

}
