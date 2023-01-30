package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Squamata extends Reptil {

	protected final boolean escamas = true;
	protected final boolean linguaBifurcada = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.SQUAMATA;
		
	public boolean movimentaPartesDoCranio() {
		return true;
	}

}
