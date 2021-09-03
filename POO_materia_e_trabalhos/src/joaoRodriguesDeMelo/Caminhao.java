package joaoRodriguesDeMelo;

public class Caminhao extends Veiculo {

	// carga suportada pelo caminhao
	private int carga;

	public Caminhao(String marca, String modelo, int anoDeFabricacao, double valorAvaliado, double valorDiaria,String placa, int carga) {
		super(marca,  modelo, anoDeFabricacao,valorAvaliado, valorDiaria,placa);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public double seguro() {
		return getValorAvaliado() * 0.08 / 365;
	}

}
