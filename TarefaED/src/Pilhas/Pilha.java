package Pilhas;
public class Pilha<Item> {
	private Item[] stack;
	private int n;
	
	@SuppressWarnings("unchecked")
	public Pilha(int TAM) {
		stack = (Item[]) new Object[TAM];
		n = 0;
	}
	public void push(Item item) {
		if (n < stack.length) {
			stack[n] = item;
			n++;
		} else {
			 resize();
			 push(item);
		}
	}
	public Item pop() {
		Item item = stack[n-1];
		n--;
		if((float)n/stack.length <= 0.25) {
			resize();
		}
		return item;
	}
	
	public boolean isEmpty() {
		return (n==0);
	}
	public int size() {
		return n;
	}
	
	
	public String listar() {
		String str = "Pilha: ";
		Pilha<Item> aux = new Pilha<Item>(n);
		Item elemento;	
		while(!isEmpty()) {
			elemento = pop();
			aux.push(elemento);
		}
		while(!aux.isEmpty()) {
			elemento = aux.pop();
			str += elemento + " ";
			push(elemento);
		} 
		return str;
	}
	
	public float porcentagem() {
		
		return (float)n/stack.length*100;
	}
	
	public int tamanhoVetor() {
		return stack.length;
	}
	
	@SuppressWarnings("unchecked")
	private void resize() {
		if((float)n/stack.length <= 0.25) {//tem que diminuir
			Item[] auxStack;
			int novo_tamanho;		
			if(2%stack.length==0) {
				novo_tamanho = stack.length/2;
			}else {
				novo_tamanho = stack.length/2 + 1;
			}
			auxStack = (Item[]) new Object[novo_tamanho];	
			System.arraycopy(stack, 0, auxStack, 0, auxStack.length);		
			stack =(Item[]) new Object[novo_tamanho];
			System.arraycopy(auxStack, 0, stack, 0, auxStack.length);			
			return;
		}		
		if(n == stack.length) {//tem que aumentar
			Item[] auxStack;
			int novo_tamanho = stack.length*2;
			auxStack = (Item[]) new Object[novo_tamanho];		
			System.arraycopy(stack, 0, auxStack, 0,stack.length);		
			stack = (Item[]) new Object[novo_tamanho];
			System.arraycopy(auxStack, 0, stack, 0, auxStack.length);	
			return;
		}	
	}
	
	
	
}
