package br.com.isaiasdrocha.business;

import br.com.isaiasdrocha.domain.Cenario;
import br.com.isaiasdrocha.domain.Jogador;
import br.com.isaiasdrocha.domain.Jogo;
import br.com.isaiasdrocha.enuns.EnumArmas;
import br.com.isaiasdrocha.enuns.EnumFase;
import br.com.isaiasdrocha.enuns.EnumNivelDesafio;
import br.com.isaiasdrocha.enuns.EnumStatusJogo;
import br.com.isaiasdrocha.exception.BusinessException;

public class PartidaImpl implements Partida {

	public void iniciarJogo(Jogador jogador) throws BusinessException {

		validarJogador(jogador);

		// Criar Jogo
		Jogo jogo = new Jogo(jogador, EnumFase.FASE_1);

		// Atribuir o jogador ao Jogo
		jogo.setJogador(jogador);

		// Carregar arma
		jogador.setArma(carregarArmamento(jogador.getNivelDesafio()));

		// Carregar cen‡rio
		jogo.getFase().setCenario(
				carregarCenario(jogador.getNivelDesafio(), jogo.getFase()));

		jogador.setStatusJogo(EnumStatusJogo.JOGANDO);
	}

	private void validarJogador(Jogador jogador) {
		if (jogador == null) {
			throw new BusinessException("ERRO: Jogador n‹o instanciado");
		}
		
		if (jogador.getNivelDesafio() == null){
			throw new BusinessException("ERRO: N’vel de desafio do jogador n‹o foi informado");
		}
		
		if (jogador.getNome() == null || "".equals(jogador.getNome())){
			throw new BusinessException("ERRO: Nome do jogador n‹o informado");
		}
	}

	public Cenario avancarCenario(EnumNivelDesafio nivelDesafio, EnumFase fase) {
		try {
			return carregarCenario(nivelDesafio, this.proximaFase(fase));
		} catch (Exception e) {
			return null;
		}
	}

	private EnumFase proximaFase(EnumFase faseAtual) {
		if (faseAtual == null) {
			return null;
		}

		switch (faseAtual) {
		case FASE_1:
			return EnumFase.FASE_2;
		case FASE_2:
			return EnumFase.FASE_3;
		}

		return null;
	}

	private Cenario carregarCenario(EnumNivelDesafio nivelDesafio, EnumFase fase) {
		switch (nivelDesafio) {
		case FACIL:
			return new Cenario(nivelDesafio, fase.getNumeroFase()
					* nivelDesafio.getDificuldade());
		case NORMAL:
			return new Cenario(nivelDesafio, fase.getNumeroFase()
					* nivelDesafio.getDificuldade());
		case DIFICIL:
			return new Cenario(nivelDesafio, fase.getNumeroFase()
					* nivelDesafio.getDificuldade());
		default:
			System.out.println("Erro ao definir o cen‡rio");
			break;
		}
		return null;
	}

	private EnumArmas carregarArmamento(EnumNivelDesafio nivelDesafio) {
		try {
			switch (nivelDesafio) {
			case FACIL:
				return EnumArmas.METRALHADORA;
			case NORMAL:
				return EnumArmas.PISTOLA_AUTOMATICA;
			case DIFICIL:
				return EnumArmas.PISTOLA_MANUAL;
			default:
				System.out.println("Erro ao selecionar arma");
				break;
			}
		} catch (Exception e) {
			System.out.println("Erro ao selecionar a arma " + e.getCause());
			e.printStackTrace();
		}
		return null;
	}

	public EnumStatusJogo getStatusJogo(Jogador jogador) {
		return jogador.getStatusJogo();
	}

}