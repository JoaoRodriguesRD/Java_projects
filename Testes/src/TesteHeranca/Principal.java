package TesteHeranca;



public class Principal {
	
	
	
	public static void main(String[] args) {
		
		Veiculo veiculoQualquer = new Veiculo();
		Veiculo m = new Moto(1000);
		
		Veiculo motinha = new Moto(0);
		if(((Moto)veiculoQualquer).getCilindrada() == 0) {
		System.out.println("mesma classe");
		System.out.println(((Moto)veiculoQualquer).getCilindrada());
		}
		m.setValorAvaliado(100);
		System.out.println(m.getValorAvaliado());
		
	}
	
	
	
	
	
	
	
	
	private static int tipoDoVeiculo(Veiculo v) {	
		Veiculo aux1 = new Moto(0);
		Veiculo aux2 = new Carro(0);

		
		if(v.getClass().equals(aux1.getClass())) {
			return 1;
		}
		if(v.getClass().equals(aux2.getClass())) {
			return 2;
		}	
		return 0;
	}
	
	private int pesquisar(int i) {
		Veiculo aux1 = new Moto(0);
			if (i==1) {
			   return 1;
			}
	      
	      return 0;
		}
}
