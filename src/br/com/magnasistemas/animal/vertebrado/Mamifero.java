package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.enumeradores.Sangue;

public abstract class Mamifero extends Vertebrado{

	protected final boolean pelos = true;
	protected final boolean glandulasMamarias = true;
	protected final boolean Diafragma = true;
	protected final Sangue sangue = Sangue.SANGUE_QUENTE;
	protected final Classificacao classificacao = Classificacao.MAMIFERO;
	
	public String fecundacao() {
		return "Os mamiferos fecundam internamente";
	}
		
}
