package TesteHeranca;

public class Moto extends Veiculo{
	
	protected int cilindrada;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public Moto(int cilindrada){
		super();
		tipo = 1;
		this.cilindrada = cilindrada;
		}
}
