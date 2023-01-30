package br.com.magnasistemas.CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.animaisEspecificos.Avestruz;
import br.com.magnasistemas.animaisEspecificos.Cachorro;
import br.com.magnasistemas.animaisEspecificos.Canguru;
import br.com.magnasistemas.animaisEspecificos.Carpa;
import br.com.magnasistemas.animaisEspecificos.Cecilia;
import br.com.magnasistemas.animaisEspecificos.Jacare;
import br.com.magnasistemas.animaisEspecificos.Ornitorrinco;
import br.com.magnasistemas.animaisEspecificos.Salamandra;
import br.com.magnasistemas.animaisEspecificos.Sapo;
import br.com.magnasistemas.animaisEspecificos.Serpente;
import br.com.magnasistemas.animaisEspecificos.Tartaruga;
import br.com.magnasistemas.animaisEspecificos.Tuatara;
import br.com.magnasistemas.animaisEspecificos.Tubarao;
import br.com.magnasistemas.animaisEspecificos.Tucano;
import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.enumeradores.Sangue;
import br.com.magnasistemas.enumeradores.TipoAnimal;
import br.com.magnasistemas.enumeradores.VertebradoInvertebrado;

public class EntradaCSVVertebrado {
	static List<Object> registros = new ArrayList<>();
	static List<Object> pesquisa = new ArrayList<>();

	public static void main(String args[]) {
		Integer cont = 0;
		String separador = "--------------------------------";
		VertebradoInvertebrado vertebradoInvertebrado;
		Sangue sangue;
		Classificacao classificacao;
		TipoAnimal tipoAnimal;

		try (BufferedReader br = new BufferedReader(new FileReader("arquivoEntradaVertebrados.csv"))) {
			String linhas = br.readLine();
			while (br.ready()) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");

				vertebradoInvertebrado = VertebradoInvertebrado.valueOf(campo[0].toUpperCase());
				sangue = Sangue.valueOf(campo[1].toUpperCase());
				classificacao = Classificacao.valueOf(campo[2].toUpperCase());
				tipoAnimal = TipoAnimal.valueOf(campo[3].toUpperCase());
				registros.add(vertebradoInvertebrado);
				registros.add(sangue);
				registros.add(classificacao);
				registros.add(tipoAnimal);

				if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_QUENTE
						&& classificacao == Classificacao.AVE && tipoAnimal == TipoAnimal.AVE_RATITA) {
					Avestruz avestruz = new Avestruz.AvestruzBuilder().build();
					pesquisa.add(avestruz);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_QUENTE
						&& classificacao == Classificacao.AVE && tipoAnimal == TipoAnimal.AVE_CARINATA) {
					Tucano tucano = new Tucano.TucanoBuilder().build();
					pesquisa.add(tucano);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_QUENTE
						&& classificacao == Classificacao.MAMIFERO && tipoAnimal == TipoAnimal.MONOTREMADO) {
					Ornitorrinco ornitorrinco = new Ornitorrinco.OrnitorrincoBuilder().build();
					pesquisa.add(ornitorrinco);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_QUENTE
						&& classificacao == Classificacao.MAMIFERO && tipoAnimal == TipoAnimal.MARSUPIAL) {
					Canguru canguru = new Canguru.CanguruBuilder().build();
					pesquisa.add(canguru);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_QUENTE
						&& classificacao == Classificacao.MAMIFERO && tipoAnimal == TipoAnimal.PLACENTARIO) {
					Cachorro cachorro = new Cachorro.CachorroBuilder().build();
					pesquisa.add(cachorro);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.PEIXE && tipoAnimal == TipoAnimal.PEIXE_OSSEO) {
					Carpa carpa = new Carpa.CarpaBuilder().build();
					pesquisa.add(carpa);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.PEIXE && tipoAnimal == TipoAnimal.PEIXE_CARTILAGINOSO) {
					Tubarao tubarao = new Tubarao.TubaraoBuilder().build();
					pesquisa.add(tubarao);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.REPTIL && tipoAnimal == TipoAnimal.TESTUDINE) {
					Tartaruga tartaruga = new Tartaruga.TartarugaBuilder().build();
					pesquisa.add(tartaruga);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.REPTIL && tipoAnimal == TipoAnimal.CROCODYLLA) {
					Jacare jacare = new Jacare.JacareBuilder().build();
					pesquisa.add(jacare);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.REPTIL && tipoAnimal == TipoAnimal.SQUAMATA) {
					Serpente serpente = new Serpente.SerpenteBuilder().build();
					pesquisa.add(serpente);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.REPTIL && tipoAnimal == TipoAnimal.RHYNCHOCEPHALIA) {
					Tuatara tuatara = new Tuatara.TuataraBuilder().build();
					pesquisa.add(tuatara);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.ANFIBIO && tipoAnimal == TipoAnimal.URODELA) {
					Salamandra salamandra = new Salamandra.SalamandraBuilder().build();
					pesquisa.add(salamandra);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.ANFIBIO && tipoAnimal == TipoAnimal.ANURA) {
					Sapo sapo = new Sapo.SapoBuilder().build();
					pesquisa.add(sapo);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.VERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.ANFIBIO && tipoAnimal == TipoAnimal.APODA) {
					Cecilia cecilia = new Cecilia.CeciliaBuilder().build();
					pesquisa.add(cecilia);
				} else {
					System.out.println("ALGUM VALOR INSERIDO É INVÁLIDO!");
					break;
				}

			}

			br.readLine();
			for (Object object : pesquisa) {
				cont++;
				System.out.println(object);
				System.out.println(separador);
			}

		} catch (IOException e) {
			System.out.println("O SEGUINTE ERRO FOI ENCONTRADO: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("ALGUM VALOR INSERIDO É INVÁLIDO!" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ALGUM CAMPO NÃO FOI PREENCHIDO!" + e.getMessage());
		}

//	SAÍDA CSV		
		try (PrintWriter escrever = new PrintWriter(new File("saidaCSVVertebrado.csv"))) {
			StringBuilder sb = new StringBuilder();
			sb.append("ANIMAIS REGISTRADOS:\n");
			
			if (EntradaCSVVertebrado.pesquisa.size() > 0) {
				sb.append(EntradaCSVVertebrado.pesquisa);
				escrever.write(sb.toString());
				escrever.close();
				System.out.println("FEITO!");
			}else {
				System.out.println("NENHUM DADO FOI INSERIDO NO ARQUIVO DE SAÍDA!");
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}