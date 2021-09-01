package integracaopython;

public class RodarProgramaTeste {
	
	
	public static void main(String[] args) {
		RodarPrograma rd = new RodarPrograma("pythonScripts/test.py");
		if(rd.Executar()) {
			System.out.println("Script rodou com sucesso");
		}else {
			System.out.println("Erro em rodar o script");
		}
	}
}
