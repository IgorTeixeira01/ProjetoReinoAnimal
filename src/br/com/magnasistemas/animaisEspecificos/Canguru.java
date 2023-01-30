package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Marsupial;

public class Canguru extends Marsupial{
	
	String nome = "CANGURU";

    public Canguru(CanguruBuilder builder) {

    }

    public static class CanguruBuilder{ 

        public Canguru build() {
            return new Canguru(this);
        }

    }

    @Override
    public String toString() {
    	return "\n\nANIMAL: " + this.nome + "\nTIPO: "  +  this.vertebradoInvertebrado + "\nTIPO DE SANGUE: " + this.sangue + "\nCLASSIFICACAO: " + this.classificacao + "\nTIPO ANIMAL: " + this.tipoAnimal;
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object o) {
        if((o instanceof Canguru)) {
        	return true;
        }else {
        	return false;
        }
    }


}
