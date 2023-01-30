package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.AveCarinata;

public class Tucano extends AveCarinata{
	
	String nome = "TUCANO";

    public Tucano(TucanoBuilder builder) {

    }

    public static class TucanoBuilder{ 

        public Tucano build() {
            return new Tucano(this);
        }

    }
    
    @Override
    public String toString() {
    	return "\n\nANIMAL: " + this.nome + "\nTIPO: "  +  this.vertebradoInvertebrado + "\nTIPO DE SANGUE: " + this.sangue + "\nCLASSIFICACAO: " + this.classificacao + "\nTIPO ANIMAL: " + this.tipoAnimal;
    }

	@Override
	public boolean voar() {
		// TODO Auto-generated method stub
		return true ;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object o) {
        if((o instanceof Tucano)) {
        	return true;
        }else {
        	return false;
        }
    }
}
