package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.invertebrado.Equinodermo;

public class EstrelaDoMar extends Equinodermo{
	
	String nome = "ESTRELA DO MAR";

    public EstrelaDoMar(EstrelaDoMarBuilder builder) {

    }

    public static class EstrelaDoMarBuilder{ 

        public EstrelaDoMar build() {
            return new EstrelaDoMar(this);
        }

    }
    
	@Override
	public boolean locomover() {
		// TODO Auto-generated method stub
		return true;
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
        if((o instanceof EstrelaDoMar)) {
        	return true;
        }else {
        	return false;
        }
    }

}
