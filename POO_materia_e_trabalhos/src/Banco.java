public class Banco {

//	private Conta contas[] = new Conta[10];
	
//	private int indice = 0;
	
	private NoListaDeContas contasNo = new NoListaDeContas();
	
	
	public void cadastrar(Conta nova) {
	//	Conta c = pesquisar(nova.getNumero());
		
		Conta c = contasNo.pesquisar(nova.getNumero());		
		if (c == null) {
			contasNo.inserir(nova);
	//	  contas[indice++] = nova;
		} else {
			System.out.println("Já existe conta cadastrada com esse número.");
		}
	}
	
	public double saldo(int n) {
	//	Conta c = pesquisar(n);
		Conta c = contasNo.pesquisar(n);
		if (c != null) {
	//		return c.getSaldo();
			return c.getSaldo();
		}
		return -999999;
	}

    /*	
	private Conta pesquisar(int n) {	
		for (int i=0; i<indice; i++) {
			if (contas[i].getNumero() == n) {
				return contas[i];
			}
		}
		return null;	
	}
    */
	
	public String extrato(int n) {
	//	Conta c = pesquisar(n);
		Conta c = contasNo.pesquisar(n);
		if (c != null) {
			return c.getExtrato();
		}
		return "";
	}
	
	public void saque(int n, double v) {
    //	Conta c = pesquisar(n);
		Conta c = contasNo.pesquisar(n);
		if (c != null) {
			c.debito(v);
		}
	}

	public void deposito(int n, double v) {
    //	Conta c = pesquisar(n);
		Conta c = contasNo.pesquisar(n);
		if (c != null) {
			c.credito(v);
		}
	}
	
	public void transferencia(int de, int para, double v) {
    //	Conta c1 = pesquisar(de);
    //	Conta c2 = pesquisar(para);
		Conta c1 = contasNo.pesquisar(de);
		Conta c2 = contasNo.pesquisar(para);
		if (c1 != null && c2 != null) {
			if(c1.debito(v)) {
				c2.credito(v);
			}			
		}
	}
}
