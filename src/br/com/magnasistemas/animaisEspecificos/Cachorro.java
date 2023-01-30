package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Placentario;

public class Cachorro extends Placentario{
	String nome = "CACHORRO";

    public Cachorro(CachorroBuilder builder) {

    }

    public static class CachorroBuilder{ 

        public Cachorro build() {
            return new Cachorro(this);
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
        if((o instanceof Cachorro)) {
        	return true;
        }else {
        	return false;
        }
    }
}
