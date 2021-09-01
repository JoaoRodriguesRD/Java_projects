import java.io.*;


public class principal {

	public static void main(String[] args) {
		
		String fitaMassa = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			
			try {
				fitaMassa = reader.readLine();
				System.out.println("FITA ORIGINAL: "+fitaMassa);
				
				
			} catch (IOException e) {
				System.out.println("Nao foi possivel ler!");
				e.printStackTrace();
			}		
			
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
	    fitaMassa =	fitaMassa.replace("A", "B");
	    fitaMassa =	fitaMassa.replace("T", "A");    
	    fitaMassa =	fitaMassa.replace("B", "U");
	    
	    fitaMassa =	fitaMassa.replace("C", "D");
	    fitaMassa =	fitaMassa.replace("G", "C");
	    fitaMassa =	fitaMassa.replace("D", "G");
		
		
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(".\\output.txt"));
			
			writer.write(fitaMassa);
			System.out.println("FITA RNAM:     "+fitaMassa);
			writer.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
