package br.com.magnasistemas.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

import br.com.magnasistemas.animaisEspecificos.AguaViva;
import br.com.magnasistemas.animaisEspecificos.AnemonasDoMar;
import br.com.magnasistemas.animaisEspecificos.Aranha;
import br.com.magnasistemas.animaisEspecificos.Avestruz;
import br.com.magnasistemas.animaisEspecificos.Cachorro;
import br.com.magnasistemas.animaisEspecificos.Canguru;
import br.com.magnasistemas.animaisEspecificos.Carpa;
import br.com.magnasistemas.animaisEspecificos.Cecilia;
import br.com.magnasistemas.animaisEspecificos.Esponja;
import br.com.magnasistemas.animaisEspecificos.EstrelaDoMar;
import br.com.magnasistemas.animaisEspecificos.Jacare;
import br.com.magnasistemas.animaisEspecificos.Lesma;
import br.com.magnasistemas.animaisEspecificos.Lombriga;
import br.com.magnasistemas.animaisEspecificos.Ornitorrinco;
import br.com.magnasistemas.animaisEspecificos.Planaria;
import br.com.magnasistemas.animaisEspecificos.Salamandra;
import br.com.magnasistemas.animaisEspecificos.Sapo;
import br.com.magnasistemas.animaisEspecificos.Serpente;
import br.com.magnasistemas.animaisEspecificos.Tartaruga;
import br.com.magnasistemas.animaisEspecificos.Tuatara;
import br.com.magnasistemas.animaisEspecificos.Tubarao;
import br.com.magnasistemas.animaisEspecificos.Tucano;
import br.com.magnasistemas.animal.invertebrado.Artropode;
import br.com.magnasistemas.animal.invertebrado.Cnidario;
import br.com.magnasistemas.animal.invertebrado.Equinodermo;
import br.com.magnasistemas.animal.invertebrado.Molusco;
import br.com.magnasistemas.animal.invertebrado.Porifero;
import br.com.magnasistemas.animal.invertebrado.Vermiforme;
import br.com.magnasistemas.animal.vertebrado.Anura;
import br.com.magnasistemas.animal.vertebrado.Apoda;
import br.com.magnasistemas.animal.vertebrado.AveCarinata;
import br.com.magnasistemas.animal.vertebrado.AveRatita;
import br.com.magnasistemas.animal.vertebrado.Crocodylla;
import br.com.magnasistemas.animal.vertebrado.Marsupial;
import br.com.magnasistemas.animal.vertebrado.Monotremado;
import br.com.magnasistemas.animal.vertebrado.PeixeCartilaginoso;
import br.com.magnasistemas.animal.vertebrado.PeixeOsseo;
import br.com.magnasistemas.animal.vertebrado.Placentario;
import br.com.magnasistemas.animal.vertebrado.Rhynchocephalia;
import br.com.magnasistemas.animal.vertebrado.Squamata;
import br.com.magnasistemas.animal.vertebrado.Testudine;
import br.com.magnasistemas.animal.vertebrado.Urodela;

public class TesteClasseAnimal {

// 		TESTANTO SE OS OBJETOS SÃO DIFERENTE DE NULL
	@Test
	public void testandoSeAvestruzIgualANull() {
		AveRatita avestruz = new Avestruz.AvestruzBuilder().build();
		assertNotEquals(avestruz, null);
	}

	@Test
	public void testandoSeTucanoIgualANull() {
		AveCarinata tucano = new Tucano.TucanoBuilder().build();
		assertNotEquals(tucano, null);
	}

	@Test
	public void testandoSeOrnitorrincoIgualANull() {
		Monotremado ornitorrinco = new Ornitorrinco.OrnitorrincoBuilder().build();
		assertNotEquals(ornitorrinco, null);
	}

	@Test
	public void testandoSeCanguruIgualANull() {
		Marsupial canguru = new Canguru.CanguruBuilder().build();
		assertNotEquals(canguru, null);
	}

	@Test
	public void testandoSeCachorroIgualANull() {
		Placentario cachorro = new Cachorro.CachorroBuilder().build();
		assertNotEquals(cachorro, null);
	}

	@Test
	public void testandoSeCarpaIgualANull() {
		PeixeOsseo carpa = new Carpa.CarpaBuilder().build();
		assertNotEquals(carpa, null);
	}

