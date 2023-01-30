package br.com.magnasistemas.enumeradores;

public enum ColunaVertebral {
	
	COM_COLUNA_VERTEBRAL("Com coluna vertebral"),
	SEM_COLUNA_VERTEBRAL("Sem coluna vertebral");
	
	private final String colunaVertebral;

	ColunaVertebral(String string) {
		this.colunaVertebral = string;
	}
	
}
