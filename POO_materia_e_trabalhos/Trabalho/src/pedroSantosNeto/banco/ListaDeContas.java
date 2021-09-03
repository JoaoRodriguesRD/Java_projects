package pedroSantosNeto.banco;

public class ListaDeContas {
	private Conta conta;
	private ListaDeContas prox;
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public ListaDeContas getProx() {
		return prox;
	}

	public void setProx(ListaDeContas prox) {
		this.prox = prox;
	}

	public void inserir(Conta c) {
		if (conta == null) {
			conta = c;
			prox = new ListaDeContas();
		} else {
			prox.inserir(c);
		}
	}
	
	public Conta pesquisar(int num) {
		if (conta == null) {
			return null;
		}
		if (conta.getNumero() == num) {
			return conta;
		} else {
		  return prox.pesquisar(num);
		}
	}
	
	public void remover(int num) {
		if (conta == null) {
			return;
		}
		if (conta.getNumero() == num) {
			conta = prox.getConta();
			prox = prox.getProx();
		} else {
		    prox.remover(num);
		}
	}
	
	

}
