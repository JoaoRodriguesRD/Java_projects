import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Principal {

	private static final int M = 61;

	public static void main(String[] args) {
		String diretorio = args[0];
		String data = "";
		SeparateChainingHashST<String, Integer> tabelaPrincipal = new SeparateChainingHashST<>();

		// Try-catch para ler o arquivo
		try {
			data = new String(Files.readAllBytes(Paths.get(diretorio))); // guarda o conteudo do arquivo na String data
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERRO DE LEITURA!");
		}

		// retirei todos os caracteres especiais e quebras de linha desnecessarios
		data = removerCaracteresEspeciais(data);

		// Separei cada palavra em um array de string por espaco
		String[] palavras = data.split(" ");
		// utilizei HashSet para criar um array sem palavras repetidas
		String[] palavras_sem_rep = new HashSet<String>(Arrays.asList(palavras)).toArray(new String[0]);

		// adaptei o codigo do slide para fazer logo o hashCode de cada palavra
		// e adicionei no array minhaTabelaDeValoresParaOGrafo para utilizar no grafico em txt
		ArrayList<Integer> minhaTabelaDeValoresParaOGrafo = new ArrayList<Integer>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			int h = 0;
			for (int j = 0; j < palavras_sem_rep[i].length(); j++) {
				h = (31 * h + palavras_sem_rep[i].charAt(j)) % M;
				//Coloco na tabela HashST a chave e seu valor
				tabelaPrincipal.put(palavras_sem_rep[i], h);
				
			}
			// Fiz meu histograma usando texto
			//A String graf representa uma unidade no grafico de HashCode
			String graf = "";
			for (int k = 0; k < h; k++) {
				graf = graf + "-";
			}
			palavras_sem_rep[i] = graf + "| " + palavras_sem_rep[i];
			minhaTabelaDeValoresParaOGrafo.add(h);
		}
		
		try {

			
			BufferedWriter writer = new BufferedWriter(new FileWriter(".\\histograma"+"M="+M+".txt"));
			writer.write("FORMATO:  GRAFICO | PALAVRA | HASHCODE(HC)\n");
			for (int i = 0; i < palavras_sem_rep.length; i++) {
				String pedacoDoHistograma = palavras_sem_rep[i] + " | HC = " + minhaTabelaDeValoresParaOGrafo.get(i) + " |";
				System.out.println(pedacoDoHistograma);
				writer.write(pedacoDoHistograma + "\n");
			}
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	//metodo para remover caracteres especiais
	private static String removerCaracteresEspeciais(String data) {
		data = data.replace(",", " ");
		data = data.replace(".", " ");
		data = data.replace("?", " ");
		data = data.replace("\"", " ");
		data = data.replace("\'", " ");
		data = data.replace("\\", " ");
		data = data.replace("/", " ");
		data = data.replace("`", " ");
		data = data.replace(";", " ");
		data = data.replace("!", " ");
		data = data.replace("-", " ");
		data = data.replace("(", " ");
		data = data.replace(")", " ");
		data = data.replace("[", " ");
		data = data.replace("]", " ");
		data = data.replace("_", " ");
		data = data.replace(":", " ");
		data = data.replace("*", " ");
		data = data.replace("#", " ");
		data = data.replace("$", " ");
		data = data.replace("%", " ");
		data = data.replace("  ", " ");
		data = data.replace("\r", " ");
		data = data.replace("\n", " ");
		return data;

	}

}
