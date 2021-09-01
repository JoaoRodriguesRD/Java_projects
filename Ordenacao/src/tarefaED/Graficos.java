package tarefaED;

/*
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;*/
import java.io.OutputStream;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;

public class Graficos {

	public static void gerar(ArrayList<Tempos> tempos) {
//		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//		
//		dataset.addValue(tempos.get(5).tempoMerge, "mergesort", "1k");
//		dataset.addValue(tempos.get(4).tempoMerge, "mergesort", "10k");
//		dataset.addValue(tempos.get(3).tempoMerge, "mergesort", "20k");
//		dataset.addValue(tempos.get(2).tempoMerge, "mergesort", "30k");
//		dataset.addValue(tempos.get(1).tempoMerge, "mergesort", "40k");
//		dataset.addValue(tempos.get(0).tempoMerge, "mergesort", "50K");
//		
//		
//		dataset.addValue(tempos.get(5).tempoQuick, "quicksort", "1k");
//		dataset.addValue(tempos.get(4).tempoQuick, "quicksort", "10k");
//		dataset.addValue(tempos.get(3).tempoQuick, "quicksort", "20k");
//		dataset.addValue(tempos.get(2).tempoQuick, "quicksort", "30k");
//		dataset.addValue(tempos.get(1).tempoQuick, "quicksort", "40k");
//		dataset.addValue(tempos.get(0).tempoQuick, "quicksort", "50K");
//		
//		
//		dataset.addValue(tempos.get(5).tempoShell, "shellsort", "1k");
//		dataset.addValue(tempos.get(4).tempoShell, "shellsort", "10k");
//		dataset.addValue(tempos.get(3).tempoShell, "shellsort", "20k");
//		dataset.addValue(tempos.get(2).tempoShell, "shellsort", "30k");
//		dataset.addValue(tempos.get(1).tempoShell, "shellsort", "40k");
//		dataset.addValue(tempos.get(0).tempoShell, "shellsort", "50K");
//		
//		/*
//		dataset.addValue(tempos.get(5).tempoInsertion, "insertionsort", "1k");
//		dataset.addValue(tempos.get(4).tempoInsertion, "insertionsort", "10k");
//		dataset.addValue(tempos.get(3).tempoInsertion, "insertionsort", "20k");
//		dataset.addValue(tempos.get(2).tempoInsertion, "insertionsort", "30k");
//		dataset.addValue(tempos.get(1).tempoInsertion, "insertionsort", "40k");
//		dataset.addValue(tempos.get(0).tempoInsertion, "insertionsort", "50K");
//		
//		
//		dataset.addValue(tempos.get(5).tempoSelection, "selectionsort", "1k");
//		dataset.addValue(tempos.get(4).tempoSelection, "selectionsort", "10k");
//		dataset.addValue(tempos.get(3).tempoSelection, "selectionsort", "20k");
//		dataset.addValue(tempos.get(2).tempoSelection, "selectionsort", "30k");
//		dataset.addValue(tempos.get(1).tempoSelection, "selectionsort", "40k");
//		dataset.addValue(tempos.get(0).tempoSelection, "selectionsort", "50K");
//		*/
//		
//		
//		JFreeChart criaGrafico = ChartFactory.createLineChart("Grafico", "quantidade de palavras", "Tempo (ms)", dataset, PlotOrientation.VERTICAL,true,true,false);
//		
//		try {
//			System.out.println("Criando o grafico");
//			OutputStream png = new FileOutputStream("GraficoSimples.png");
//			ChartUtilities.writeChartAsPNG(png, criaGrafico, 800, 500);
//			png.close();
//		}catch(IOException io) {
//			System.out.println("ERRO!\n"+ io.getMessage());
//		}
//		System.out.println("grafico criado!");
//		
//		
//		
//		
//		
//		
//	}

}