	@Test
	public void testandoSeTubaraoIgualANull() {
		PeixeCartilaginoso tubarao = new Tubarao.TubaraoBuilder().build();
		assertNotEquals(tubarao, null);
	}

	@Test
	public void testandoSeTartarugaIgualANull() {
		Testudine tartaruga = new Tartaruga.TartarugaBuilder().build();
		assertNotEquals(tartaruga, null);
	}

	@Test
	public void testandoSeJacareIgualANull() {
		Crocodylla jacare = new Jacare.JacareBuilder().build();
		assertNotEquals(jacare, null);
	}

	@Test
	public void testandoSeSerpenteIgualANull() {
		Squamata serpente = new Serpente.SerpenteBuilder().build();
		assertNotEquals(serpente, null);
	}

	@Test
	public void testandoSeTuataraIgualANull() {
		Rhynchocephalia tuatara = new Tuatara.TuataraBuilder().build();
		assertNotEquals(tuatara, null);
	}

	@Test
	public void testandoSeSalamandraIgualANull() {
		Urodela salamandra = new Salamandra.SalamandraBuilder().build();
		assertNotEquals(salamandra, null);
	}

	@Test
	public void testandoSeSapoIgualANull() {
		Anura sapo = new Sapo.SapoBuilder().build();
		assertNotEquals(sapo, null);
	}

	@Test
	public void testandoSeCeciliaIgualANull() {
		Apoda cecilia = new Cecilia.CeciliaBuilder().build();
		assertNotEquals(cecilia, null);
	}

	@Test
	public void testandoSeLombrigaIgualANull() {
		Vermiforme lombriga = new Lombriga.LombrigaBuilder().build();
		assertNotEquals(lombriga, null);
	}

	@Test
	public void testandoSePlanariaIgualANull() {
		Vermiforme planaria = new Planaria.PlanariaBuilder().build();
		assertNotEquals(planaria, null);
	}

	@Test
	public void testandoSeEsponjaIgualANull() {
		Porifero esponja = new Esponja.EsponjaBuilder().build();
		assertNotEquals(esponja, null);
	}

	@Test
	public void testandoSeAguaVivaIgualANull() {
		Cnidario aguaViva = new AguaViva.AguaVivaBuilder().build();
		assertNotEquals(aguaViva, null);
	}

	@Test
	public void testandoSeAnemonasDoMarIgualANull() {
		Cnidario anemonasDoMar = new AnemonasDoMar.AnemonasDoMarBuilder().build();
		assertNotEquals(anemonasDoMar, null);
	}

	@Test
	public void testandoSeEstrelaDoMarIgualANull() {
		Equinodermo estrelaDoMar = new EstrelaDoMar.EstrelaDoMarBuilder().build();
		assertNotEquals(estrelaDoMar, null);
	}

	@Test
	public void testandoSeLesmaIgualANull() {
		Molusco lesma = new Lesma.LesmaBuilder().build();
		assertNotEquals(lesma, null);
	}

	@Test
	public void testandoSeAranhaIgualANull() {
		Artropode aranha = new Aranha.AranhaBuilder().build();
		assertNotEquals(aranha, null);
	}

//			TESTANDO MÉTODOS DA CLASSE OBJECT
	@Test
	public void testandoMetodosObjectAvestruz() {
		Avestruz avestruz = new Avestruz.AvestruzBuilder().build();
		Avestruz avestruz1 = new Avestruz.AvestruzBuilder().build();
		avestruz.hashCode();
		assertEquals(avestruz.equals(avestruz1), true);
		System.out.println(avestruz);
	}

	@Test
	public void testandoMetodosObjectTucano() {
		Tucano tucano = new Tucano.TucanoBuilder().build();
		Tucano tucano1 = new Tucano.TucanoBuilder().build();
		tucano.hashCode();
		assertEquals(tucano.equals(tucano1), true);
		System.out.println(tucano);
	}

	@Test
	public void testandoMetodosObjectOrnitorrinco() {
		Ornitorrinco ornitorrinco = new Ornitorrinco.OrnitorrincoBuilder().build();
		Ornitorrinco ornitorrinco1 = new Ornitorrinco.OrnitorrincoBuilder().build();
		ornitorrinco.hashCode();
		assertEquals(ornitorrinco.equals(ornitorrinco1), true);
		System.out.println(ornitorrinco);
	}

