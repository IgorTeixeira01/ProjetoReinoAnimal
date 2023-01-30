package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Rhynchocephalia;

public class Tuatara extends Rhynchocephalia{
	String nome = "TUATARA";

    public Tuatara(TuataraBuilder builder) {

    }

    public static class TuataraBuilder{ 

        public Tuatara build() {
            return new Tuatara(this);
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
        if((o instanceof Tuatara)) {
        	return true;
        }else {
        	return false;
        }
    }
}
