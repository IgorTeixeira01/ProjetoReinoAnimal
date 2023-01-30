package br.com.magnasistemas.animal;
import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.enumeradores.Sangue;
import br.com.magnasistemas.enumeradores.VertebradoInvertebrado;
import br.com.magnasistemas.interfaces.Fecundacao;
import br.com.magnasistemas.interfaces.Locomocao;

public abstract class Animal implements Fecundacao, Locomocao{
	
	protected String nome;
	protected String cor;
	protected double peso;
	protected Sangue tipoSangue;
	protected VertebradoInvertebrado vertebradoInvertebrado;
	protected Classificacao classificacao;
	

	public String alimentar() {
		return "O animal está se alimentando";
	}
	public String respirar() {
		return "O animal está respirando";
	}
	public String reproduzir() {
		return "O animal está reproduzindo";
	}
	public String crescer() {
		return "O animal está crescendo";
	}
	public String morrer() {
		return "O animal está morrendo";
	}
	
}
