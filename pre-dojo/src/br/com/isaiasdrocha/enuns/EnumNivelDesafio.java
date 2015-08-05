package br.com.isaiasdrocha.enuns;

public enum EnumNivelDesafio {
	
	FACIL(5,"F‡cil"),
	NORMAL(10,"Normal"),
	DIFICIL(15,"Dif’cil");
	
	private EnumNivelDesafio(Integer dificuldade, String descricaoNivel){
		this.descricaoNivel = descricaoNivel;
		this.dificuldade = dificuldade;
	}

	private String descricaoNivel;
	private Integer dificuldade;

	public Integer getDificuldade() {
		return dificuldade;
	}

	public String getDescricaoNivel() {
		return descricaoNivel;
	}

}