	@Test
	public void testandoMetodosObjectCanguru() {
		Canguru canguru = new Canguru.CanguruBuilder().build();
		Canguru canguru1 = new Canguru.CanguruBuilder().build();
		canguru.hashCode();
		assertEquals(canguru.equals(canguru1), true);
		System.out.println(canguru);
	}

	@Test
	public void testandoMetodosObjectCachorro() {
		Cachorro cachorro = new Cachorro.CachorroBuilder().build();
		Cachorro cachorro1 = new Cachorro.CachorroBuilder().build();
		cachorro.hashCode();
		assertEquals(cachorro.equals(cachorro1), true);
		System.out.println(cachorro);
	}

	@Test
	public void testandoMetodosObjectCarpa() {
		Carpa carpa = new Carpa.CarpaBuilder().build();
		Carpa carpa1 = new Carpa.CarpaBuilder().build();
		carpa.hashCode();
		assertEquals(carpa.equals(carpa1), true);
		System.out.println(carpa);
	}

	@Test
	public void testandoMetodosObjectTubarao() {
		Tubarao tubarao = new Tubarao.TubaraoBuilder().build();
		Tubarao tubarao1 = new Tubarao.TubaraoBuilder().build();
		tubarao.hashCode();
		assertEquals(tubarao.equals(tubarao1), true);
		System.out.println(tubarao);
	}

	@Test
	public void testandoMetodosObjectTartaruga() {
		Tartaruga tartaruga = new Tartaruga.TartarugaBuilder().build();
		Tartaruga tartaruga1 = new Tartaruga.TartarugaBuilder().build();
		tartaruga.hashCode();
		assertEquals(tartaruga.equals(tartaruga1), true);
		System.out.println(tartaruga);
	}

	@Test
	public void testandoMetodosObjectJacare() {
		Jacare jacare = new Jacare.JacareBuilder().build();
		Jacare jacare1 = new Jacare.JacareBuilder().build();
		jacare.hashCode();
		assertEquals(jacare.equals(jacare1), true);
		System.out.println(jacare);
	}

	@Test
	public void testandoMetodosObjectSerpente() {
		Serpente serpente = new Serpente.SerpenteBuilder().build();
		Serpente serpente1 = new Serpente.SerpenteBuilder().build();
		serpente.hashCode();
		assertEquals(serpente.equals(serpente1), true);
		System.out.println(serpente);
	}

	@Test
	public void testandoMetodosObjectTuatara() {
		Tuatara tuatara = new Tuatara.TuataraBuilder().build();
		Tuatara tuatara1 = new Tuatara.TuataraBuilder().build();
		tuatara.hashCode();
		assertEquals(tuatara.equals(tuatara1), true);
		System.out.println(tuatara);
	}

	@Test
	public void testandoMetodosObjectSalamandra() {
		Salamandra salamandra = new Salamandra.SalamandraBuilder().build();
		Salamandra salamandra1 = new Salamandra.SalamandraBuilder().build();
		salamandra.hashCode();
		assertEquals(salamandra.equals(salamandra1), true);
		System.out.println(salamandra);
	}

	@Test
	public void testandoMetodosObjectSapo() {
		Sapo sapo = new Sapo.SapoBuilder().build();
		Sapo sapo1 = new Sapo.SapoBuilder().build();
		sapo.hashCode();
		assertEquals(sapo.equals(sapo1), true);
		System.out.println(sapo);
	}

	@Test
	public void testandoMetodosObjectCecilia() {
		Cecilia cecilia = new Cecilia.CeciliaBuilder().build();
		Cecilia cecilia1 = new Cecilia.CeciliaBuilder().build();
		cecilia.hashCode();
		assertEquals(cecilia.equals(cecilia1), true);
		System.out.println(cecilia);
	}

	@Test
	public void testandoMetodosObjectLombriga() {
		Lombriga lombriga = new Lombriga.LombrigaBuilder().build();
		Lombriga lombriga1 = new Lombriga.LombrigaBuilder().build();
		lombriga.hashCode();
		assertEquals(lombriga.equals(lombriga1), true);
		System.out.println(lombriga);
	}

