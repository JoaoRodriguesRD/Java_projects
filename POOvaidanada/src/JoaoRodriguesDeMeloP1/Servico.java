package JoaoRodriguesDeMeloP1;

public class Servico {
	
	private String emailContratante;
	

	double valor;
	int prazoMaximo;
	boolean contratado;
	boolean finalizado;
	int avaliacaoMediaContratante;
	TipoDeServico tipoDeServico;
	int seuCodigo;
	
	public Servico(double valor, int prazoMaximo, boolean contratado,
			boolean finalizado,TipoDeServico tipoDeServico) {
		this.tipoDeServico = tipoDeServico;
		this.prazoMaximo = prazoMaximo;
		this.valor = valor;

		this.contratado = contratado;
		this.finalizado = finalizado;
		avaliacaoMediaContratante = 0;
	}

	public String getEmailContratante() {
		return emailContratante;
	}

	public void setEmailContratante(String emailContratante) {
		this.emailContratante = emailContratante;
	}
}
