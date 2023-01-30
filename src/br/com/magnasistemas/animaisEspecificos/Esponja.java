package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.invertebrado.Porifero;

public class Esponja extends Porifero{
	
	String nome = "ESPONJA";

    public Esponja(EsponjaBuilder builder) {

    }

    public static class EsponjaBuilder{ 

        public Esponja build() {
            return new Esponja(this);
        }

    }
      
    @Override
    public String toString() {
    	return "\n\nANIMAL: " + this.nome + "\nTIPO: "  +  this.vertebradoInvertebrado + "\nTIPO DE SANGUE: " + this.sangue + "\nCLASSIFICACAO: " + this.classificacao;
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object o) {
        if((o instanceof Esponja)) {
        	return true;
        }else {
        	return false;
        }
    }

}