	@Test
	public void testandoMetodosObjectPlanaria() {
		Planaria planaria = new Planaria.PlanariaBuilder().build();
		Planaria planaria1 = new Planaria.PlanariaBuilder().build();
		planaria.hashCode();
		assertEquals(planaria.equals(planaria1), true);
		System.out.println(planaria);
	}

	@Test
	public void testandoMetodosObjectEsponja() {
		Esponja esponja = new Esponja.EsponjaBuilder().build();
		Esponja esponja1 = new Esponja.EsponjaBuilder().build();
		esponja.hashCode();
		assertEquals(esponja.equals(esponja1), true);
		System.out.println(esponja);
	}

	@Test
	public void testandoMetodosObjectAguaViva() {
		AguaViva aguaViva = new AguaViva.AguaVivaBuilder().build();
		AguaViva aguaViva1 = new AguaViva.AguaVivaBuilder().build();
		aguaViva.hashCode();
		assertEquals(aguaViva.equals(aguaViva1), true);
		System.out.println(aguaViva);
	}

	@Test
	public void testandoMetodosObjectAnemonasDoMar() {
		AnemonasDoMar anemonasDoMar = new AnemonasDoMar.AnemonasDoMarBuilder().build();
		AnemonasDoMar anemonasDoMar1 = new AnemonasDoMar.AnemonasDoMarBuilder().build();
		anemonasDoMar.hashCode();
		assertEquals(anemonasDoMar.equals(anemonasDoMar1), true);
		System.out.println(anemonasDoMar);
	}

	@Test
	public void testandoMetodosObjectEstrelaDoMar() {
		EstrelaDoMar estrelaDoMar = new EstrelaDoMar.EstrelaDoMarBuilder().build();
		EstrelaDoMar estrelaDoMar1 = new EstrelaDoMar.EstrelaDoMarBuilder().build();
		estrelaDoMar.hashCode();
		assertEquals(estrelaDoMar.equals(estrelaDoMar1), true);
		System.out.println(estrelaDoMar);
	}

	@Test
	public void testandoMetodosObjectLesma() {
		Lesma lesma = new Lesma.LesmaBuilder().build();
		Lesma lesma1 = new Lesma.LesmaBuilder().build();
		lesma.hashCode();
		assertEquals(lesma.equals(lesma1), true);
		System.out.println(lesma);
	}

	@Test
	public void testandoMetodosObjectAranha() {
		Aranha aranha = new Aranha.AranhaBuilder().build();
		Aranha aranha1 = new Aranha.AranhaBuilder().build();
		aranha.hashCode();
		assertEquals(aranha.equals(aranha1), true);
		System.out.println(aranha);
	}

// 			TESTANDO OUTROS MÉTODOS
	
	@Test
	public void testandoMetodosAnimalEAvestruz() {
		Avestruz avestruz = new Avestruz.AvestruzBuilder().build();
		assertNotEquals(avestruz.alimentar(), null);
		assertNotEquals(avestruz.respirar(), null);
		assertNotEquals(avestruz.crescer(), null);
		assertNotEquals(avestruz.morrer(), null);
		assertNotEquals(avestruz.reproduzir(), null);
		assertNotEquals(avestruz.botarOvo(), null);
		assertNotEquals(avestruz.fecundacao(), null);
		assertNotEquals(avestruz.correrRapido(), null);
		assertEquals(avestruz.locomover(), true);
	}

	@Test
	public void testandoMetodosTucano() {
		Tucano tucano = new Tucano.TucanoBuilder().build();
		assertEquals(tucano.voar(), true);
	}

	@Test
	public void testandoMetodosOrnitorrinco() {
		Ornitorrinco ornitorrinco = new Ornitorrinco.OrnitorrincoBuilder().build();
		assertNotEquals(ornitorrinco.fecundacao(), null);
		assertNotEquals(ornitorrinco.botarOvo(), null);
	}

	@Test
	public void testandoMetodosCanguru() {
		Canguru canguru = new Canguru.CanguruBuilder().build();
		assertEquals(canguru.nascerDesenvolvido(), false);
		assertEquals(canguru.terminarDesenvolvimentoNoMarsupio(), true);
	}

	@Test
	public void testandoMetodosCachorro() {
		Cachorro cachorro = new Cachorro.CachorroBuilder().build();
		assertEquals(cachorro.nascerDesenvolvido(), true);
	}

