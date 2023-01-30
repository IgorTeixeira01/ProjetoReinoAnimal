package br.com.magnasistemas.enumeradores;

public enum OssoEsterno {
		
	OSSO_ESTERNO_ACHATADO("Asa pequena e atrofiada"), 
	OSSO_ESTERNO_EM_FORMA_DE_QUILHA("Asa modificada para voo");

	private final String osso;

	OssoEsterno(String string) {
		this.osso = string;
	}

}
