package Printer;

public class ListaPrinter<Item>{
	private Node<Item> inicio;
	private int n;
	
	
	@SuppressWarnings("hiding")
	public class Node<Item>{
		public Item elemento = null;
		private Node<Item> prox = null;
	}
	
	public ListaPrinter(){
		inicio = null;
		n = 0;
	}
	
	public void insert(Item inserido) {
		Node<Item> novo = new Node<Item>();
		novo.elemento = inserido;
		novo.prox = null;
		if(inicio==null) {
			inicio = novo;
		}else {		
			novo.prox = inicio;
			inicio = novo;
		}
		n++;
	}
	
	public boolean remove(Item inserido) {
		
		if(inicio.elemento.equals(inserido)) {//No começo
			inicio = inicio.prox;
			return true;
		}
		
		Node<Item>aux = new Node<Item>();
		aux = inicio;
		Node<Item>ant = new Node<Item>();
		ant = inicio;
		while(aux != null){
			if (aux.elemento.equals(inserido)) {
				ant.prox = aux.prox;
				return true;
			}
			else {
				ant = aux;
				aux = aux.prox;
			}
		}
		return false;
    }
	
	
	
	public boolean search(Item inserido) {
		Node<Item> aux = new Node<Item>();
		aux = inicio;
		while(aux != null) {
			if(aux.elemento.equals(inserido)) {
				
				return true;
			}else {
				aux = aux.prox;
			}
		}
		return false;
	}
	
	
	public boolean isEmpty() {
		
		return (inicio==null);
	}
	
	public String toString() {
		Node<Item>aux = new Node<Item>();
		aux = inicio;
		String str = "Lista: ";
		while(aux!=null) {
			str += (aux.elemento + " ");
			aux = aux.prox;
			}
		return str;
	}
}
