package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.AveRatita;

public class Avestruz extends AveRatita{

	    String nome = "AVESTRUZ";

	    public Avestruz(AvestruzBuilder builder) {

	    }

	    public static class AvestruzBuilder{ 

	        public Avestruz build() {
	            return new Avestruz(this);
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
	        if((o instanceof Avestruz)) {
	        	return true;
	        }else {
	        	return false;
	        }
	    }

}
