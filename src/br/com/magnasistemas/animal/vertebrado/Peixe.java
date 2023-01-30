package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.enumeradores.Sangue;

public abstract class Peixe extends Vertebrado{
	
	protected final boolean branquias = true;
	protected final boolean nadadeiras = true;
	protected final boolean muco = true;
	protected final Sangue sangue = Sangue.SANGUE_FRIO;
	protected final Classificacao classificacao = Classificacao.PEIXE;
	
}
