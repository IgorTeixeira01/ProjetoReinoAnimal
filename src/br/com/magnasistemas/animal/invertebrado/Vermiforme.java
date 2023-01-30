package br.com.magnasistemas.animal.invertebrado;

import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.interfaces.Vermes;

public abstract class Vermiforme extends Invertebrado implements Vermes{

	protected final boolean corpoAlongadoTubularEMole = true;
	protected final Classificacao classificacao = Classificacao.VERMIFORME;
	
	public boolean locomover() {
		return true;
	}
	
	public String fecundacao() {
		return "A fecundação dos vermes pode ser interna ou externa";
	}

}
