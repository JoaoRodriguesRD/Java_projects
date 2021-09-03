package ProgramaQuestao13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Excluidor {
	public static void excluirEmVector(String[] palavrasParaExcluir, Vector<String> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);

		}

	}

	public static void excluirEmLinkedList(String[] palavrasParaExcluir, LinkedList<String> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);

		}
	}

	public static void excluirEmArrayList(String[] palavrasParaExcluir, ArrayList<String> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);

		}
	}

	public static void excluirEmHashSet(String[] palavrasParaExcluir, HashSet<String> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);

		}
	}

	

	public static void excluirEmLinkedHashSet(String[] palavrasParaExcluir, LinkedHashSet<String> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);

		}
	}

	public static void excluirEmTreeSet(String[] palavrasParaExcluir, TreeSet<String> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);

		}
	}

	

	public static void excluirEmHashMap(String[] palavrasParaExcluir, HashMap<String, Integer> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);

		}

	}

	public static void excluirEmLinkedHashMap(String[] palavrasParaExcluir, LinkedHashMap<String, Integer> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);
		}

	}

	public static void excluirEmTreeMap(String[] palavrasParaExcluir, TreeMap<String, Integer> colecao) {

		for (int i = 0; i < palavrasParaExcluir.length; i++) {
			colecao.remove(palavrasParaExcluir[i]);
		}

	}

}
