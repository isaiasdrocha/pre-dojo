package br.com.isaiasdrocha.enuns;

import br.com.isaiasdrocha.domain.Cenario;

public enum EnumFase {

	FASE_1(1,"Fase 1", new Cenario(EnumNivelDesafio.FACIL, 1)),
	FASE_2(2,"Fase 2", new Cenario(EnumNivelDesafio.NORMAL, 1)),
	FASE_3(3,"Fase 3", new Cenario(EnumNivelDesafio.DIFICIL, 1));
	
	private String fase;
	private Cenario cenario;
	private Integer numeroFase;
	
	private EnumFase(Integer numeroFase, String fase, Cenario cenario){
		this.fase = fase;
		this.cenario = cenario;
		this.numeroFase = numeroFase;
	}

	public String getFase() {
		return fase;
	}

	public Cenario getCenario() {
		return cenario;
	}
	
	

	public Integer getNumeroFase() {
		return numeroFase;
	}

	public void setCenario(Cenario cenario) {
		this.cenario = cenario;
	}

}