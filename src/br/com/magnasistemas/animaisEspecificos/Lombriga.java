package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.invertebrado.Vermiforme;

public class Lombriga extends Vermiforme{
	
	String nome = "LOMBRIGA";

    public Lombriga(LombrigaBuilder builder) {

    }

    public static class LombrigaBuilder{ 

        public Lombriga build() {
            return new Lombriga(this);
        }

    }
      
    @Override
    public String toString() {
    	return "\n\nANIMAL: " + this.nome + "\nTIPO: "  +  this.vertebradoInvertebrado + "\nTIPO DE SANGUE: " + this.sangue + "\nCLASSIFICACAO: " + this.classificacao;
    }

	@Override
	public boolean causarDoencas() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean viverEmHospedeiro() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object o) {
        if((o instanceof Lombriga)) {
        	return true;
        }else {
        	return false;
        }
    }
    
    
}
