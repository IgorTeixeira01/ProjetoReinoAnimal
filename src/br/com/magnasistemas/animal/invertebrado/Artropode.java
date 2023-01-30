package br.com.magnasistemas.animal.invertebrado;

import br.com.magnasistemas.enumeradores.Classificacao;

public abstract class Artropode extends Invertebrado{

	protected final int folhetosEmbrionarios = 3;
	protected final boolean celoma = true;
	protected final boolean corpoSegmentado = true;
	protected final boolean apendicesArticulados = true;
	protected final Classificacao classificacao = Classificacao.ARTROPODE;
	
	@Override
	public boolean locomover() {
		return true;
	}
	
	public String fecundacao() {
		return "Os artropodes podem fecundar internamente ou externamente";
	}
	
	
}
