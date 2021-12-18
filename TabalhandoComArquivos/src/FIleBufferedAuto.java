import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleBufferedAuto {

	public static void main(String[] args) {

		String caminhoArquivo = new String("c:\\temp\\texto.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(caminhoArquivo);
			br = new BufferedReader(fr);

			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException IO) {
			System.out.println("Erro encontrado: " + IO.getMessage());
		} finally {
			try {

				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException IO) {
				IO.printStackTrace();
			}
		}
	}

}
