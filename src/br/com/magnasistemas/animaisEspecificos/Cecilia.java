package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Apoda;

public class Cecilia extends Apoda{
	
	String nome = "CECILIA";

    public Cecilia(CeciliaBuilder builder) {

    }

    public static class CeciliaBuilder{ 

        public Cecilia build() {
            return new Cecilia(this);
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
        if((o instanceof Cecilia)) {
        	return true;
        }else {
        	return false;
        }
    }

}
