package joaoRodriguesDeMelo;

import java.util.ArrayList;
import java.util.Date;

public class MinhaLocadora extends Locadora {

	ArrayList<ClienteCobranca> listaDoAgiota = new ArrayList<ClienteCobranca>();

	// tipo de veiculo
	// 0 (todos), 1 (moto), 2 (carro), 3 (caminhão), 4 (ônibus)
	public int tipoDoVeiculo(Veiculo v) {
		Veiculo aux1 = new Moto("", "", 0, 0, 0, "", 0);
		Veiculo aux2 = new Carro("", "", 0, 0, 0, "", 0);
		Veiculo aux3 = new Caminhao("", "", 0, 0, 0, "", 0);
		Veiculo aux4 = new Onibus("", "", 0, 0, 0, "", 0);

		if (v.getClass().equals(aux1.getClass())) {
			return 1;
		}
		if (v.getClass().equals(aux2.getClass())) {
			return 2;
		}
		if (v.getClass().equals(aux3.getClass())) {
			return 3;
		}
		if (v.getClass().equals(aux4.getClass())) {
			return 4;
		}
		return 0;
	}

	@Override
	public boolean inserir(Veiculo v) {
		Veiculo ve = pesquisar(v.getPlaca());
		if (ve == null) {
			veiculos.add(v);

			return true;
		} else {
			return false;
		}

	}

	public Veiculo pesquisar(String placa) {
		for (Veiculo v : veiculos) {
			if (v.getPlaca() == placa) {
				return v;
			}

		}
		return null;
	}

	@Override
	public ArrayList<Veiculo> pesquisarMoto(int cilindrada) {
		ArrayList<Veiculo> listaDeMotinhasSelecionadas = new ArrayList<Veiculo>();
		for (Veiculo motinha : veiculos) {
			if (tipoDoVeiculo(motinha) == 1) { // Realmente e uma moto
				if (((Moto) motinha).getCilindrada() >= cilindrada)
					listaDeMotinhasSelecionadas.add(motinha);
			}

		}
		return listaDeMotinhasSelecionadas;
	}

	// tipo de carro
	// 1 (passeio), 2 (SUV), 3 (pickup)
	@Override
	public ArrayList<Veiculo> pesquisarCarro(int tipoCarro) {
		ArrayList<Veiculo> listaDeCarrinhosSelecionados = new ArrayList<Veiculo>();
		for (Veiculo carrinho : veiculos) {
			if (tipoDoVeiculo(carrinho) == 2) { // Realmente e um carro
				if (((Carro) carrinho).getTipo() == tipoCarro) {
					listaDeCarrinhosSelecionados.add(carrinho);
				}
			}

		}
		return listaDeCarrinhosSelecionados;
	}

	@Override
	public ArrayList<Veiculo> pesquisarCaminhao(int carga) {
		ArrayList<Veiculo> listaDeCaminhoezinhosSelecionados = new ArrayList<Veiculo>();
		for (Veiculo caminhaozinho : veiculos) {
			if (tipoDoVeiculo(caminhaozinho) == 3) { // Realmente e um caminhao
				if (((Caminhao) caminhaozinho).getCarga() >= carga) {
					listaDeCaminhoezinhosSelecionados.add(caminhaozinho);
				}
			}

		}
		return listaDeCaminhoezinhosSelecionados;
	}

	@Override
	public ArrayList<Veiculo> pesquisarOnibus(int passageiros) {
		ArrayList<Veiculo> listaDeOnibusinhosSelecionados = new ArrayList<Veiculo>();
		for (Veiculo onibusinho : veiculos) {
			if (tipoDoVeiculo(onibusinho) == 4) { // Realmente e um onibus
				if (((Onibus) onibusinho).getPassageiros() >= passageiros) {
					listaDeOnibusinhosSelecionados.add(onibusinho);
				}
			}
		}
		return listaDeOnibusinhosSelecionados;
	}

	// Seguro Moto = (valor do bem * 11%)/365
	// Seguro Carro = (valor do bem * 3%)/365
	// Seguro Caminhão = (valor do bem * 8%)/365
	// Seguro Ônibus = (valor do bem * 20%)/365
	// Aluguel = (valor da diária + seguro) * quantidade de dias
	@Override
	public double calcularAluguel(String placa, int dias) {
		for (Veiculo v : veiculos) {
			if (v.getPlaca().equals(placa)) {
				return (v.getValorDiaria() + v.seguro()) * dias;
			}
		}
		return 0; // se nao achou a placa retorna zero.
	}

	// Retorna falso se veiculo não existir ou se estiver alugado.
	@Override
	public boolean registrarAluguel(String placa, Date data, int dias, int cpf) {
		for (Veiculo v : veiculos) {
			if (v.getPlaca().equals(placa) && !v.estaAlugado) {
				double precoAluguel;
				precoAluguel = calcularAluguel(placa, dias);
				Aluguel a = new Aluguel(placa, cpf, dias, precoAluguel, data);
				switch (tipoDoVeiculo(v)) {
				case 0:
					a.setTipo(0);
					alugueis.add(a);
					break;
				case 1:
					a.setTipo(1);
					alugueis.add(a);
					break;
				case 2:
					a.setTipo(2);
					alugueis.add(a);
					break;
				case 3:
					a.setTipo(3);
					alugueis.add(a);
					break;
				case 4:
					a.setTipo(4);
					alugueis.add(a);
					break;
				default:
					a.setTipo(0);
					alugueis.add(a);
					break;
				}
				ClienteCobranca divida = new ClienteCobranca(cpf, precoAluguel);
				listaDoAgiota.add(divida);
				v.estaAlugado = true;
				return true;
			}
		}
		return false;
	}

