import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
	    while(true){
		
		String fita,fita2="";
		int n=0;		
		  
		fita = JOptionPane.showInputDialog("Insira a fita do RNAm");
		fita = fita.toUpperCase();
		fita = fita.trim();
		String inicio = "AUG";
		String fim1 = "UAA";
		String fim2 = "UAG";
		String fim3 = "UGA";
		int indexFinal = -1;
		
		if(fita.contains(fim1)) {
			indexFinal = fita.lastIndexOf(fim1);
		}
		if(fita.contains(fim2)) {
			indexFinal = fita.lastIndexOf(fim2);
		}
		if(fita.contains(fim3)) {
			indexFinal = fita.lastIndexOf(fim3);
		}
		
		if(fita.contains(fim1) && fita.contains(fim2)) {
			if(fita.lastIndexOf(fim1)<fita.lastIndexOf(fim2)) {
				indexFinal = fita.lastIndexOf(fim1);
			}else {
				indexFinal = fita.lastIndexOf(fim2);
			}	
		}
		if(fita.contains(fim1) && fita.contains(fim3)) {
			if(fita.lastIndexOf(fim1)<fita.lastIndexOf(fim3)) {
				indexFinal = fita.lastIndexOf(fim1);
			}else {
				indexFinal = fita.lastIndexOf(fim3);
			}	
		}
		if(fita.contains(fim2) && fita.contains(fim3)) {
			if(fita.lastIndexOf(fim2)<fita.lastIndexOf(fim3)) {
				indexFinal = fita.lastIndexOf(fim2);
			}else {
				indexFinal = fita.lastIndexOf(fim3);
			}	
		}
			
		if(fita.contains(fim1) && fita.contains(fim2) && fita.contains(fim3)) {
			if(fita.lastIndexOf(fim1)<fita.lastIndexOf(fim2) && fita.lastIndexOf(fim1)<fita.lastIndexOf(fim3))
				indexFinal = fita.lastIndexOf(fim1);
			if(fita.lastIndexOf(fim2)<fita.lastIndexOf(fim1) && fita.lastIndexOf(fim2)<fita.lastIndexOf(fim3))
				indexFinal = fita.lastIndexOf(fim2);
			if(fita.lastIndexOf(fim3)<fita.lastIndexOf(fim1) && fita.lastIndexOf(fim3)<fita.lastIndexOf(fim2))
				indexFinal = fita.lastIndexOf(fim3);		
		}
		
		if (fita.contains(inicio) && (fita.contains(fim1) || fita.contains(fim2) ||fita.contains(fim3) ) && fita.lastIndexOf(inicio) < indexFinal ) {
			JOptionPane.showMessageDialog(null, fita, "codigo comeca de "+fita.lastIndexOf(inicio), 1);
			n = fita.lastIndexOf(inicio)+3;
			
			while(n<indexFinal) {		
				fita2= fita2 + fita.substring(n, n+1);		
				n++;	
			}
			if(fita2.length() < 3) {
				JOptionPane.showMessageDialog(null, "A proteina nao é montada");
			}else {
			JOptionPane.showMessageDialog(null, "Parte entre o codon de inicio e de parada:\n"+fita2, "codigo", 1);
			fita2 = fita2.replaceAll("UUU", "F");
			fita2 = fita2.replaceAll("UUC", "F");
			fita2 = fita2.replaceAll("UUA", "L");
			fita2 = fita2.replaceAll("UUG", "L");
			fita2 = fita2.replaceAll("UCU", "S");
			fita2 = fita2.replaceAll("UCC", "S");
			fita2 = fita2.replaceAll("UCA", "L");
			fita2 = fita2.replaceAll("UCG", "L");
			fita2 = fita2.replaceAll("UAU", "Y");
			fita2 = fita2.replaceAll("UAC", "Y");
			fita2 = fita2.replaceAll("UGU", "C");
			fita2 = fita2.replaceAll("UGC", "C");
			fita2 = fita2.replaceAll("UGG", "W");
			fita2 = fita2.replaceAll("CUU", "L");
			fita2 = fita2.replaceAll("CUC", "L");
			fita2 = fita2.replaceAll("CUA", "L");
			fita2 = fita2.replaceAll("CUG", "L");
			fita2 = fita2.replaceAll("CCU", "P");
			fita2 = fita2.replaceAll("CCC", "P");
			fita2 = fita2.replaceAll("CCA", "P");
			fita2 = fita2.replaceAll("CCG", "P");
			fita2 = fita2.replaceAll("CAU", "H");
			fita2 = fita2.replaceAll("CAC", "H");
			fita2 = fita2.replaceAll("CAA", "Q");
			fita2 = fita2.replaceAll("CAG", "Q");
			fita2 = fita2.replaceAll("CGU", "R");
			fita2 = fita2.replaceAll("CGC", "R");
			fita2 = fita2.replaceAll("CGA", "R");
			fita2 = fita2.replaceAll("CGG", "R");
			fita2 = fita2.replaceAll("AUU", "I");
			fita2 = fita2.replaceAll("AUC", "I");
			fita2 = fita2.replaceAll("AUA", "I");
			
			fita2 = fita2.replaceAll("ACU", "T");
			fita2 = fita2.replaceAll("ACC", "T");
			fita2 = fita2.replaceAll("ACA", "T");
			fita2 = fita2.replaceAll("ACG", "T");
			fita2 = fita2.replaceAll("AAU", "N");
			fita2 = fita2.replaceAll("AAC", "N");
			fita2 = fita2.replaceAll("AAA", "K");
			fita2 = fita2.replaceAll("AAG", "K");
			fita2 = fita2.replaceAll("AGU", "S");
			fita2 = fita2.replaceAll("AGC", "S");
			fita2 = fita2.replaceAll("AGA", "R");
			fita2 = fita2.replaceAll("AGG", "R");
			fita2 = fita2.replaceAll("GUU", "V");
			fita2 = fita2.replaceAll("GUC", "V");
			fita2 = fita2.replaceAll("GUA", "V");
			fita2 = fita2.replaceAll("GUG", "V");
			fita2 = fita2.replaceAll("GCU", "A");
			fita2 = fita2.replaceAll("GCC", "A");
			fita2 = fita2.replaceAll("GCA", "A");
			fita2 = fita2.replaceAll("GCG", "A");
			fita2 = fita2.replaceAll("GAU", "D");
			fita2 = fita2.replaceAll("GAC", "D");
			fita2 = fita2.replaceAll("GAA", "E");
			fita2 = fita2.replaceAll("GAG", "E");
			fita2 = fita2.replaceAll("GGU", "G");
			fita2 = fita2.replaceAll("GGC", "G");
			fita2 = fita2.replaceAll("GGA", "G");
			fita2 = fita2.replaceAll("GGG", "G");

			JOptionPane.showMessageDialog(null, "Cadeia de aminoácido Formados:\n"+fita2, "codigo", 1);
			}
		
		}else {
			JOptionPane.showMessageDialog(null, "A proteina nao é montada");		
		}
	}
  }
}
