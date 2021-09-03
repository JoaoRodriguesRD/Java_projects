import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BancoTeste {

	@Test
	void test() {
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
	
	@Test
	void testarPesquisa() {
		Banco b = new Banco();
		Pessoa p  = new Pessoa(1);
		p.setNome("Pedro");
		Conta c = new Conta(1, p);
		b.cadastrar(c);
		
		b.deposito(1, 10);
		b.deposito(3, 10);
		b.saque(1, 10);
		b.saque(3, 10);

		assertEquals(-999999, b.saldo(3));	
		assertEquals("\n Credito: 10.0. Saldo: 10.0\n" + " Debito: 10.0. Saldo: 0.0", b.extrato(1));
		assertEquals("", b.extrato(3));
	}
	
	@Test
	void testarTransferencia() {
		Banco b = new Banco();
		Pessoa p  = new Pessoa(1);
		Pessoa p2 = new Pessoa(2);
		p.setNome("Pedro");
		p2.setNome("Maria");
		Conta c = new Conta(1, p);
		Conta c2 = new Conta(2, p2);
		b.cadastrar(c);
		b.cadastrar(c2);
		
		b.deposito(1, 10);
		b.deposito(2, 10);
		b.transferencia(1, 2, 5);
		
		assertEquals(5, b.saldo(1));
		assertEquals(15, b.saldo(2));
		
		b.transferencia(2, 3, 5);
		b.transferencia(3, 4, 5);
		
		assertEquals(15, b.saldo(2));
		assertEquals(-999999, b.saldo(3));
		
		b.transferencia(1, 2, 100);
		assertEquals(5, b.saldo(1));
		assertEquals(15, b.saldo(2));	
	}
	
	@Test
	void testarDadosPessoa() {
		Pessoa p = new Pessoa(1);
		p.setNome("Pedro");
		Conta c = new Conta(1, p);
		Banco b = new Banco();	
		b.cadastrar(c);
		
		Pessoa p2 = new Pessoa(2);
		assertEquals(null, p2.getNome());
		
		assertEquals("Pedro", p.getNome());	
		p.setNome("Maria");
		assertEquals("Maria", p.getNome());
		
		assertEquals(1, p.getCpf());
		assertEquals(p, c.getTitular());	
	}
	
	@Test
	void testarMuitasContas() {
		Pessoa p1 = new Pessoa(1);
		Pessoa p2 = new Pessoa(2);
		Pessoa p3 = new Pessoa(3);
		Pessoa p4 = new Pessoa(4);
		Pessoa p5 = new Pessoa(5);
		Pessoa p6 = new Pessoa(6);
		Pessoa p7 = new Pessoa(7);
		Pessoa p8 = new Pessoa(8);
		Pessoa p9 = new Pessoa(9);
		Pessoa p10 = new Pessoa(10);
		Pessoa p11 = new Pessoa(11);
		p1.setNome("Pedro");
		Conta c1 = new Conta(1, p1);
		Conta c2 = new Conta(2, p2);
		Conta c3 = new Conta(3, p3);
		Conta c4 = new Conta(4, p4);
		Conta c5 = new Conta(5, p5);
		Conta c6 = new Conta(6, p6);
		Conta c7 = new Conta(7, p7);
		Conta c8 = new Conta(8, p8);
		Conta c9 = new Conta(9, p9);
		Conta c10 = new Conta(10, p10);
		Conta c11 = new Conta(11, p11);

		Banco b = new Banco();	
		b.cadastrar(c1);
		b.cadastrar(c2);
		b.cadastrar(c3);
		b.cadastrar(c4);
		b.cadastrar(c5);
		b.cadastrar(c6);
		b.cadastrar(c7);
		b.cadastrar(c8);
		b.cadastrar(c9);
		b.cadastrar(c10);
		b.cadastrar(c11);
		
		b.deposito(1, 100);
		b.deposito(11, 50);
		assertEquals(c1.getSaldo(),100);
		assertEquals(c11.getSaldo(),50);
		
		
		
	}
	
	
}
