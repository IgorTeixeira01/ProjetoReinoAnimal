package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class PeixeCartilaginoso extends Peixe{

	protected final boolean esqueletoCartilaginoso = true;
	protected final boolean branquiasExpostas = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.PEIXE_CARTILAGINOSO;
	
	public String fecundacao() {
		return "Os peixes cartilaginosos fecundam internamente";
	}

}
