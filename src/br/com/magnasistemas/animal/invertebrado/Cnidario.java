package br.com.magnasistemas.animal.invertebrado;

import br.com.magnasistemas.enumeradores.Classificacao;

public abstract class Cnidario extends Invertebrado{
	
	protected final boolean tecidos = true;
	protected final boolean tentaculos = true;
	protected final Classificacao classificacao = Classificacao.CNIDARIO;
	
	public String fecundacao() {
		return "Os Cnidarios podem fecundar internamente ou externamente";
	}
}
