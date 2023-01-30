package br.com.magnasistemas.animal.vertebrado;
import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.enumeradores.Pele;
import br.com.magnasistemas.enumeradores.Sangue;

public abstract class Anfibio extends Vertebrado{
	
	protected final Pele pele = Pele.PELE_LISA_E_PERMEAVEL;
	protected final Sangue sangue = Sangue.SANGUE_FRIO;
	protected final Classificacao classificacao = Classificacao.ANFIBIO;
	protected final boolean glandulasProdutorasDeSecreçõesTóxicas = true;
	
	public boolean produzirSecrcoesTóxicas() {
		return true;
	}

}
