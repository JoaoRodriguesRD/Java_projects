package pedroSantosNeto.banco;

public class Banco {

	private ListaDeContas contas = new ListaDeContas();
//	private VetorDeContas contas2 = new VetorDeContas();

	public void cadastrar(Conta nova) {
		contas.inserir(nova);
	}
	
	public double saldo(int n) {
		Conta c = contas.pesquisar(n);
		if (c != null) {
			return c.getSaldo();
		}
		return -999999;
	}

	public String extrato(int n) {
		Conta c = contas.pesquisar(n);
		if (c != null) {
			return c.getExtrato();
		}
		return "";
	}
	
	public void saque(int n, double v) {
		Conta c = contas.pesquisar(n);
		if (c != null) {
			c.debito(v);
		}
	}

	public void deposito(int n, double v) {
		Conta c = contas.pesquisar(n);
		if (c != null) {
			c.credito(v);
		}
	}
	
	public void juros(int n, double t) {
		Conta c = contas.pesquisar(n);
		if (c != null) {
			if (c instanceof Poupanca) {
			  ((Poupanca) c).rendeJuros(t);
			}
		}
	}
	
	public void transferencia(int de, int para, double v) {
		Conta c1 = contas.pesquisar(de);
		Conta c2 = contas.pesquisar(para);
		if (c1 != null && c2 != null) {
			c1.debito(v);
			c2.credito(v);
		}
	}
}
