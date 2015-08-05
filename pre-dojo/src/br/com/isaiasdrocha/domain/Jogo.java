package br.com.isaiasdrocha.domain;

import java.io.Serializable;

import br.com.isaiasdrocha.enuns.EnumFase;

public class Jogo implements Serializable{

	/***********************************************/
	/*******************ATRIBUTOS*******************/
	/***********************************************/
	private static final long serialVersionUID = 4105153965437866487L;
	
	private Jogador jogador;
	
	private EnumFase fase;

	/***********************************************/
	/*******************CONSTRUTOR******************/
	/***********************************************/
	public Jogo(Jogador jogador, EnumFase fase){
		this.jogador = jogador;
		this.fase = fase;
	}
	
	/***********************************************/
	/**************GETTERS AND SETTERS**************/
 	/***********************************************/
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public EnumFase getFase() {
		return fase;
	}

	public void setFase(EnumFase fase) {
		this.fase = fase;
	}
	
	
	
}