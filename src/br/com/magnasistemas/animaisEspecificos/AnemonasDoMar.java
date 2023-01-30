package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.invertebrado.Cnidario;

public class AnemonasDoMar extends Cnidario{
	
	String nome = "ANEMONAS-DO-MAR";

    public AnemonasDoMar(AnemonasDoMarBuilder builder) {

    }

    public static class AnemonasDoMarBuilder{ 

        public AnemonasDoMar build() {
            return new AnemonasDoMar(this);
        }

    }
      
    @Override
    public String toString() {
    	return "\n\nANIMAL: " + this.nome + "\nTIPO: "  +  this.vertebradoInvertebrado + "\nTIPO DE SANGUE: " + this.sangue + "\nCLASSIFICACAO: " + this.classificacao;
    }

	@Override
	public boolean locomover() {
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object o) {
        if((o instanceof AnemonasDoMar)) {
        	return true;
        }else {
        	return false;
        }
    }

}
