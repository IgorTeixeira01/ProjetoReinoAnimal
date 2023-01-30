package br.com.magnasistemas.animal.invertebrado;

import br.com.magnasistemas.enumeradores.Classificacao;

public abstract class Equinodermo extends Invertebrado {
	
	protected final boolean espinhosNaPele = true;
	protected final int folhetosEmbrionarios = 3;
	protected final boolean celoma = true;
	protected final Classificacao classificacao = Classificacao.EQUINODERMO;
	
	public String fecundacao() {
		return "Os equinodermos fecundam externamente";
	}
	
}
