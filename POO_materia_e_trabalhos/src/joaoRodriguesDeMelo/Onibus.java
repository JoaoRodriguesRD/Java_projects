package joaoRodriguesDeMelo;

public class Onibus extends Veiculo {

	// quantidade maxima de passageiros
	private int passageiros;

	public Onibus(String marca, String modelo, int anoDeFabricacao, double valorAvaliado, double valorDiaria,String placa, int passageiros) {
		super(marca,  modelo, anoDeFabricacao,valorAvaliado, valorDiaria,placa);
		this.passageiros = passageiros;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	@Override
	public double seguro() {
		return getValorAvaliado() * 0.2 / 365;
	}

}
