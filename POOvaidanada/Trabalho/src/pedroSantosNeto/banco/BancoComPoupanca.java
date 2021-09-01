package pedroSantosNeto.banco;

import java.util.ArrayList;

public class BancoComPoupanca {

	private ListaDeContas contas = new ListaDeContas();
	private ArrayList<PoupancaSemHeranca> poupancas = new ArrayList<PoupancaSemHeranca>();

	public void cadastrar(Conta nova) {
		contas.inserir(nova);
	}
	
	public void cadastrar(PoupancaSemHeranca nova) {
		poupancas.add(nova);
	}
	
	public double saldo(int n) {
		Conta c = contas.pesquisar(n);
		if (c != null) {
			return c.getSaldo();
		}
		return -999999;
	}
	
	public double saldoPoupanca(int n) {
		Conta c = null;
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
	
	public void transferencia(int de, int para, double v) {
		Conta c1 = contas.pesquisar(de);
		Conta c2 = contas.pesquisar(para);
		if (c1 != null && c2 != null) {
			c1.debito(v);
			c2.credito(v);
		}
	}
}
