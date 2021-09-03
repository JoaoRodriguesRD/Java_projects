package JoaoRodriguesDeMeloP1;

import java.util.ArrayList;

public class Contratante {
	private String email, nome, telefone;
	
	boolean temServico = false;
	ArrayList<Integer> suasNotas = new ArrayList<Integer>();
	int avaliacaoMediaContratante;
	
	public Contratante(String email, String nome, String telefone) {
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		avaliacaoMediaContratante = 0;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void atualizarNota() {
		int soma = 0;
		for(int i = 0; i < suasNotas.size(); i++) {
			soma = suasNotas.get(i);
		}
		avaliacaoMediaContratante = soma/suasNotas.size();
	}
}
