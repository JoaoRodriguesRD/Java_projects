package pedroSantosNeto.exemplos;

import javax.swing.plaf.synth.SynthSeparatorUI;

import pedroSantosNeto.banco.Conta;

import java.util.*;

public class ExecutaExemplos {

	public static void main(String[] args) {
		Estatica e = new Estatica();
		Estatica e1 = new Estatica();
		Estatica e2 = new Estatica();
		Estatica e3 = new Estatica();
		
		System.out.println(e.x);
		System.out.println(e1.x);
		System.out.println(e2.x);
		System.out.println(e3.x);
		System.out.println(Estatica.x);
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		for (Conta c : contas) {
           if (c.getNumero() == 1)
        	     System.out.println(c.getSaldo());
		}
		
		Date data = new Date();
		System.out.println(data);
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(1974, 10, 14);
		gc.setTime(data);
		
		System.out.println(gc.get(gc.DAY_OF_WEEK)); 
		System.out.println(gc.get(gc.DATE)); 
		System.out.println(gc.get(gc.MONTH));
		System.out.println(gc.get(gc.YEAR));
	}
}
