package pedroSantosNeto.banco;

public class PoupancaSemHeranca{
	private int numero;
	private double saldo;
	private String extrato = "";
	private Pessoa titular;
	
	public int getNumero() {
		return numero;
	}
	
	public Pessoa getTitular() {
		return titular;
	}

	public String getExtrato() {
		return extrato;
	}

	public double getSaldo() {
		return saldo;
	}

	public void credito(double val) {
		saldo = saldo + val;
		extrato = extrato + "\n Credito: " + val + ". Saldo: " + saldo;
	}

	public void debito(double val) {
		if (val <= saldo) {
		  saldo = saldo - val;
		  extrato = extrato + "\n Debito: " + val + ". Saldo: " + saldo;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void redeJuros(double t) {
		credito(getSaldo()*t);
	}
	
	public PoupancaSemHeranca(int n, Pessoa p){
	  numero = n;
	  titular = p;
	}
}
