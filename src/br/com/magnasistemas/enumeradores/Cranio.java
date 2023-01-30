package br.com.magnasistemas.enumeradores;

public enum Cranio {
	
	COM_CRANIO("Com cranio"),
	SEM_CRANIO("Sem cranio");
	
	private final String cranio;

	Cranio(String string) {
		this.cranio = string;
	}
	
}
