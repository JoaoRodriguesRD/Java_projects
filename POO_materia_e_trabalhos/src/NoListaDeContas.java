public class NoListaDeContas {
	private Conta conta;
	private NoListaDeContas prox;
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public NoListaDeContas getProx() {
		return prox;
	}
	

	public void setProx(NoListaDeContas prox) {
		this.prox = prox;
	}

	public void inserir(Conta c) {
		if (conta == null) {
			conta = c;
			prox = new NoListaDeContas();
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