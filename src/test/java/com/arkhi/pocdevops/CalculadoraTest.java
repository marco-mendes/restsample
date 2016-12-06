package com.arkhi.pocdevops;


import org.junit.Test;
import junit.framework.Assert;

public class CalculadoraTest {

	@Test
	public void testSoma() {
		double a = 10;
		double b = 5;	
		Assert.assertEquals("Soma - Caso feliz ", Calculadora.soma(a, b), 15, 0.0001);	
	}

	@Test
	public void testMultiplica() {
		double a = 10;
		double b = 5;	
		Assert.assertEquals("Multiplicativa - Caso feliz ", Calculadora.multiplica(a, b), 50, 0.0001);	
	}

	@Test
	public void testSubtrai() {
		double a = 10;
		double b = 5;	
		Assert.assertEquals("Subtrai - Caso feliz ", Calculadora.subtrai(a, b), 5, 0.0001);	
	}

	
	@Test (expected = ArithmeticException.class)
	public void testDivisaoPorZero() {
		double a = 10;
		double b = 0;	
		Calculadora.divide(a, b);	
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivideCasoFeliz() {
		double a = 10;
		double b = 2;	
		Assert.assertEquals("Divisão - Caso feliz ", Calculadora.divide(a, b), 5, 0.0001);		
	}
	
	

}
