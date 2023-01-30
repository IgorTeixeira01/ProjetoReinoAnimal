package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Testudine;

public class Tartaruga extends Testudine{
	
	String nome = "TARTARUGA";

    public Tartaruga(TartarugaBuilder builder) {

    }

    public static class TartarugaBuilder{ 

        public Tartaruga build() {
            return new Tartaruga(this);
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
        if((o instanceof Tartaruga)) {
        	return true;
        }else {
        	return false;
        }
    }

}
