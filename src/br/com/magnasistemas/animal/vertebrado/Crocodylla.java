package br.com.magnasistemas.animal.vertebrado;

import br.com.magnasistemas.enumeradores.TipoAnimal;

public class Crocodylla extends Reptil {
	
	protected final boolean patas = true;
	protected final boolean placasCorneas = true;
	protected final boolean valvulaPalatal = true;
	protected final boolean focinhoLongoEAchatado = true;
	protected final boolean musculaturaDesenvolvida = true;
	protected final TipoAnimal tipoAnimal = TipoAnimal.CROCODYLLA;
	
	public String reproducao(String temperatura) {
		if(temperatura.equals("alta")) {
			return "Nascer� f�mea";
		}else if(temperatura.equals("baixa")) {
			return "Nascer� macho";
		}else {
			return "ERRO! Temperatura inv�lida";
		}
	}

}
