package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Urodela extends Anfibio {

	protected final boolean caudaLonga = true;
	protected final boolean corpoLongilineo = true;
	protected final boolean patas = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.URODELA;
	
	public String fecundacao() {
		return "A maioria dos urodelos fecundam internamente, porém alguns apresentam fecundação externa";
	}
	


}
