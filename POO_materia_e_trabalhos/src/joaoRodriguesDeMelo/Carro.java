package joaoRodriguesDeMelo;

public class Carro extends Veiculo {

	// tipo de carro
	// 1 (passeio), 2 (SUV), 3 (pickup)
	private int tipoCarro;

	public Carro(String marca, String modelo, int anoDeFabricacao, double valorAvaliado, double valorDiaria,String placa, int tipoCarro) {
		super(marca,  modelo, anoDeFabricacao,valorAvaliado, valorDiaria,placa);
		this.tipoCarro = tipoCarro;
	}

	public int getTipo() {
		return tipoCarro;
	}

	public void setTipo(int tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	@Override
	public double seguro() {
		return getValorAvaliado() * 0.03 / 365;
	}
}
