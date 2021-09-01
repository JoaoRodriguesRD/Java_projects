package JoaoRodriguesDeMeloP1;

import java.util.ArrayList;

public class Prestador {

	String email;
	String nome;
	String telefone;
	
	private int avaliacaoMediaPrestador;
	ArrayList<Integer> seusServicos = new ArrayList<Integer>();
	ArrayList<Integer> suasNotas = new ArrayList<Integer>();
	
	public Prestador(String email, String nome, String telefone, ArrayList<Integer> seusServicos) {
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.seusServicos = seusServicos;
		avaliacaoMediaPrestador = 0;
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

	public int getAvaliacaoMediaPrestador() {
		return avaliacaoMediaPrestador;
	}

	public void setAvaliacaoMediaPrestador(int avaliacaoMediaPrestador) {
		this.avaliacaoMediaPrestador = avaliacaoMediaPrestador;
	}
	
	public void atualizarNota() {
		int soma = 0;
		for(int i = 0; i < suasNotas.size(); i++) {
			soma = suasNotas.get(i);
		}
		avaliacaoMediaPrestador = soma/suasNotas.size();
	}
}
