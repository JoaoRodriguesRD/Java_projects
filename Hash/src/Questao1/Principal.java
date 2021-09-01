package Questao1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Principal {

	private static int m = 97;

	public static void main(String[] args) {
		
		String diretorio = args[0];
		String data = "";
		
		// Try-catch para ler o arquivo
		try {
			data = new String(Files.readAllBytes(Paths.get(diretorio))); // guarda o conteudo do arquivo na String data
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERRO DE LEITURA!");
		}
		while(true) {
			Scanner ler = new Scanner(System.in);
			System.out.println("ESCOLHA O TAMANHO DE M:");
			m = ler.nextInt();
			ler.close();
			
			// retirei todos os caracteres especiais e quebras de linha desnecessarios
			data = removerCaracteresEspeciais(data);

			// Separei cada palavra em um array de string por espaco
			String[] palavras = data.split(" ");
			// utilizei HashSet para criar um array sem palavras repetidas
			String[] palavras_sem_rep = new HashSet<String>(Arrays.asList(palavras)).toArray(new String[0]);
			
			// adaptei o codigo do slide para fazer logo o hashCode de cada palavra
			// e concatenei na palavra o seu hash
			ArrayList<Integer> minhaTabela = new ArrayList<Integer>();
			for (int i = 0; i < palavras_sem_rep.length; i++) {
				int h = 0;
				for (int j = 0; j < palavras_sem_rep[i].length(); j++) {
					h = (31 * h + palavras_sem_rep[i].charAt(j)) % m;
				}
				// Fiz meu histograma usando texto
				String graf = "";
				for (int k = 0; k < h; k++) {
					graf = graf + "-";
				}
				palavras_sem_rep[i] = graf + "| " + palavras_sem_rep[i];
				minhaTabela.add(h);
			}
			try {

				BufferedWriter writer = new BufferedWriter(new FileWriter(".\\histograma.txt"));
				
				for (int i = 0; i < palavras_sem_rep.length; i++) {
					String pedacoDoHistograma = palavras_sem_rep[i] + " | HC = " + minhaTabela.get(i) + " |";
					System.out.println(pedacoDoHistograma);
					writer.write(pedacoDoHistograma + "\n");
				}
				writer.close();
				System.out.println("ARQUIVO HISTOGRAMA GERADO!");

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("ERRO AO GERAR O HISTOGRAMA!");
			}
		}
		

	}

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
