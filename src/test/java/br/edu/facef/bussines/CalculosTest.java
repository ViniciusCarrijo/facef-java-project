package br.edu.facef.bussines;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculosTest {

	private Calculos calculos;
	
	@Before
	public void init() {
		this.calculos = new Calculos();
	}
	
	@Test
	public void deveSomarNumerosPositivos() {
		Integer valor1 = 5;
		Integer valor2 = 10;
		Integer valorEsperado = 15;
		
		assertEquals(valorEsperado, calculos.somar(valor1, valor2));
	}
	
	@Test
	public void deveSomarNumerosNegativos() {
		Integer valor1 = -10;
		Integer valor2 = -10;
		Integer valorEsperado = -20;
		
		assertEquals(valorEsperado, calculos.somar(valor1, valor2));
	}
	
	@Test
	public void deveSubtrairNumerosPositivos() {
		Integer valor1 = 10;
		Integer valor2 = 5;
		Integer valorEsperado = 5;
		
		assertEquals(valorEsperado, calculos.subtrair(valor1, valor2));
	}
	
	@Test
	public void deveSubtrairNumerosNegativos() {
		Integer valor1 = -10;
		Integer valor2 = -5;
		Integer valorEsperado = -5;
		
		assertEquals(valorEsperado, calculos.subtrair(valor1, valor2));
	}

}
