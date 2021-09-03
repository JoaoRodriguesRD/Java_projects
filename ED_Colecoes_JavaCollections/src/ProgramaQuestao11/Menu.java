package ProgramaQuestao11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JOptionPane;

import ProgramaQuestoes1_a_9.Armazenador;
import ProgramaQuestoes1_a_9.ArrumadorDePalavras;
import ProgramaQuestoes1_a_9.Leitor;


public class Menu {
	public static void main(String[] args) {
		String resultados = "";
		String dado = "";
		long start;
		//Lisbon, NASA, Kyunghee,
		//Konkuk, Sogang, momentarily, rubella, vaccinations, government, Authorities.
		String[] palavrasParaBuscar = {"Lisbon","NASA","Kyunghee","Konkuk","Sogang","momentarily","rubella","vaccinations","government","Authorities"};
		
		String data = Leitor.ler();
		
		if (data == "") {
			JOptionPane.showMessageDialog(null, "arquivo .txt esta vazio!");
			return;
		}

		JOptionPane.showMessageDialog(null, "organizando palavras nao repetidas...\npode demorar um pouco");
		String[] palavras_sem_rep = ArrumadorDePalavras.arrumar(data);

		while (true) {
			int opcao=0;
			String op = JOptionPane.showInputDialog("Teste de tempo de buscar com colecoes:\n" 
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
				Vector<String> Vet = Armazenador.armazenarEmVector(palavras_sem_rep);
				
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmVector(palavrasParaBuscar, Vet);
				}

				long tempoVet = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em Vector:\n" + tempoVet + "ns";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);

				break;
			case 2:
				LinkedList<String> LL = Armazenador.armazenarEmLinkedList(palavras_sem_rep);
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmLinkedList(palavrasParaBuscar,LL);
				}
				long tempoLL = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em LinkedList:\n" + tempoLL + "ns";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 3:
				ArrayList<String> AL = Armazenador.armazenarEmArrayList(palavras_sem_rep);
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmArrayList(palavrasParaBuscar,AL);
				}

				long tempoAL = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em ArrayList:\n" + tempoAL + "ns";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 4:
				HashSet<String> HS = Armazenador.armazenarEmHashSet(palavras_sem_rep);
				start = System.nanoTime();
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmHashSet(palavrasParaBuscar,HS);
				}
				
				long tempoHS = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em HashSet:\n" + tempoHS + "ns";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 5:
				LinkedHashSet<String> LHS = Armazenador.armazenarEmLinkedHashSet(palavras_sem_rep);
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmLinkedHashSet(palavrasParaBuscar,LHS);
				}

				long tempoLHS = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em LinkedHashSet:\n" + tempoLHS + "ns";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 6:
				TreeSet<String> TS = Armazenador.armazenarEmTreeSet(palavras_sem_rep);
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmTreeSet(palavrasParaBuscar,TS);
				}

				long tempoTS = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em TreeSet:\n" + tempoTS + "ns";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 7:
				HashMap<String, Integer> HM = Armazenador.armazenarEmHashMap(palavras_sem_rep);
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmHashMap(palavrasParaBuscar,HM);
				}

				long tempoHM = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em HashMap:\n" + tempoHM + "ns";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 8:
				LinkedHashMap<String, Integer> LHM = Armazenador.armazenarEmLinkedHashMap(palavras_sem_rep);
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmLinkedHashMap(palavrasParaBuscar,LHM);
				}

				long tempoLHM = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em LinkedHashMap:\n" + tempoLHM + "ns";
				resultados += dado + "\n";
				JOptionPane.showMessageDialog(null, dado);
				break;
			case 9:
				TreeMap<String, Integer> TM = Armazenador.armazenarEmTreeMap(palavras_sem_rep);
				start = System.nanoTime();
				for (int i = 0; i < 10; i++) {
					Buscador.buscarEmTreeMap(palavrasParaBuscar,TM);
				}

				long tempoTM = (long) (System.nanoTime() - start)/10;
				dado = "tempo para buscar as palavras em TreeMap:\n" + tempoTM + "ns";
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
