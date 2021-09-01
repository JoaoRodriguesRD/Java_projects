package classesBoas;
import javax.swing.JOptionPane;

public class ClientePilhaDinamica {

	public static void main(String[] args) {
		Pilha<String> p1 = new Pilha<String>(3);
		while (true) {
			String str;
			int opcao=0;
			String op = JOptionPane.showInputDialog("Menu de Opções:\n" 
			        + "1. Empilhar coisa\n"
			        + "2. Desempilhar coisa\n"  
					+ "3. Mostrar pilha\n"
					+ "4. Tamanho da pilha\n"
					+ "5. Porcentagem de Ocupação\n"
					+ ""
					+ "0. Sair\n");
			if (op != null)
				opcao = Integer.parseInt(op);
			switch (opcao) {
			case 1:
				str = JOptionPane.showInputDialog("Nome da coisa?");
				p1.push(str);;
				break;
			case 2:
				if (!p1.isEmpty()) {
					str = (String) p1.pop();
					JOptionPane.showMessageDialog(null, str + " foi removido(a)");
				} else
					JOptionPane.showMessageDialog(null, "Pilha vazia");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, p1.listar());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Tamanho da pilha: " + p1.size());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Quantidade de itens: " + p1.size()
						+ "\nTamanho do vetor de pilha: "+ p1.tamanhoVetor()
						+ "\nOcupado: " +p1.porcentagem()+"%");
				break;
			default:
				return;
			}
		}
	}
}