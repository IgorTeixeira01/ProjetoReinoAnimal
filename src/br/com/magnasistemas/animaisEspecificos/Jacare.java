package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Crocodylla;

public class Jacare extends Crocodylla{
	
	String nome = "JACARÉ";

    public Jacare(JacareBuilder builder) {

    }

    public static class JacareBuilder{ 

        public Jacare build() {
            return new Jacare(this);
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
        if((o instanceof Jacare)) {
        	return true;
        }else {
        	return false;
        }
    }

}
