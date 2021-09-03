package pedroSantosNeto.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteListaDeContas {

	@Test
	void testarInsercao() {
		ListaDeContas inicio = new ListaDeContas();
		Pessoa p = new Pessoa(1);
		p.setNome("Pedro");
		Conta c = new Conta(1, p);
		c.credito(99);
		inicio.inserir(c);
		Conta c2 = inicio.pesquisar(1);
		assertEquals(99, c2.getSaldo());
	}
	
	@Test
	void testarInsercaoMultipla() {
		ListaDeContas inicio = new ListaDeContas();
		Pessoa p = new Pessoa(1);
		p.setNome("Pedro");
		Conta c1 = new Conta(1, p);
		c1.credito(100);
		Conta c2 = new Conta(2, p);
		c2.credito(200);
		Conta c3 = new Conta(3, p);
		c3.credito(300);
		Conta c4 = new Conta(4, p);
		c4.credito(400);
		Conta c5 = new Conta(5, p);
		c5.credito(500);

		inicio.inserir(c1);
		inicio.inserir(c2);
		inicio.inserir(c3);
		inicio.inserir(c4);
		inicio.inserir(c5);

		Conta p5 = inicio.pesquisar(5);
		assertEquals(500, p5.getSaldo());
		Conta p4 = inicio.pesquisar(4);
		assertEquals(400, p4.getSaldo());
		Conta p3 = inicio.pesquisar(3);
		assertEquals(300, p3.getSaldo());
		Conta p2 = inicio.pesquisar(2);
		assertEquals(200, p2.getSaldo());
		Conta p1 = inicio.pesquisar(1);
		assertEquals(100, p1.getSaldo());
		Conta inexistente = inicio.pesquisar(11);
		assertNull(inexistente);
	}

	@Test
	void testarRemocao() {
		ListaDeContas inicio = new ListaDeContas();
		Pessoa p = new Pessoa(1);
		p.setNome("Pedro");
		Conta c1 = new Conta(1, p);
		c1.credito(100);
		Conta c2 = new Conta(2, p);
		c2.credito(200);
		Conta c3 = new Poupanca(3, p);
		c3.credito(300);
		Conta c4 = new Conta(4, p);
		c4.credito(400);
		Conta c5 = new Poupanca(5, p);
		c5.credito(500);
		Conta c6 = new Conta(6, p);
		c6.credito(600);

		inicio.inserir(c1);
		inicio.inserir(c2);
		inicio.inserir(c3);
		inicio.inserir(c4);
		inicio.inserir(c5);
		inicio.inserir(c6);
		
		inicio.remover(c4.getNumero());
		assertEquals(600, inicio.pesquisar(6).getSaldo());
		assertEquals(500, inicio.pesquisar(5).getSaldo());
		assertEquals(300, inicio.pesquisar(3).getSaldo());
		assertEquals(200, inicio.pesquisar(2).getSaldo());
		assertEquals(100, inicio.pesquisar(1).getSaldo());
		assertNull(inicio.pesquisar(4));

		inicio.remover(c1.getNumero());
		assertEquals(600, inicio.pesquisar(6).getSaldo());
		assertEquals(500, inicio.pesquisar(5).getSaldo());
		assertEquals(300, inicio.pesquisar(3).getSaldo());
		assertEquals(200, inicio.pesquisar(2).getSaldo());
		assertNull(inicio.pesquisar(1));
		assertNull(inicio.pesquisar(4));

		inicio.remover(c6.getNumero());
		assertEquals(500, inicio.pesquisar(5).getSaldo());
		assertEquals(300, inicio.pesquisar(3).getSaldo());
		assertEquals(200, inicio.pesquisar(2).getSaldo());
		assertNull(inicio.pesquisar(6));
		assertNull(inicio.pesquisar(1));
		assertNull(inicio.pesquisar(4));
		
		inicio.remover(11);
		assertEquals(500, inicio.pesquisar(5).getSaldo());
		assertEquals(300, inicio.pesquisar(3).getSaldo());
		assertEquals(200, inicio.pesquisar(2).getSaldo());
		assertNull(inicio.pesquisar(6));
		assertNull(inicio.pesquisar(1));
		assertNull(inicio.pesquisar(4));

	}

}
