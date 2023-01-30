package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Anura;

public class Sapo extends Anura{
	
	String nome = "SAPO";

    public Sapo(SapoBuilder builder) {

    }

    public static class SapoBuilder{ 

        public Sapo build() {
            return new Sapo(this);
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
        if((o instanceof Sapo)) {
        	return true;
        }else {
        	return false;
        }
    }

}
