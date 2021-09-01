package tarefaED;

//Essa classe serve apenas para guardar os tempos de uma execucao junto com a quantidade de palavras utilizada
public class Tempos {
	int quantidadeDePalavras;
	double tempoQuick;
	double tempoMerge;
	double tempoShell;
	/*
	 * double tempoInsertion; double tempoSelection;
	 */

	Tempos(int quantidadeDePalavras, double tempoQuick, double tempoMerge,
			double tempoShell/* , double tempoInsertion, double tempoSelection */) {
		this.quantidadeDePalavras = quantidadeDePalavras;
		this.tempoQuick = tempoQuick;
		this.tempoMerge = tempoMerge;
		this.tempoShell = tempoShell;
		
		
		
		
		/*
		 * this.tempoInsertion = tempoInsertion; this.tempoSelection = tempoSelection;
		 */
	}
}
