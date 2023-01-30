package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Apoda extends Anfibio{
	
	protected final boolean patas = false;
	protected final boolean corpoAlongado = true;
	protected final boolean olhosReduzidos = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.APODA;
	
	public String funcionamentoOlhos() {
		return "Os olhos do apoda são pouco funcionais";
	}

	public String fecundacao() {
		return "Os anfibios do tipo Apoda fecundam internamente";
	}

}
