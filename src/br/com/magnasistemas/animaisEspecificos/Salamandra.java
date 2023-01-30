package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.vertebrado.Urodela;

public class Salamandra extends Urodela{
	
	String nome = "SALAMANDRA";

    public Salamandra(SalamandraBuilder builder) {

    }

    public static class SalamandraBuilder{ 

        public Salamandra build() {
            return new Salamandra(this);
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
        if((o instanceof Salamandra)) {
        	return true;
        }else {
        	return false;
        }
    }

}
