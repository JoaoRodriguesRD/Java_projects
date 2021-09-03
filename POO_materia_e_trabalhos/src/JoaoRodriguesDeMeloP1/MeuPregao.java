package JoaoRodriguesDeMeloP1;

import java.util.ArrayList;
import java.util.Date;

public class MeuPregao implements InterfacePregao {
	ArrayList<Servico> servicos = new ArrayList<Servico>();
	ArrayList<TipoDeServico> tiposDeServicos = new ArrayList<TipoDeServico>();

	private ArrayList<Proposta> propostas = new ArrayList<Proposta>();
	private ArrayList<Contratante> contratantes = new ArrayList<Contratante>();
	private ArrayList<Prestador> prestadores = new ArrayList<Prestador>();
	private ArrayList<Integer> codigos = new ArrayList<Integer>();
	private ArrayList<ServicoFinalizado> servicosFinalizados = new ArrayList<ServicoFinalizado>();

	@Override
	public int cadastrarServico(String emailContratante, String descricao, double valor, int prazoMaximo,
			int codTipoDeServico) {
		for (Contratante c : contratantes) {
			if (c.getEmail() == emailContratante) {
				if (!c.temServico) {
					for (TipoDeServico tp : tiposDeServicos) {
						if (tp.cod == codTipoDeServico) {
							Servico s = new Servico(valor, prazoMaximo, false, false, tp);
							c.temServico = true;
							int codigo = gerarCodigo();
							s.seuCodigo = codigo;
							s.setEmailContratante(emailContratante);
							servicos.add(s);
							return codigo;
						}
					}
				}
			}
		}

		return -1;
	}

	private int gerarCodigo() {
		if (codigos.isEmpty()) {
			codigos.add(0);
			return 0;
		}

		int x = codigos.size();
		if (codigos.contains(x)) {
			do {
				x++;
			} while (codigos.contains(x));
		}
		codigos.add(x);
		return x;
	}

	@Override
	public ArrayList<Servico> listarServicos(double valor, int prazoMaximo, int tipo, boolean contratado,
			boolean finalizado, int avaliacaoMediaContratante) {
		ArrayList<Servico> auxiliar = new ArrayList<Servico>();
		for (Servico s : servicos) {
			if (s.contratado == contratado) {
				if (s.finalizado == finalizado) {
					if (s.tipoDeServico.cod == tipo || tipo == 0) {// Considerei zero como todos os tipos
						if (s.avaliacaoMediaContratante >= avaliacaoMediaContratante) {
							if (s.valor >= valor) {
								if (s.prazoMaximo >= prazoMaximo) {
									auxiliar.add(s);
								}
							}

						}
					}
				}
			}
		}
		return auxiliar;
	}

	@Override
	public void cadastrarContratante(String email, String nome, String telefone) {
		for (Contratante c : contratantes) {
			if (c.getEmail() == email) {
				return;
			}
		}
		Contratante novo = new Contratante(email, nome, telefone);
		contratantes.add(novo);
	}

	@Override
	public void cadastrarPrestador(String email, String nome, String telefone) {
		for (Prestador p : prestadores) {
			if (p.email == email) {
				return;
			}
		}
		Prestador novo = new Prestador(email, nome, telefone, new ArrayList<Integer>());
		prestadores.add(novo);

	}

	@Override
	public void adicionarServicoPrestador(String email, int tipo) {
		for (Prestador p : prestadores) {
			if (p.email == email) {
				// tiposDeServicos
				for (TipoDeServico tp : tiposDeServicos) {
					if (tp.cod == tipo) {
						p.seusServicos.add(tipo);
					}
				}
			}
		}

	}

	@Override
	public void adicionarTipoDeServico(int cod, String descr) {
		for (TipoDeServico tp : tiposDeServicos) {
			if (tp.cod == cod && tp.descricao.equals(descr)) {
				return;
			}
		}
		tiposDeServicos.add(new TipoDeServico(cod, descr));
	}

	@Override
	public void cadastrarProposta(int codigoServico, String emailPrestador, double valor, int prazo) {
		for (Prestador p : prestadores) {
			if (p.email == emailPrestador) {
				for (Servico s : servicos) {
					if (s.seuCodigo == codigoServico) {
						if (p.seusServicos.contains(s.tipoDeServico.cod)) {// O prestador tem o servico
							if (valor <= s.valor) {
								if (prazo <= s.prazoMaximo) {
									propostas.add(new Proposta(codigoServico, emailPrestador, valor, prazo));
								}

							}
						}
					}
				}
			}
		}

	}

	@Override
	public ArrayList<Proposta> listarPropostas(int codigoServico, double valor, int prazoMaximo,
			int avaliacaoMediaPrestador) {
		ArrayList<Proposta> auxiliar = new ArrayList<Proposta>();
		for (Proposta p : propostas) {
			if (p.codigoServico == codigoServico) {
				if (p.valor <= valor || valor == 0) {
					if (p.prazo <= prazoMaximo || prazoMaximo == 0) {
						for (Prestador pre : prestadores) {
							if (pre.email == p.emailPrestador) {
								if (pre.getAvaliacaoMediaPrestador() >= avaliacaoMediaPrestador
										|| avaliacaoMediaPrestador == 0) {
									auxiliar.add(p);
								}
							}
						}
					}
				}
			}
		}
		return auxiliar;
	}

	@Override
	public void contratarProposta(int codigoServico, String emailPrestador) {
		for (Proposta p : propostas) {
			if (p.codigoServico == codigoServico) {
				p.servicoDaProposta.contratado = true;
				for (Contratante c : contratantes) {
					if (p.servicoDaProposta.getEmailContratante() == c.getEmail()) {
						c.temServico = false;
					}
				}
			}
		}
	}

	@Override
	public void finalizarServico(int codigoServico, Date data) {
		for (Proposta p : propostas) {
			if (p.codigoServico == codigoServico) {
				if (p.servicoDaProposta.contratado) {
					p.servicoDaProposta.finalizado = true;
					servicosFinalizados.add(new ServicoFinalizado(data, p));
					// ou fazer propostaFinalizada.servicoDaProposta.finalizado = true;
					// no construtor de ServicoFinalizado
				}
			}
		}

	}

	@Override
	public void avaliarPrestador(int codigoServico, int nota, String observacoes) {
		for (Proposta p : propostas) {
			if (p.codigoServico == codigoServico) {
				if (p.servicoDaProposta.finalizado) {
					for (Prestador pre : prestadores) {
						if (pre.email == p.emailPrestador) {
							pre.suasNotas.add(nota);
							pre.atualizarNota();
						}
					}
				}
			}
		}

	}

	@Override
	public void avaliarContratante(int codigoServico, int nota, String observacoes) {
		for (Proposta p : propostas) {
			if (p.codigoServico == codigoServico) {
				if (p.servicoDaProposta.finalizado) {
					for (Contratante c : contratantes) {
						if (c.getEmail() == p.servicoDaProposta.getEmailContratante()) {
							c.suasNotas.add(nota);
							c.atualizarNota();
						}
					}
				}
			}
		}
	}

}
