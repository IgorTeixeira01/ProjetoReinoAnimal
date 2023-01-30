package br.com.magnasistemas.enumeradores;

public enum Asa {
	
	ASAS_ATROFIADAS("Asa atrofiada"), 
	ASAS_DESENVOLVIDAS("Asa desenvolvidas");

	private final String asa;

	Asa(String string) {
		this.asa = string;
	}
}
