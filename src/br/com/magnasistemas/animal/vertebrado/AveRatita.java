package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.Asa;
import br.com.magnasistemas.enumeradores.OssoEsterno;
import br.com.magnasistemas.enumeradores.TipoAnimal;

public abstract class AveRatita extends Ave{
	
	protected final OssoEsterno osso = OssoEsterno.OSSO_ESTERNO_ACHATADO;
	protected final Asa asa = Asa.ASAS_ATROFIADAS;
	protected final boolean pernasLongas = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.AVE_RATITA;

	public String correrRapido() {
		return "A ave está correndo rápido";
	}

}
