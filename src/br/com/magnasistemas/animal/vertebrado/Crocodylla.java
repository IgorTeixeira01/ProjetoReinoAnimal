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
			return "Nascerá fêmea";
		}else if(temperatura.equals("baixa")) {
			return "Nascerá macho";
		}else {
			return "ERRO! Temperatura inválida";
		}
	}

}
