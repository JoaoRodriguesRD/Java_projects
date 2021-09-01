package pedroSantosNeto.banco;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BancoTeste {

	@Test
	void testConta() {
		Pessoa p = new Pessoa(1);
		p.setNome("Pedro");
		Conta c = new Conta(1, p);
		Banco b = new Banco();
		b.cadastrar(c);
	    b.deposito(1, 100);	
	    b.saque(1, 100);
	    assertEquals(0, b.saldo(1));
	}
	
	@Test
	void testPoupanca() {
		Pessoa pes = new Pessoa(1);
		pes.setNome("Pedro");
		Conta p = new Poupanca(1, pes);
		Banco b = new Banco();
		b.cadastrar(p);
	    b.deposito(1, 100);	
	    b.saque(1, 90);
	    b.juros(1, 0.1);
	    assertEquals(11, b.saldo(1));
	    System.out.println(b.extrato(1));
	}

	
	@Test
	void testarSaqueAcimaDoLimite() {
		Pessoa p = new Pessoa(1);
		p.setNome("Pedro");
		Conta c = new Conta(1, p);
		Banco b = new Banco();
		
		b.cadastrar(c);
	    b.deposito(1, 100);	
	    b.saque(1, 100.01);
	    assertEquals(100, b.saldo(1));
	}
	
	@Test
	void testarCadastroDeContaJaCadastrada() {
		Pessoa p = new Pessoa(1);
		p.setNome("Pedro");
		Conta c = new Conta(1, p);
		Conta outra = new Conta(1,p);
		Banco b = new Banco();
		
		b.cadastrar(c);
	    assertEquals(0, b.saldo(1));
	    b.deposito(1, 100);
	    assertEquals(100, b.saldo(1));
	    
	    b.cadastrar(outra);
	    assertEquals(100, b.saldo(1));
	}
}
