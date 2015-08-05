package br.com.isaiasdrocha.enuns;

public enum EnumArmas {

	PISTOLA_MANUAL(""),
	PISTOLA_AUTOMATICA(""),
	METRALHADORA("");

	private String arma;
	
	private EnumArmas(String arma){
		this.arma = arma;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
}