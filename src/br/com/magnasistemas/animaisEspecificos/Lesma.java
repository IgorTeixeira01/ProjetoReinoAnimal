package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.invertebrado.Molusco;

public class Lesma extends Molusco{
	
	String nome = "LESMA";

    public Lesma(LesmaBuilder builder) {

    }

    public static class LesmaBuilder{ 

        public Lesma build() {
            return new Lesma(this);
        }

    }
      
    @Override
    public String toString() {
    	return "\n\nANIMAL: " + this.nome + "\nTIPO: "  +  this.vertebradoInvertebrado + "\nTIPO DE SANGUE: " + this.sangue + "\nCLASSIFICACAO: " + this.classificacao;
    }

	@Override
	public boolean locomover() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object o) {
        if((o instanceof Lesma)) {
        	return true;
        }else {
        	return false;
        }
    }

}
