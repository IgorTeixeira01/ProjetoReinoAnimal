package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.PeixeCartilaginoso;

public class Tubarao extends PeixeCartilaginoso{
	
	String nome = "TUBARAO";

    public Tubarao(TubaraoBuilder builder) {

    }

    public static class TubaraoBuilder{ 

        public Tubarao build() {
            return new Tubarao(this);
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
        if((o instanceof Tubarao)) {
        	return true;
        }else {
        	return false;
        }
    }

}
