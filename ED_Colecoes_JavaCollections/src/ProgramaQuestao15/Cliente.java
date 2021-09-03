package ProgramaQuestao15;

public class Cliente implements Comparable<Cliente>{
	String nome;
	int dinheiroNoBolso;
	
	public Cliente(String nome, int dinheiroNoBolso) {
		this.nome = nome;
		this.dinheiroNoBolso = dinheiroNoBolso;
	}
	
	public boolean equals(Cliente c) {
		return this.dinheiroNoBolso == c.dinheiroNoBolso;
	}
	
	@Override
	public int compareTo(Cliente c) {
		if(this.equals(c)) {
			return 0;
		}else if(dinheiroNoBolso < c.dinheiroNoBolso) {
			return 1;
		}else
			return -1;
		
		
		
	}

}
