package pedroSantosNeto.banco;

public class VetorDeContas {
	
	private Conta contas[] = new Conta[10];
	private int indice = 0;
	
	public void inserir(Conta nova) {
		Conta c = pesquisar(nova.getNumero());
		if (c == null) {
		  contas[indice++] = nova;
		} else {
			System.out.println("Já existe conta cadastrada com esse número.");
		}
	}

	public Conta pesquisar(int n) {
		for (int i=0; i<indice; i++) {
			if (contas[i].getNumero() == n) {
				return contas[i];
			}
		}
		return null;
	}
}
