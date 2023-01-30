package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Marsupial extends Mamifero{
	
	protected final boolean patas = true;
	protected final boolean marsupio = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.MARSUPIAL;

	public boolean nascerDesenvolvido() {
		return false;
	}
	
	public boolean terminarDesenvolvimentoNoMarsupio() {
		return true;
	}

}
