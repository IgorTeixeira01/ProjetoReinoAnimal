package br.com.magnasistemas.animal.vertebrado;
import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.enumeradores.Pele;
import br.com.magnasistemas.enumeradores.Sangue;

public abstract class Reptil extends Vertebrado{

	protected final Pele pele = Pele.PELE_GROSSA_E_SECA;
	protected final Sangue sangue = Sangue.SANGUE_FRIO;
	protected final Classificacao classificacao = Classificacao.REPTIL;
	protected final boolean Cauda = true;
	
	public String fecundacao() {
		return "Os répteis fecundam internamente";
	}

}
