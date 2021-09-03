package ProgramaQuestao15;

import java.util.PriorityQueue;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		PriorityQueue<Cliente> filaDeClientes = new PriorityQueue<Cliente>();
		
		while (true) {
			int opcao=0;
			String op = JOptionPane.showInputDialog("Menu do Banco:\n" 
			        + "1. Inserir cliente na fila\n"
			        + "2. Atender Cliente\n"  
					+ "3. Olhar a fila\n"
					+ "0. Sair\n");
			if (op != null)
				opcao = Integer.parseInt(op);
			switch (opcao) {
			case 1:
				String nomeDoCliente = JOptionPane.showInputDialog("Qual o nome do cliente?");
				int dinheiroDoCliente = 0;
				String dinheiro = JOptionPane.showInputDialog("Quanto dinheiro(em inteiro) o cliente tem no bolso?");
				if (dinheiro != null)
					dinheiroDoCliente = Integer.parseInt(dinheiro);
				Cliente novo = new Cliente(nomeDoCliente, dinheiroDoCliente);
				filaDeClientes.add(novo);
				break;
			case 2:
				if(!filaDeClientes.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Cliente "+filaDeClientes.poll().nome+ " foi atendido");
				}else{
					JOptionPane.showMessageDialog(null, "a fila nao tem ninguem");
				}
				
				break;
			case 3:
				String fila = "";
				fila = mostrarFila(filaDeClientes);
				JOptionPane.showMessageDialog(null, fila);
				break;
			default:
				return;
			}
		}
	}

	private static String mostrarFila(PriorityQueue<Cliente> filaDeClientes) {
		PriorityQueue<Cliente> aux = new PriorityQueue<Cliente>();
		String msg = "";
		while (!filaDeClientes.isEmpty()) {
			Cliente s = filaDeClientes.poll();
			msg += s.nome+ "-";
			aux.add(s);
			
		}
		
		while(!aux.isEmpty()) {
			Cliente s = aux.poll();
			filaDeClientes.add(s);
		}
		return msg;
	}

}
