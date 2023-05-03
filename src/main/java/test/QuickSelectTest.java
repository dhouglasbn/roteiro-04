package test;

import java.util.Arrays;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import orderStatistic.QuickSelect;

public class QuickSelectTest {

	private Integer[] vetorTamPar;
	private Integer[] vetorTamImpar;
	private Integer[] vetorVazio = {};
	private Integer[] vetorValoresRepetidos;
	private Integer[] vetorValoresIguais;
	private Integer[] vetorValoresOrdenado;
	private Integer[] vetorValoresReverso;
	private Integer[] vetorTam4;

	public QuickSelect<Integer> implementation;

	@Before
	public void setUp() {
		populaVetorTamanhoPar(new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 });
		populaVetorTamanhoImpar(new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36 });
		populaVetorRepetido(new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 });
		populaVetorIgual(new Integer[] { 6, 6, 6, 6, 6, 6 });
		populaVetorOrdenado(new Integer[] { 0, 2, 4, 5, 18, 30, 48, 50, 64, 69, 100 });
		populaVetorReverso(new Integer[] { 30, 28, 17, 15, 14, 12, 10, 4, 2, 2, 0 });
		populaVetorTam4(new Integer[] { 4, 3, 2, -2 });

		getImplementation();
	}

	// // MÉTODOS AUXILIARES DA INICIALIZAÇÃO
	/**
	 * Método que inicializa a implementação a ser testada com a implementação
	 * do aluno
	 */
	private void getImplementation() {
		this.implementation = new QuickSelect<Integer>();
	}

	public void populaVetorTamanhoPar(Integer[] arrayPadrao) {
		this.vetorTamPar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
	}

	public void populaVetorTamanhoImpar(Integer[] arrayPadrao) {
		this.vetorTamImpar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
	}

	public void populaVetorRepetido(Integer[] arrayPadrao) {
		this.vetorValoresRepetidos = Arrays.copyOf(arrayPadrao,
				arrayPadrao.length);
	}

	public void populaVetorIgual(Integer[] arrayPadrao) {
		this.vetorValoresIguais = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}
	
	public void populaVetorOrdenado(Integer[] arrayPadrao) {
		this.vetorValoresOrdenado = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}
	
	public void populaVetorReverso(Integer[] arrayPadrao) {
		this.vetorValoresReverso = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}
	
	public void populaVetorTam4(Integer[] arrayPadrao) {
		this.vetorTam4 = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}

	// FIM DOS METODOS AUXILIARES DA INICIALIZAÇÃO

	// MÉTODOS DE TESTE

	public void genericTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);	
		}
		Integer result = implementation.quickSelect(array, 2);
		Arrays.sort(copy1);
		Integer expected = copy1[1];
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testQuickSelect01() {
		genericTest(vetorTamPar);
	}

	@Test
	public void testQuickSelect02() {
		genericTest(vetorTamImpar);
	}

	@Test
	public void testQuickSelect03() {
		Integer result = implementation.quickSelect(vetorVazio, 0);
		
		Assert.assertNull(result);
	}
	
	@Test
	public void testQuickSelect04() {
		Integer result = implementation.quickSelect(vetorTamPar, -1);
		
		Assert.assertNull(result);
	}

	@Test
	public void testQuickSelect05() {
		genericTest(vetorValoresIguais);
	}

	@Test
	public void testQuickSelect06() {
		genericTest(vetorValoresRepetidos);
	}
	
	@Test
	public void testQuickSelect07() {
		genericTest(vetorValoresOrdenado);
	}

	@Test
	public void testQuickSelect08() {
		genericTest(vetorValoresReverso);
		
	}
	
	@Test
	public void testQuickSelect09() {
		genericTest(vetorTam4);
		
	}

	// MÉTODOS QUE OS ALUNOS PODEM CRIAR
	/**
	 * O ALUNO PODE IMPLEMENTAR METODOS DE ORDENAÇÃO TESTANDO O SORT COM TRES
	 * ARGUMENTOS PARA TESTAR A ORDENACAO EM UM PEDAÇO DO ARRAY. DICA: PROCUREM
	 * SEGUIR A ESTRUTURA DOS MÉTODOS DE TESTE ACIMA DESCRITOS, ORDENANDO APENAS
	 * UMA PARTE DO ARRAY.
	 */
}