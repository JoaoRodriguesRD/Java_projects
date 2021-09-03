package ProgramaQuestoes1_a_9;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Menu {

	public static void main(String[] args) {
		String resultados = "";
		String dado = "";
		String data = Leitor.ler();
		if (data == "") {
			JOptionPane.showMessageDialog(null, "arquivo .txt esta vazio!");
			return;
		}
		
		JOptionPane.showMessageDialog(null, "organizando palavras nao repetidas...\npode demorar um pouco");
		String[] palavras_sem_rep = ArrumadorDePalavras.arrumar(data);
		
		while (true) {
			int opcao=0;
			String op = JOptionPane.showInputDialog("Teste de tempo de inserir com colecoes:\n" 
			        + "1. Vector \n"
			        + "2. LinkedList\n"
					+ "3. ArrayList\n"
					+ "4. HashSet\n"
					+ "5. LinkedHashSet\n"
					+ "6. TreeSet\n"
					+ "7. HashMap\n"
					+ "8. LinkedHashMap\n"
					+ "9. TreeMap\n"
					+ "10. Resultados obtidos\n"
					+ "0. Sair\n");
			if (op != null)
				opcao = Integer.parseInt(op);
			switch (opcao) {
			case 1:
				StopWatch watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					Vector<String> Vet = Armazenador.armazenarEmVector(palavras_sem_rep);
				}

				double tempoVet = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em Vector:\n" + tempoVet + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);

				break;
			case 2:
				watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					LinkedList<String> LL = Armazenador.armazenarEmLinkedList(palavras_sem_rep);
				}
				double tempoLL = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em LinkedList:\n" + tempoLL + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 3:
				watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					ArrayList<String> AL = Armazenador.armazenarEmArrayList(palavras_sem_rep);
				}

				double tempoAL = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em ArrayList:\n" + tempoAL + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 4:
				watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					HashSet<String> HS = Armazenador.armazenarEmHashSet(palavras_sem_rep);
				}

				double tempoHS = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em HashSet:\n" + tempoHS + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 5:
				watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					LinkedHashSet<String> LHS = Armazenador.armazenarEmLinkedHashSet(palavras_sem_rep);
				}

				double tempoLHS = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em LinkedHashSet:\n" + tempoLHS + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 6:
				watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					TreeSet<String> TS = Armazenador.armazenarEmTreeSet(palavras_sem_rep);
				}

				double tempoTS = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em TreeSet:\n" + tempoTS + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 7:
				watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					HashMap<String, Integer> HM = Armazenador.armazenarEmHashMap(palavras_sem_rep);
				}

				double tempoHM = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em HashMap:\n" + tempoHM + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 8:
				watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					LinkedHashMap<String, Integer> LHM = Armazenador.armazenarEmLinkedHashMap(palavras_sem_rep);
				}

				double tempoLHM = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em LinkedHashMap:\n" + tempoLHM + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 9:
				watch = new StopWatch();
				for (int i = 0; i < 10; i++) {
					TreeMap<String, Integer> TM = Armazenador.armazenarEmTreeMap(palavras_sem_rep);
				}

				double tempoTM = watch.elapsedTime() / 10;
				dado = "tempo para adicionar as palavras em TreeMap:\n" + tempoTM + "ms";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 10:
				if(resultados != "") {
					JOptionPane.showMessageDialog(null, resultados);
				}else {
					JOptionPane.showMessageDialog(null, "Nenhuma colecao foi utilizada, escolha primeiro de 1 a 9");
				}
				
				break;
			case 0:
				return;
			default:
				return;
			}
		}
	}
	
	
	
	
	
	
}