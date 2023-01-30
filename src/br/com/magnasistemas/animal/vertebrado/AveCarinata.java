package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.Asa;
import br.com.magnasistemas.enumeradores.OssoEsterno;
import br.com.magnasistemas.enumeradores.TipoAnimal;

public abstract class AveCarinata extends Ave{
	
	protected final OssoEsterno osso = OssoEsterno.OSSO_ESTERNO_EM_FORMA_DE_QUILHA;
	protected final Asa asa = Asa.ASAS_DESENVOLVIDAS;
	protected final boolean cerebeloDesenvolvido = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.AVE_CARINATA;
	
	public abstract boolean voar();

}
