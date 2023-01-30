package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.animal.Animal;
import br.com.magnasistemas.enumeradores.ColunaVertebral;
import br.com.magnasistemas.enumeradores.Cranio;
import br.com.magnasistemas.enumeradores.VertebradoInvertebrado;

public abstract class Vertebrado extends Animal{
	
	protected final VertebradoInvertebrado vertebradoInvertebrado = VertebradoInvertebrado.VERTEBRADO;
	protected final Cranio cranio = Cranio.COM_CRANIO;
	protected final ColunaVertebral colunaVertebral = ColunaVertebral.COM_COLUNA_VERTEBRAL;
	
	@Override
	public boolean locomover() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
