package Questao5;

import java.util.ArrayList;


public class Principal {

	private static int M = 5;

	private static SeparateChainingHashST<String, Integer> tabelaPrincipal = new SeparateChainingHashST<>();

	public static void main(String[] args) {
		// E A S Y Q U T I O N
		String[] chaves = { "E", "A", "S", "Y", "Q", "U", "T", "I", "O", "N" };
		ArrayList<Integer> valoresDasChaves = new ArrayList<Integer>();
		char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		int h = 0;
		for (int i = 0; i < alfabeto.length; i++) {
			h = (11 * h + alfabeto[i]) % M;
			System.out.println(alfabeto[i] + "= " + h);
			valoresDasChaves.add(h);
		}
		for (int i = 0; i < chaves.length; i++) {
			tabelaPrincipal.put(chaves[i], valoresDasChaves.get(i));
			System.out.println(chaves[i] + " - valor = " + valoresDasChaves.get(i));
		}

	}

	public static void inserir(String key, int val) {
		tabelaPrincipal.put(key, val);
	}
	
	public static int buscar(String key) {
		if(!tabelaPrincipal.contains(key)) {
			return -1;
		}
		
		return tabelaPrincipal.get(key);
	}

}
