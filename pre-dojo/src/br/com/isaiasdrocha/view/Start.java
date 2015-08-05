package br.com.isaiasdrocha.view;

import br.com.isaiasdrocha.business.PartidaImpl;
import br.com.isaiasdrocha.domain.Jogador;
import br.com.isaiasdrocha.enuns.EnumNivelDesafio;


public class Start {
	public static void main(String[] args) {
		//Instanciar objetos - Criar Jogador
		Jogador j11348965 = new Jogador("j11348965", EnumNivelDesafio.FACIL);
		
		//Instanciar objetos - Criar Partida
		PartidaImpl partida = new PartidaImpl();
		
		//Iniciar jogo
		partida.iniciarJogo(j11348965);
		
		
	}
}
