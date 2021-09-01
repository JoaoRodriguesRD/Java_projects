public class Pessoa {
	private int cpf;
	private String nome;
	
	public int getCpf() {
		return cpf;
	}
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(int n) {
		cpf = n;
	}
}
