package ProgramaQuestao11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Buscador {
	public static int buscarEmVector(String[] palavrasParaBuscar, Vector<String> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.contains(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

	public static int buscarEmLinkedList(String[] palavrasParaBuscar, LinkedList<String> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.contains(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

	public static int buscarEmArrayList(String[] palavrasParaBuscar, ArrayList<String> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.contains(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

	public static int buscarEmHashSet(String[] palavrasParaBuscar, HashSet<String> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.contains(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

	public static int buscarEmLinkedHashSet(String[] palavrasParaBuscar, LinkedHashSet<String> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.contains(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

	public static int buscarEmTreeSet(String[] palavrasParaBuscar, TreeSet<String> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.contains(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

	public static int buscarEmHashMap(String[] palavrasParaBuscar, HashMap<String, Integer> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.containsKey(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

	public static int buscarEmLinkedHashMap(String[] palavrasParaBuscar, LinkedHashMap<String, Integer> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.containsKey(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

	public static int buscarEmTreeMap(String[] palavrasParaBuscar, TreeMap<String, Integer> colecao) {
		int n = 0;
		for (int i = 0; i < palavrasParaBuscar.length; i++) {
			if(colecao.containsKey(palavrasParaBuscar[i])) {
				n++;
			}
		}
		return n;

	}

}
