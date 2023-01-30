package br.com.magnasistemas.animal.invertebrado;

import br.com.magnasistemas.enumeradores.Classificacao;

public abstract class Molusco extends Invertebrado{

	protected final boolean corpoMole = true;
	protected final boolean pe = true;
	protected final boolean massaVisceral = true;
	protected final boolean manto = true;
	protected final int folhetosEmbrionarios = 3;
	protected final boolean celoma = true;
	protected final Classificacao classificacao = Classificacao.MOLUSCO;
	
	public String fecundacao() {
		return "Os Moluscos podem fecundar internamente ou externamente";
	}
	
	
}
