package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import orderStatistic.QuickSelect;
import problems.FloorBinarySearchImpl;

public class FloorBinarySearchTest {

	private Integer[] vetorTamPar;
	private Integer[] vetorTamImpar;
	private Integer[] vetorVazio = {};
	private Integer[] vetorValoresRepetidos;
	private Integer[] vetorValoresIguais;
	private Integer[] vetorValoresOrdenado;
	private Integer[] vetorValoresReverso;
	private Integer[] vetorTam4;
	private Integer[] vetorSlide;

	public FloorBinarySearchImpl implementation;

	@Before
	public void setUp() {
		populaVetorTamanhoPar(new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 });
		populaVetorTamanhoImpar(new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36 });
		populaVetorRepetido(new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 });
		populaVetorIgual(new Integer[] { 6, 6, 6, 6, 6, 6 });
		populaVetorOrdenado(new Integer[] { 0, 2, 4, 5, 18, 30, 48, 50, 64, 69, 100 });
		populaVetorReverso(new Integer[] { 30, 28, 17, 15, 14, 12, 10, 4, 2, 2, 0 });
		populaVetorTam4(new Integer[] { 4, 3, 2, -2 });
		populaVetorSlide(new Integer[] {25,38,15,96,4,30,84});

		getImplementation();
	}

	// // MÉTODOS AUXILIARES DA INICIALIZAÇÃO
	/**
	 * Método que inicializa a implementação a ser testada com a implementação
	 * do aluno
	 */
	private void getImplementation() {
		this.implementation = new FloorBinarySearchImpl();
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
	
	public void populaVetorSlide(Integer[] arrayPadrao) {
		this.vetorSlide = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}

	@Test
	public void testFloor01() {
		Integer expected = 30;
		
		Integer x = 30;
		Integer result = this.implementation.floor(this.vetorTamPar, x);
		
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFloor02() {
		Integer expected = 26;
		
		Integer x = 30;
		Integer result = this.implementation.floor(this.vetorTamImpar, x);
		
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFloor03() {
		Integer expected = -1;

		Integer x = 0;
		Integer result = implementation.floor(vetorVazio, x);
		
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFloor04() {
		Integer expected = -1;

		Integer x = -50;
		Integer result = this.implementation.floor(this.vetorValoresRepetidos, x);
		
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFloor05() {
		Integer expected = 6;

		Integer x = 6;
		Integer result = this.implementation.floor(this.vetorValoresIguais, x);
		
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void testFloor06() {
		Integer expected = 0;

		Integer x = 0;
		Integer result = this.implementation.floor(this.vetorValoresOrdenado, x);
		
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFloor07() {
		Integer expected = 30;

		Integer x = 32;
		Integer result = this.implementation.floor(this.vetorValoresReverso, x);
		
		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void testFloor08() {
		Integer expected = -2;

		Integer x = 0;
		Integer result = this.implementation.floor(this.vetorTam4, x);
		
		Assert.assertEquals(expected, result);
		
	}

	@Test
	public void testFloor09() {
		Integer expected = 38;

		Integer x = 38;
		Integer result = this.implementation.floor(this.vetorSlide, x);
		
		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void testFloor10() {
		Integer expected = 15;

		Integer x = 17;
		Integer result = this.implementation.floor(this.vetorSlide, x);
		
		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void testFloor11() {
		Integer expected = -1;

		Integer x = 2;
		Integer result = this.implementation.floor(this.vetorSlide, x);
		
		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void testFloor12() {
		Integer expected = 96;

		Integer x = 200;
		Integer result = this.implementation.floor(this.vetorSlide, x);
		
		Assert.assertEquals(expected, result);
		
	}
}