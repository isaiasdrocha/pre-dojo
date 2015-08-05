package br.com.isaiasdrocha.domain;

import java.io.Serializable;

import br.com.isaiasdrocha.enuns.EnumNivelDesafio;

public class Cenario implements Serializable {

	/***********************************************/
	/*******************ATRIBUTOS*******************/
	/***********************************************/
	private static final long serialVersionUID = 1800102729793214166L;
	
	private Integer quantidadeInimigos;
	
	private EnumNivelDesafio nivelDificuldade;
	
	/***********************************************/
	/*******************CONSTRUTOR******************/
	/***********************************************/
	public Cenario(EnumNivelDesafio nivelDesafio, Integer quantidadeInimigos){
		this.nivelDificuldade = nivelDesafio;
		this.quantidadeInimigos = quantidadeInimigos;
	}
	
	/***********************************************/
	/**************GETTERS AND SETTERS**************/
	/***********************************************/

	public EnumNivelDesafio getNivelDificuldade() {
		return nivelDificuldade;
	}

	public void setNivelDificuldade(EnumNivelDesafio nivelDificuldade) {
		this.nivelDificuldade = nivelDificuldade;
	}

	public Integer getQuantidadeInimigos() {
		return quantidadeInimigos;
	}

	public void setQuantidadeInimigos(Integer quantidadeInimigos) {
		this.quantidadeInimigos = quantidadeInimigos;
	}

}