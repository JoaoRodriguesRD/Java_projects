package filaComPrioridade;

import javax.swing.JOptionPane;

public class ProcessoDaFila {

	public static FilaNormal<String> fila = new FilaNormal<String>();

	public static FilaPrioridade<String> filaP = new FilaPrioridade<String>();

	public static FilaNormal<String> atendidos = new FilaNormal<String>();

	public static int quantidadeAtendidos = 0;

	public static void main(String[] args) {
		while (true) {
			String cliente = "";
			int opcao = 0;
			String op = JOptionPane.showInputDialog("Menu de Opcoes:\n" + "1.Chegada Cliente\n"
					+ "2.Chegada Cliente com prioridade\n" + "3.Atender \n" + "4.Listar a fila\n" + "0.Sair");
			if (op != null)
				opcao = Integer.parseInt(op);
			switch (opcao) {
			case 1:

				cliente = JOptionPane.showInputDialog("Digite o Cliente a ser inserido: ");
				if (cliente.equals("")) {
					JOptionPane.showMessageDialog(null, "Nao foi digitado");
					break;
				}
				fila.insert(cliente);
				JOptionPane.showMessageDialog(null, cliente + " foi posto na fila");
				break;
			case 2:

				cliente = JOptionPane.showInputDialog("Digite o Cliente prioritario a ser inserido: ");
				if (cliente.equals("")) {
					JOptionPane.showMessageDialog(null, "Nao foi digitado");
					break;
				}

				filaP.insert(cliente);

				JOptionPane.showMessageDialog(null, cliente + " foi posto na fila");
				break;

			case 3:

				String proximoCliente;

				if (filaP.isEmpty() && fila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nao existe ninguém na Fila...");
					break;
				}

				if (filaP.isEmpty()) {
					proximoCliente = fila.remove();
					atendidos.insert(proximoCliente);
					JOptionPane.showMessageDialog(null, proximoCliente + " foi atendido");
					quantidadeAtendidos++;
				} else {
					proximoCliente = filaP.remove();
					atendidos.insert(proximoCliente);
					JOptionPane.showMessageDialog(null, proximoCliente + " foi atendido");
					quantidadeAtendidos++;
				}
				break;

			case 4:
				JOptionPane.showMessageDialog(null,
						"Fila: " + filaP + fila);
				break;

			case 0:
				if ((fila.size() > 0) || (filaP.size() > 0)) {
					JOptionPane.showMessageDialog(null, " A fila ainda nao esta vazia");
				} else {
					JOptionPane.showMessageDialog(null,
							"Ordem de atendidos: " + atendidos + "\nQuantidade de atendidos: " + quantidadeAtendidos);
					return;
				}
			}
		}
	}

}
