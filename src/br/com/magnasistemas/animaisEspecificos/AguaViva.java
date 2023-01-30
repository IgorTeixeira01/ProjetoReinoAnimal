package br.com.magnasistemas.animaisEspecificos;

import java.util.Objects;

import br.com.magnasistemas.animal.invertebrado.Cnidario;

public class AguaViva extends Cnidario{
	
	String nome = "AGUA-VIVA";

    public AguaViva(AguaVivaBuilder builder) {

    }

    public static class AguaVivaBuilder{ 

        public AguaViva build() {
            return new AguaViva(this);
        }

    }
      
    @Override
    public String toString() {
    	return "\n\nANIMAL: " + this.nome + "\nTIPO: "  +  this.vertebradoInvertebrado + "\nTIPO DE SANGUE: " + this.sangue + "\nCLASSIFICACAO: " + this.classificacao;
    }

	@Override
	public boolean locomover() {
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object o) {
        if((o instanceof AguaViva)) {
        	return true;
        }else {
        	return false;
        }
    }

}
