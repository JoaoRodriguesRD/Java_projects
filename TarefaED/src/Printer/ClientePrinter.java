package Printer;


import javax.swing.JOptionPane;

public class ClientePrinter {
	
	public static void main(String[] args) {
		ListaPrinter<String> lista = new ListaPrinter<String>();
		while (true) {
			String str;
			int opcao=0;
			String op = JOptionPane.showInputDialog("Menu de Opções:\n" 
			        + "1. Solicitar impressão\n"
			        + "2. Atender pedido\n"  
					+ "3. Cancelar um pedido ainda não atendido\n"
					+ "4. listar os pedidos\n"
					+ "0. Sair\n");
			if (op != null)
				opcao = Integer.parseInt(op);
			switch (opcao) {
			case 1:
				str = JOptionPane.showInputDialog("Solicitar impressão de:");
				lista.insert(str);
				break;
			case 2:
				str = JOptionPane.showInputDialog("Atender impressão de:");
				if(lista.search(str)) {
					lista.remove(str);
					JOptionPane.showMessageDialog(null, str + " Atendido!");
				}else {
					JOptionPane.showMessageDialog(null, str + " Não Foi encontrado...");
				}
				break;
			case 3:
				str = JOptionPane.showInputDialog("Cancelar impressão de:");
				if(lista.search(str)) {
					lista.remove(str);
					JOptionPane.showMessageDialog(null, str + " teve a impressão cancelada.");
				}else {
					JOptionPane.showMessageDialog(null, str + " Não Foi encontrado...");
				}
				break;
			case 4:
				JOptionPane.showMessageDialog(null,lista);
				break;
			default:
				return;
			}
		}
	}

}
