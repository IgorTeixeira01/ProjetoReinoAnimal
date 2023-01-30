package br.com.magnasistemas.animal.invertebrado;

import br.com.magnasistemas.enumeradores.Classificacao;

public abstract class Porifero extends Invertebrado {

	protected final boolean tecidos = false;
	protected final boolean muitosPoros = true;
	protected final Classificacao classificacao = Classificacao.PORIFERO;
	
	public boolean filtraNutrientes() {
		return true;
	}
	
	@Override
	public boolean locomover() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String fecundacao() {
		return "Os poriferos fecundam internamente";
	}
}
