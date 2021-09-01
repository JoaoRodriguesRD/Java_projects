package integracaopython;

import java.io.IOException;

public class RodarPrograma {

	String comando;

	/**
	 * @param String diretorio
	 * 
	 */
	RodarPrograma(String d) {
		this.comando = "python " + d;
	}

	/**
	 * @param String diretorio, String parâmetro entrada
	 */
	RodarPrograma(String d, String p) {
		this.comando = "python " + d + " " + p;
	}

	public boolean Executar() {
		try {
			Process p = Runtime.getRuntime().exec(comando);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
