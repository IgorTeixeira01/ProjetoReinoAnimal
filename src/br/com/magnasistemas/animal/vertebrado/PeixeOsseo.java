package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class PeixeOsseo extends Peixe{

	protected final boolean esqueletoOsseo = true;
	protected final boolean branquiasExpostas = false;
	protected final TipoAnimal tipoAnimal = TipoAnimal.PEIXE_OSSEO;

	public String fecundacao() {
		return "Os peixes ósseos fecundam externamente";
	}

}
