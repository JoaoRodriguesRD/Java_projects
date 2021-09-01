package joaoRodriguesDeMelo;

public class ClienteCobranca {

	private double cobranca;
	private int cpf;

	public ClienteCobranca(int cpf, double cobranca) {
		this.cpf = cpf;
		this.cobranca = cobranca;
	}

	public double getCobranca() {
		return cobranca;
	}

	public int getCpf() {
		return cpf;
	}

}
