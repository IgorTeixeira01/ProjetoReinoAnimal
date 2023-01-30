package br.com.magnasistemas.enumeradores;
public enum Sangue {
	
	SANGUE_FRIO("Sangue frio"), 
	SANGUE_QUENTE("Sangue quente");
	
	final String sangue;

	private Sangue(String string) {
		this.sangue = string;
	}
}
