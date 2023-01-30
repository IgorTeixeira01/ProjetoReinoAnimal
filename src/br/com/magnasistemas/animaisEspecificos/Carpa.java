package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.PeixeOsseo;

public class Carpa extends PeixeOsseo{
	
	String nome = "CARPA";

    public Carpa(CarpaBuilder builder) {

    }

    public static class CarpaBuilder{ 

        public Carpa build() {
            return new Carpa(this);
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
        if((o instanceof Carpa)) {
        	return true;
        }else {
        	return false;
        }
    }

}
