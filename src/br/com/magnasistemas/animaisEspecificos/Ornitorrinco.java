package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Monotremado;

public class Ornitorrinco extends Monotremado{
	
	String nome = "ORNITORRINCO";

    public Ornitorrinco(OrnitorrincoBuilder builder) {

    }

    public static class OrnitorrincoBuilder{ 

        public Ornitorrinco build() {
            return new Ornitorrinco(this);
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
        if((o instanceof Ornitorrinco)) {
        	return true;
        }else {
        	return false;
        }
    }

}
