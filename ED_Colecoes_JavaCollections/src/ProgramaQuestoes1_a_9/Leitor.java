package ProgramaQuestoes1_a_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Leitor {
	
	public static String ler() {
		int leitura = 1;
		String data = "";
		while (leitura == 1) {
			String diretorio = JOptionPane.showInputDialog("insira o diretorio do arquivo .txt");
			try {
				data = new String(Files.readAllBytes(Paths.get(diretorio)));
				leitura = 0;
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "ERRO DE LEITURA!\n" + e);
				int escolha = JOptionPane.showConfirmDialog(null, "deseja tentar novamente?");//0 - sim, 1 - nao, 2 - cancelar
				if(escolha == 1 || escolha == 2) {
					return "";
				}
			}
		}
		return data;
		
		
	}
}