	@Test
	public void testandoMetodosCarpa() {
		Carpa carpa = new Carpa.CarpaBuilder().build();
		assertNotEquals(carpa.fecundacao(), null);
	}

	@Test
	public void testandoMetodosTubarao() {
		Tubarao tubarao = new Tubarao.TubaraoBuilder().build();
		assertNotEquals(tubarao.fecundacao(), null);
	}

	@Test
	public void testandoMetodosTartaruga() {
		Tartaruga tartaruga = new Tartaruga.TartarugaBuilder().build();
		assertNotEquals(tartaruga.fecundacao(), null);
	}

	@Test
	public void testandoMetodosJacare() {
		Jacare jacare = new Jacare.JacareBuilder().build();
		assertEquals(jacare.reproducao("alta"), "Nascerá fêmea");
		assertEquals(jacare.reproducao("baixa"), "Nascerá macho");
		assertEquals(jacare.reproducao("aaa"), "ERRO! Temperatura inválida");
	}

	@Test
	public void testandoMetodosSerpente() {
		Serpente serpente = new Serpente.SerpenteBuilder().build();
		assertEquals(serpente.movimentaPartesDoCranio(), true);
	}

	@Test
	public void testandoMetodosTuatara() {
		Tuatara tuatara = new Tuatara.TuataraBuilder().build();
		assertNotEquals(tuatara.autonomiaCaudal(), null);
	}

	@Test
	public void testandoMetodosSalamandra() {
		Salamandra salamandra = new Salamandra.SalamandraBuilder().build();
		assertNotEquals(salamandra.fecundacao(), null);
		assertNotEquals(salamandra.produzirSecrcoesTóxicas(), null);
	}

	@Test
	public void testandoMetodosSapo() {
		Sapo sapo = new Sapo.SapoBuilder().build();
		assertNotEquals(sapo.fecundacao(), null);
	}

	@Test
	public void testandoMetodosCecilia() {
		Cecilia cecilia = new Cecilia.CeciliaBuilder().build();
		assertNotEquals(cecilia.fecundacao(), null);
		assertNotEquals(cecilia.funcionamentoOlhos(), null);
	}

	@Test
	public void testandoMetodosLombriga() {
		Lombriga lombriga = new Lombriga.LombrigaBuilder().build();
		assertNotEquals(lombriga.fecundacao(), null);
		assertEquals(lombriga.locomover(), true);
		assertEquals(lombriga.viverEmHospedeiro(), true);
		assertEquals(lombriga.causarDoencas(), true);
	}

	@Test
	public void testandoMetodosPlanaria() {
		Planaria planaria = new Planaria.PlanariaBuilder().build();
		assertEquals(planaria.viverEmHospedeiro(), false);
		assertEquals(planaria.causarDoencas(), false);
	}

	@Test
	public void testandoMetodosEsponja() {
		Esponja esponja = new Esponja.EsponjaBuilder().build();
		assertEquals(esponja.filtraNutrientes(), true);
		assertEquals(esponja.locomover(), false);
		assertNotEquals(esponja.fecundacao(), null);
	}

	@Test
	public void testandoMetodosAguaViva() {
		AguaViva aguaViva = new AguaViva.AguaVivaBuilder().build();
		assertNotEquals(aguaViva.fecundacao(), null);
		assertEquals(aguaViva.locomover(), true);
	}

	@Test
	public void testandoMetodosAnemonasDoMar() {
		AnemonasDoMar anemonasDoMar = new AnemonasDoMar.AnemonasDoMarBuilder().build();
		assertEquals(anemonasDoMar.locomover(), false);
	}

	@Test
	public void testandoMetodosEstrelaDoMar() {
		EstrelaDoMar estrelaDoMar = new EstrelaDoMar.EstrelaDoMarBuilder().build();
		assertNotEquals(estrelaDoMar.fecundacao(), null);
		assertEquals(estrelaDoMar.locomover(), true);
	}

	@Test
	public void testandoMetodosLesma() {
		Lesma lesma = new Lesma.LesmaBuilder().build();
		assertNotEquals(lesma.fecundacao(), null);
		assertEquals(lesma.locomover(), true);
	}

	@Test
	public void testandoMetodosAranha() {
		Aranha aranha = new Aranha.AranhaBuilder().build();
		assertNotEquals(aranha.fecundacao(), null);
		assertEquals(aranha.locomover(), true);
	}
}
