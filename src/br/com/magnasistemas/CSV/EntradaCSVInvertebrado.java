package br.com.magnasistemas.CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.animaisEspecificos.AguaViva;
import br.com.magnasistemas.animaisEspecificos.AnemonasDoMar;
import br.com.magnasistemas.animaisEspecificos.Aranha;
import br.com.magnasistemas.animaisEspecificos.Esponja;
import br.com.magnasistemas.animaisEspecificos.EstrelaDoMar;
import br.com.magnasistemas.animaisEspecificos.Lesma;
import br.com.magnasistemas.animaisEspecificos.Lombriga;
import br.com.magnasistemas.animaisEspecificos.Planaria;
import br.com.magnasistemas.enumeradores.Classificacao;
import br.com.magnasistemas.enumeradores.Sangue;
import br.com.magnasistemas.enumeradores.VertebradoInvertebrado;

public class EntradaCSVInvertebrado {
	static List<Object> registros = new ArrayList<>();
	static List<Object> pesquisa = new ArrayList<>();

	public static void main(String args[]) {
		Integer contador = 0;
		String separador = "--------------------------------";
		VertebradoInvertebrado vertebradoInvertebrado;
		Sangue sangue;
		Classificacao classificacao;

		try (BufferedReader br = new BufferedReader(new FileReader("arquivoEntradaInvertebrados.csv"))) {
			String linhas = br.readLine();
			while (br.ready()) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");

				vertebradoInvertebrado = VertebradoInvertebrado.valueOf(campo[0].toUpperCase());
				sangue = Sangue.valueOf(campo[1].toUpperCase());
				classificacao = Classificacao.valueOf(campo[2].toUpperCase());
				registros.add(vertebradoInvertebrado);
				registros.add(sangue);
				registros.add(classificacao);

				if (vertebradoInvertebrado == vertebradoInvertebrado.INVERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.VERMIFORME) {
					Lombriga lombriga = new Lombriga.LombrigaBuilder().build();
					Planaria planaria = new Planaria.PlanariaBuilder().build();
					pesquisa.add(lombriga);
					pesquisa.add(planaria);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.INVERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.PORIFERO) {
					Esponja esponja = new Esponja.EsponjaBuilder().build();
					pesquisa.add(esponja);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.INVERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.CNIDARIO) {
					AguaViva aguaViva = new AguaViva.AguaVivaBuilder().build();
					AnemonasDoMar anemonasDoMar = new AnemonasDoMar.AnemonasDoMarBuilder().build();
					pesquisa.add(aguaViva);
					pesquisa.add(anemonasDoMar);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.INVERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.EQUINODERMO) {
					EstrelaDoMar estrelaDoMar = new EstrelaDoMar.EstrelaDoMarBuilder().build();
					pesquisa.add(estrelaDoMar);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.INVERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.MOLUSCO) {
					Lesma lesma = new Lesma.LesmaBuilder().build();
					pesquisa.add(lesma);
				} else if (vertebradoInvertebrado == vertebradoInvertebrado.INVERTEBRADO && sangue == Sangue.SANGUE_FRIO
						&& classificacao == Classificacao.ARTROPODE) {
					Aranha aranha = new Aranha.AranhaBuilder().build();
					pesquisa.add(aranha);
				} else {
					System.out.println("ALGUM VALOR INSERIDO É INVÁLIDO!");
					break;
				}

			}

			br.readLine();
			for (Object object : pesquisa) {
				contador++;
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

//		SAÍDA CSV	
		try (PrintWriter escrever = new PrintWriter(new File("saidaCSVInvertebrado.csv"))) {
			StringBuilder sb = new StringBuilder();
			sb.append("ANIMAIS REGISTRADOS:\n");
			if (EntradaCSVInvertebrado.pesquisa.size() > 0) {
				sb.append(EntradaCSVInvertebrado.pesquisa);
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