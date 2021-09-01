package TesteHeranca;


public class Carro extends Veiculo{
	
	protected int carroKm;

	public int getCarroKm() {
		return carroKm;
	}

	public void setCarroKm(int carroKm) {
		this.carroKm = carroKm;
	}
	
	public Carro(int carroKm){
		super();
		tipo = 2;
		this.carroKm = carroKm;
		}
}