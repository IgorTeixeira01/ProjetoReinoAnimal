package br.com.magnasistemas.enumeradores;

public enum Classificacao {
	
	AVE("Ave"),
	MAMIFERO("Mamifero"),
	PEIXE("Peixe"),
	REPTIL("Reptil"),
	ANFIBIO("Anfibio"),
	VERMIFORME("Vermiforme"),
	PORIFERO("Porifero"),
	CNIDARIO("Cnidario"),
	EQUINODERMO("Equinodermo"),
	MOLUSCO("Molusco"),
	ARTROPODE("Artropode");
	
	private final String classificacao;
	
	Classificacao(String string){
		this.classificacao = string;
	}

}
