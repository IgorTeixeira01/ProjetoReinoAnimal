package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Squamata;

public class Serpente extends Squamata{
	String nome = "SERPENTE";

    public Serpente(SerpenteBuilder builder) {

    }

    public static class SerpenteBuilder{ 

        public Serpente build() {
            return new Serpente(this);
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
        if((o instanceof Serpente)) {
        	return true;
        }else {
        	return false;
        }
    }
}
