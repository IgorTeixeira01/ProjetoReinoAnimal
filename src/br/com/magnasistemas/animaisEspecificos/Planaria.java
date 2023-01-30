package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.invertebrado.Vermiforme;

public class Planaria extends Vermiforme{
	
	String nome = "PLANARIA";

    public Planaria(PlanariaBuilder builder) {

    }

    public static class PlanariaBuilder{ 

        public Planaria build() {
            return new Planaria(this);
        }

    }
      
    @Override
    public String toString() {
    	return "\n\nANIMAL: " + this.nome + "\nTIPO: "  +  this.vertebradoInvertebrado + "\nTIPO DE SANGUE: " + this.sangue + "\nCLASSIFICACAO: " + this.classificacao;
    }

	@Override
	public boolean causarDoencas() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean viverEmHospedeiro() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object o) {
        if((o instanceof Planaria)) {
        	return true;
        }else {
        	return false;
        }
    }

}
