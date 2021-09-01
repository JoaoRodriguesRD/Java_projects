package joaoRodriguesDeMelo;


public class Moto extends Veiculo{
	
	// cilindradas da moto
	private int cilindrada;
	

	
	public Moto(String marca, String modelo, int anoDeFabricacao, double valorAvaliado, double valorDiaria,String placa, int cilindrada){
		super(marca,  modelo, anoDeFabricacao,valorAvaliado, valorDiaria,placa);
		this.cilindrada = cilindrada;
		}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public double seguro() {
		return getValorAvaliado()*0.11/365;
	}
	
}
