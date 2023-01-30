package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Anura extends Anfibio {

	protected final boolean cauda = false;
	protected final boolean corpoCurto = true;
	protected final boolean patas = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.ANURA;
	
	public String fecundacao() {
		return "Os Anuros fecundam externamente";
	}


}
