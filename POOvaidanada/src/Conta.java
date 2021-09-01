public class Conta {
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

	void credito(double val) {
		saldo = saldo + val;
		extrato = extrato + "\n Credito: " + val + ". Saldo: " + saldo;
	}

	boolean debito(double val) {
		if (val <= saldo) {
		  saldo = saldo - val;
		  extrato = extrato + "\n Debito: " + val + ". Saldo: " + saldo;
		  return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}
	
	Conta(int n, Pessoa p){
	  numero = n;
	  titular = p;
	}
}
