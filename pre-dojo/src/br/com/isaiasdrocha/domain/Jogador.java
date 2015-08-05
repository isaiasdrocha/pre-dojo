package br.com.isaiasdrocha.domain;

import java.io.Serializable;

import br.com.isaiasdrocha.enuns.EnumArmas;
import br.com.isaiasdrocha.enuns.EnumNivelDesafio;
import br.com.isaiasdrocha.enuns.EnumStatusJogo;

public class Jogador implements Serializable{

	/***********************************************/
	/*******************ATRIBUTOS*******************/
	/***********************************************/
	private static final long serialVersionUID = -2956701323464733809L;
	
	private String nome;
	private EnumArmas arma;
	private EnumNivelDesafio nivelDesafio;
	private EnumStatusJogo statusJogo;
	
	/***********************************************/
	/*******************CONSTRUTOR******************/
	/***********************************************/
	public Jogador(String nome, EnumNivelDesafio desafio){
		this.nome = nome;
		this.nivelDesafio = desafio;
		this.statusJogo = EnumStatusJogo.PARADO;
	}
	
	/***********************************************/
	/**************GETTERS AND SETTERS**************/
	/***********************************************/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public EnumNivelDesafio getNivelDesafio() {
		return nivelDesafio;
	}
	public void setNivelDesafio(EnumNivelDesafio nivelDesafio) {
		this.nivelDesafio = nivelDesafio;
	}

	public EnumArmas getArma() {
		return arma;
	}

	public void setArma(EnumArmas arma) {
		this.arma = arma;
	}

	public EnumStatusJogo getStatusJogo() {
		return statusJogo;
	}

	public void setStatusJogo(EnumStatusJogo statusJogo) {
		this.statusJogo = statusJogo;
	}
	
}