package br.com.magnasistemas.enumeradores;

public enum Pele {

	PELE_FINA_E_ELASTICA("Pele fina e elastica"), 
	PELE_GROSSA_E_SECA("Pele grossa e seca"),
	PELE_LISA_E_PERMEAVEL("Pele lisa e permeavel");

	private final String pele;

	Pele(String string) {
		this.pele = string;
	}

}
