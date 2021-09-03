package ProgramaQuestoes1_a_9;
import java.util.Arrays;
import java.util.HashSet;

public class ArrumadorDePalavras {
	
	  
	  
	  
	/**
     *  Arruma uma String para um array de String
     * sem repeticao e sem caracteres especiais.
     * @param string de dados
     */
	public static String[] arrumar(String data) {
		data = removerCaracteresEspeciais(data);
		String[] palavras = data.split(" ");
		String[] palavras_sem_rep = new HashSet<String>(Arrays.asList(palavras)).toArray(new String[0]);
		return palavras_sem_rep;
		
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
