package br.com.magnasistemas.animal.invertebrado;
import br.com.magnasistemas.animal.Animal;
import br.com.magnasistemas.enumeradores.ColunaVertebral;
import br.com.magnasistemas.enumeradores.Cranio;
import br.com.magnasistemas.enumeradores.Sangue;
import br.com.magnasistemas.enumeradores.VertebradoInvertebrado;

public abstract class Invertebrado extends Animal{
	
	protected final VertebradoInvertebrado vertebradoInvertebrado = VertebradoInvertebrado.INVERTEBRADO;
	protected final Cranio cranio = Cranio.SEM_CRANIO;
	protected final ColunaVertebral colunaVertebral = ColunaVertebral.SEM_COLUNA_VERTEBRAL;
	protected Sangue sangue = Sangue.SANGUE_FRIO;
	
	
}
