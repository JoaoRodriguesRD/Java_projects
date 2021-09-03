package pedroSantosNeto.banco;

public class Poupanca extends Conta {
	
	public void rendeJuros(double t) {
		credito(getSaldo()*t);
	}
	
	public Poupanca(int n, Pessoa p){
	  super(n,p);
	}
}
