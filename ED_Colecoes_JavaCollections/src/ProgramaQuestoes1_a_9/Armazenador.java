package ProgramaQuestoes1_a_9;

import java.util.LinkedList;
import java.util.Vector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;



public class Armazenador {

	public static Vector<String> armazenarEmVector(String[] palavras_sem_rep) {
		Vector<String> colecao = new Vector<String>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.add(palavras_sem_rep[i]);
		}
		return colecao;
	}

	public static LinkedList<String> armazenarEmLinkedList(String[] palavras_sem_rep) {
		LinkedList<String> colecao = new LinkedList<String>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.add(palavras_sem_rep[i]);
		}
		return colecao;
	}

	public static ArrayList<String> armazenarEmArrayList(String[] palavras_sem_rep) {
		ArrayList<String> colecao = new ArrayList<String>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.add(palavras_sem_rep[i]);
		}
		return colecao;
	}

	public static HashSet<String> armazenarEmHashSet(String[] palavras_sem_rep) {
		HashSet<String> colecao = new HashSet<String>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.add(palavras_sem_rep[i]);
		}
		return colecao;
	}

	public static LinkedHashSet<String> armazenarEmLinkedHashSet(String[] palavras_sem_rep) {
		LinkedHashSet<String> colecao = new LinkedHashSet<String>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.add(palavras_sem_rep[i]);
		}
		return colecao;

	}

	public static TreeSet<String> armazenarEmTreeSet(String[] palavras_sem_rep) {
		TreeSet<String> colecao = new TreeSet<String>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.add(palavras_sem_rep[i]);
		}
		return colecao;
	}

	public static HashMap<String,Integer> armazenarEmHashMap(String[] palavras_sem_rep) {
		HashMap<String,Integer> colecao = new HashMap<String,Integer>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.put(palavras_sem_rep[i], null);
		}
		return colecao;
	}

	public static LinkedHashMap<String,Integer> armazenarEmLinkedHashMap(String[] palavras_sem_rep) {
		LinkedHashMap<String,Integer> colecao = new LinkedHashMap<String,Integer>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.put(palavras_sem_rep[i], null);
		}
		return colecao;
	}

	public static TreeMap<String,Integer> armazenarEmTreeMap(String[] palavras_sem_rep) {
		TreeMap<String,Integer> colecao = new TreeMap<String,Integer>();
		for (int i = 0; i < palavras_sem_rep.length; i++) {
			colecao.put(palavras_sem_rep[i], null);
		}
		return colecao;
	}
}
