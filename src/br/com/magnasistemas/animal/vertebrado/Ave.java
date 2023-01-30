package br.com.magnasistemas.animal.vertebrado;
import br.com.magnasistemas.enumeradores.Asa;
import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.enumeradores.OssoEsterno;
import br.com.magnasistemas.enumeradores.Pele;
import br.com.magnasistemas.enumeradores.Sangue;

public abstract class Ave extends Vertebrado{
	
	protected final boolean pena = true;
	protected final boolean patas = true;
	protected final boolean bicoCorneo = true;
	protected final Sangue sangue = Sangue.SANGUE_QUENTE;
	protected Pele pele = Pele.PELE_FINA_E_ELASTICA;
	protected final Classificacao classificacao = Classificacao.AVE;
	protected Asa tipoAsa;
	protected OssoEsterno tipoOsso;
	
	public String botarOvo() {
		return "A ave está botando ovos";
	}
	
	public String fecundacao() {
		return "As aves fecundam internamente";
	}
	
	
	
	
}
