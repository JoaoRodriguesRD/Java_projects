package tarefaED;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class OrdenacaoEGrafos {
	
	static ArrayList<Tempos> tempos = new ArrayList<Tempos>();//Array que ficaram os tempos dos testes
	
	public static void main(String[] args) {
		String diretorio = args[0]; // O argumento passado como parametro sera um diretorio para o arquivo .TXT
		String data = "";
		// Try-catch para ler o arquivo
		try {
			data = new String(Files.readAllBytes(Paths.get(diretorio))); // guarda o conteudo do arquivo na String data
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERRO DE LEITURA!");
		}
		
		//Executo os metodos Ordenacao para a quantidade de palavras que eu gostaria de ordernar
		System.out.println("Loading...\n");
		Ordenacao(data,50000);
		System.out.println("Loading...\n");
		Ordenacao(data,40000);
		System.out.println("Loading...\n");
		Ordenacao(data,30000);
		System.out.println("Loading...\n");
		Ordenacao(data,20000);
		System.out.println("Loading...\n");
		Ordenacao(data,10000);
		System.out.println("Loading...\n");
		Ordenacao(data,1000);
		System.out.println("Finished!");
		
		
		// Geracao do grafico
		Graficos.gerar(tempos);
		//So consegui executar com sucesso dentro do Eclipse
		//Pelo arquivo .jar deu erro em salvar como png, nao sei resolver ainda
	}
	
	
	// O metodo Ordenacao tem como parametros a String de nomes lidos e a quantidade de palavras utilizadas para cada execucao
	// Esse metodo ordena e mostra o tempo de cada ordenacao
	// Alem disso, ele guarda os tempos no ArrayList <Tempos>
	public static void Ordenacao(String data, int quantidade) {
		long start;
		long finish;
		// Criei 3 arrays de string, um para cada metodo de ordenacao
		// Faco split para separar os arrays por quebra de linha encontrado e limito a quantidade
		// usei 3 metodos de ordenacao: ShellSort, MergeSort e QuickSort
		String[] nomesInShell = data.split("\n", quantidade);
		String[] nomesInQuick = data.split("\n", quantidade);
		String[] nomesInMerge = data.split("\n", quantidade);
		
		/*
		String[] nomesInInsertion = data.split("\n", quantidade);
		String[] nomesInSelection = data.split("\n", quantidade);
		*/
		
		
		// ---SHELL SORT---
		start = System.nanoTime();// start recebe o tempo em ns
		Shell.sort(nomesInShell); // executo a ordenacao
		finish = System.nanoTime();//Depois da execucao finish recebe o tempo
		long shellTime = (long) ((finish - start)/1000000.0); // a variavel shellTime vai receber o tempo necessario para executar a ordenacao
		//Divido por 1000000.0 para pegar o tempo em ms
		// faco o mesmo para os MERGE SORT, QUICK SORT, INSERTION SORT, SELECTION SORT, guardando o tempo em milisegundos
		//Deixei comentado os insertion sort e selection sort em todo meu codigo, o motivo deixei no relatorio
		
		
		// --- QUICK SORT---
		start = System.nanoTime();
		Quick.sort(nomesInMerge);
		finish = System.nanoTime();
		long quickTime = (long) ((finish - start)/1000000.0);
		
		
		// ---MERGE SORT---
		start = System.nanoTime();
		Merge.sort(nomesInQuick);
		finish = System.nanoTime();
		long mergeTime = (long) ((finish - start)/1000000.0);
		
		/*
		// ---INSERTION SORT---
		start = System.nanoTime();
		Insertion.sort(nomesInInsertion);
		finish = System.nanoTime();
		long insertionTime = (long) ((finish - start)/1000000.0);
		// ---SELECTION SORT---
		start = System.nanoTime();
		Insertion.sort(nomesInSelection);
		finish = System.nanoTime();
		long selectionTime = (long) ((finish - start)/1000000.0);
		*/
		
		//Guardo os tempos junto com a quantidade para utilizar nos graficos
		Tempos novosTempos = new Tempos(quantidade, quickTime, mergeTime, shellTime/*, insertionTime, selectionTime*/);
		tempos.add(novosTempos);
		
		
		//Mostra no console a quantidade de palavras utilizadas na execucao e os seus tempos 
		System.out.println("Total sorted words in this execution: " + quantidade);
		System.out.println("Total Shell execution time in milliseconds: " + shellTime + "ms");
		System.out.println("Total Merge execution time in milliseconds: " + mergeTime + "ms");
		System.out.println("Total Quick execution time in milliseconds: " + quickTime + "ms");
		
		/*
		System.out.println("Total insertion execution time in milliseconds: " + insertionTime + "ms");
		System.out.println("Total selection execution time in milliseconds: " + selectionTime + "ms");
		*/
	}
	
	

}
