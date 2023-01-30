package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Placentario extends Mamifero{

	protected final boolean placenta = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.PLACENTARIO;

	public boolean nascerDesenvolvido() {
		return true;
	}

}
