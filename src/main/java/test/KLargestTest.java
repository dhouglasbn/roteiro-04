package test;

import java.util.Arrays;


import orderStatistic.KLargestOrderStatisticsImpl;
import orderStatistic.KLargest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KLargestTest {

	private Integer[] vetorTamPar;
	private Integer[] vetorTamImpar;
	private Integer[] vetorVazio = {};
	private Integer[] vetorValoresRepetidos;
	private Integer[] vetorValoresIguais;
	private Integer[] vetorValoresOrdenado;
	private Integer[] vetorValoresReverso;
	private Integer[] vetorTam4;

	public KLargest<Integer> implementation;

	@Before
	public void setUp() {
		populaVetorTamanhoPar(new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 });
		populaVetorTamanhoImpar(new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36 });
		populaVetorRepetido(new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 });
		populaVetorIgual(new Integer[] { 6, 6, 6, 6, 6, 6 });
		populaVetorOrdenado(new Integer[] { 0, 2, 4, 5, 18, 30, 48, 50, 64, 69, 100 });
		populaVetorReverso(new Integer[] { 30, 28, 17, 15, 14, 12, 10, 4, 2, 1, 0 });
		populaVetorTam4(new Integer[] { 4, 3, 2, -2 });

		getImplementation();
	}

	// // MÉTODOS AUXILIARES DA INICIALIZAÇÃO
	/**
	 * Método que inicializa a implementação a ser testada com a implementação
	 * do aluno
	 */
	private void getImplementation() {
		// TODO O aluno deve instanciar sua implementação abaixo ao invés de
		// null
		this.implementation = new KLargestOrderStatisticsImpl<Integer>();
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
		Integer[] result = implementation.getKLargest(array, 2);
		Arrays.sort(copy1);
		Integer[] expected = {copy1[copy1.length - 2], copy1[copy1.length - 1]};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void testSort01() {
		genericTest(vetorTamPar);
	}

	@Test
	public void testSort02() {
		genericTest(vetorTamImpar);
	}

	@Test
	public void testSort03() {
		Integer[] result = (Integer[]) implementation.getKLargest(vetorVazio, 4);
		Integer[] expected = new Integer[0];
		
		Assert.assertArrayEquals(result, expected);
	}
	
	@Test
	public void testSort04() {
		Integer[] result = (Integer[]) implementation.getKLargest(vetorTamPar, -1);
		Integer[] expected = new Integer[0];
		
		Assert.assertArrayEquals(result, expected);
	}

	@Test
	public void testSort05() {
		genericTest(vetorValoresIguais);
	}

	@Test
	public void testSort06() {
		genericTest(vetorValoresRepetidos);
	}
	
	@Test
	public void testSort07() {
		genericTest(vetorValoresOrdenado);
	}

	@Test
	public void testSort08() {
		genericTest(vetorValoresReverso);
		
	}
	
	@Test
	public void testSort09() {
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