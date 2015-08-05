package br.com.isaiasdrocha.business;

import br.com.isaiasdrocha.domain.Jogador;
import br.com.isaiasdrocha.enuns.EnumStatusJogo;

public interface Partida {

	public void iniciarJogo(Jogador jogador);
	public EnumStatusJogo getStatusJogo(Jogador jogador);
	
}