	// Retorna falso se veiculo não existir ou se não estiver alugado.
	@Override
	public boolean registrarDevolucao(String placa) {
		for (Veiculo v : veiculos) {
			if (v.getPlaca().equals(placa) && v.estaAlugado) {
				v.estaAlugado = false;
				return true;
			}
		}
		return false;
	}

	// tipo de veiculo
	// 0 (todos), 1 (moto), 2 (carro), 3 (caminhão), 4 (ônibus)
	@Override
	public void depreciarVeiculos(int tipo, double taxaDepreciacao) {
		switch (tipo) {
		case 0:
			for (Veiculo v : veiculos) { // Mudar de todos
				v.setValorAvaliado(v.getValorAvaliado() - v.getValorAvaliado() * taxaDepreciacao);
			}
			break;
		case 1:
			for (Veiculo v : veiculos) { // Mudar de Moto
				if (tipoDoVeiculo(v) == 1) {
					v.setValorAvaliado(v.getValorAvaliado() - v.getValorAvaliado() * taxaDepreciacao);
				}
			}
			break;
		case 2:
			for (Veiculo v : veiculos) { // Mudar de Carro
				if (tipoDoVeiculo(v) == 2) {
					v.setValorAvaliado(v.getValorAvaliado() - v.getValorAvaliado() * taxaDepreciacao);
				}
			}
			break;
		case 3:
			for (Veiculo v : veiculos) { // Mudar de Caminhão
				if (tipoDoVeiculo(v) == 3) {
					v.setValorAvaliado(v.getValorAvaliado() - v.getValorAvaliado() * taxaDepreciacao);
				}
			}
			break;
		case 4:
			for (Veiculo v : veiculos) { // Mudar de ônibus
				if (tipoDoVeiculo(v) == 4) {
					v.setValorAvaliado(v.getValorAvaliado() - v.getValorAvaliado() * taxaDepreciacao);
				}
			}
			break;
		}
	}

	@Override
	public void aumentarDiaria(int tipo, double taxaAumento) {
		switch (tipo) {
		case 0:
			for (Veiculo v : veiculos) { // Mudar de todos
				v.setValorDiaria(v.getValorDiaria() + v.getValorDiaria() * taxaAumento);
			}
			break;
		case 1:
			for (Veiculo v : veiculos) { // Mudar de Moto
				if (tipoDoVeiculo(v) == 1) {
					v.setValorDiaria(v.getValorDiaria() + v.getValorDiaria() * taxaAumento);
				}
			}
			break;
		case 2:
			for (Veiculo v : veiculos) { // Mudar de Carro
				if (tipoDoVeiculo(v) == 2) {
					v.setValorDiaria(v.getValorDiaria() + v.getValorDiaria() * taxaAumento);
				}
			}
			break;
		case 3:
			for (Veiculo v : veiculos) { // Mudar de Caminhão
				if (tipoDoVeiculo(v) == 3) {
					v.setValorDiaria(v.getValorDiaria() + v.getValorDiaria() * taxaAumento);
				}
			}
			break;
		case 4:
			for (Veiculo v : veiculos) { // Mudar de ônibus
				if (tipoDoVeiculo(v) == 4) {
					v.setValorDiaria(v.getValorDiaria() + v.getValorDiaria() * taxaAumento);
				}
			}
			break;
		}
	}

	@Override

	public double faturamentoTotal(int tipo, Date inicio, Date fim) {
		double faturamento = 0;
		if (tipo == 0) {
			for (Aluguel a : alugueis) {
				if (a.getComecoAluguel().after(inicio) && a.dataFinal().before(fim)) {
					faturamento += a.getPrecoAluguel();
				}

			}
		} else {

			for (Aluguel a : alugueis) {
				if (tipo == a.getTipo()) {
					if (a.getComecoAluguel().after(inicio) && a.dataFinal().before(fim)) {
						faturamento += a.getPrecoAluguel();
					}
				}
			}
		}

		return faturamento;
	}

	@Override
	public int quantidadeTotalDeDiarias(int tipo, Date inicio, Date fim) {
		int diarias = 0;

		if (tipo == 0) {
			for (Aluguel a : alugueis) {
				if (a.getComecoAluguel().after(inicio) && a.dataFinal().before(fim)) {
					diarias += a.getDiasDeAluguel();
				}

			}
		} else {

			for (Aluguel a : alugueis) {
				if (tipo == a.getTipo()) {
					if (a.getComecoAluguel().after(inicio) && a.dataFinal().before(fim)) {
						diarias += a.getDiasDeAluguel();
					}
				}
			}
		}

		return diarias;
	}

}
