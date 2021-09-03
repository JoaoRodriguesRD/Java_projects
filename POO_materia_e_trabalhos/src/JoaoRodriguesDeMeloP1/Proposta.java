package JoaoRodriguesDeMeloP1;

public class Proposta {
	
	int codigoServico;
	Servico servicoDaProposta;
	String emailPrestador; 
	double valor; 
	int prazo;
	
	
	
	public Proposta(int codigoServico, String emailPrestador, double valor, int prazo) {
		this.codigoServico = codigoServico;
		this.emailPrestador = emailPrestador;
		this.valor = valor;
		this.prazo = prazo;
	}
	
	
}
