package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.invertebrado.Artropode;

public class Aranha extends Artropode{
	
	String nome = "ARANHA";

    public Aranha(AranhaBuilder builder) {

    }

    public static class AranhaBuilder{ 
    	
        public Aranha build(){
        	return new Aranha(this);
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
        if((o instanceof Aranha)) {
        	return true;
        }else {
        	return false;
        }
    }

}
