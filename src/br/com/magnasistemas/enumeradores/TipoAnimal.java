package br.com.magnasistemas.enumeradores;

public enum TipoAnimal {
	
	AVE_RATITA("Ave ratita"),
	AVE_CARINATA("Ave carinata"),
	MONOTREMADO("Monotremado"),
	MARSUPIAL("Marsupial"),
	PLACENTARIO("Placentario"),
	PEIXE_OSSEO("Peixe osseo"),
	PEIXE_CARTILAGINOSO("Peixe cartilaginoso"),
	TESTUDINE("Testudine"),
	CROCODYLLA("Crocodylla"),
	SQUAMATA("Squamata"),
	RHYNCHOCEPHALIA("Rhynchocephalia"),
	URODELA("Urodela"),
	ANURA("Anura"),
	APODA("Apoda");
	
	private final String tipoAnimal;
	
	TipoAnimal(String string) {
		this.tipoAnimal = string;
	}

}
