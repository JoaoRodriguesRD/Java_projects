package filaComPrioridade;


public class FilaPrioridade<Item>{
	
	private Node<Item> inicio;
	private Node<Item> fim;
	private int n;

	public class Node<Item> {
		Item elem;
		Node<Item> prox;
	}

	public FilaPrioridade() {
		inicio = null;
		fim = null;
		n = 0;
	}

	public boolean isEmpty() {
		return fim == null;
	}

	public int size() {
		return n;
	}

	public void insert(Item el) {
		Node<Item> aux = new Node<Item>();
		aux.elem = el;
		aux.prox = null;
		if (fim == null) {
			fim = aux;
			inicio = aux;
		} else {
			fim.prox = aux;
			fim = aux;
		}
		n++;
	}

	public Item remove() {
		Node<Item> aux = inicio;
		if (inicio == fim) {
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.prox;
		}
		n--;
		return aux.elem;
	}

	public String toString() {
		String str = "";
		Node<Item> aux = inicio;

		while (aux != null) {
			str += aux.elem + " - ";
			aux = aux.prox;
		}

		return str;
	}
	
	
}
