package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Monotremado extends Mamifero{
	
	protected final boolean patas = true;
	protected final boolean mamasComMamilos = false;
	protected final TipoAnimal tipoAnimal = TipoAnimal.MONOTREMADO;
	
	public String botarOvo() {
		return "O mamifero está botando ovos";
	}

}
