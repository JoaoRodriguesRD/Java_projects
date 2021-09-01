package TesteSom;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Rodar {

	public static void main(String[] args) throws IOException {
		String dir = System.getProperty("user.dir");
		
		System.out.println(dir);
		JOptionPane.showMessageDialog(null, dir);
		String dirs = dir+"/soms/untitled.wav";
		MakeSound ms = new MakeSound();
		
		ms.playSound(dirs);
	}

}
