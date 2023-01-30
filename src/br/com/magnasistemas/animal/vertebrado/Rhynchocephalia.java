package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Rhynchocephalia extends Reptil {
	
	protected final boolean patas = true;
	protected final boolean escamasPontiagudas = true;
	protected final boolean olhoPineal = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.RHYNCHOCEPHALIA;
	
	public String autonomiaCaudal() {
		return "Soltando a cauda";
	}

}
