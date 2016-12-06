package com.arkhi.pocdevops;


import org.junit.Test;
import junit.framework.Assert;

/**
 * Classe de testes da calculadora DevOps
 * Usada para demonstrar os conceitos de testes de unidade, automação de testes, automação de builds e métricas de automação
 * @author Marco Mendes
 * 
 */
public class CalculadoraTest {

	@Test
	public void testSoma() {

		double a = 10;
		double b = 5;	
		Assert.assertEquals("Soma - Caso feliz ", Calculadora.soma(a, b), 15, 0.0001);	
	}

	@Test
	public void testMultiplicacao() {
		double a = 9;
		double b = 3;	
		Assert.assertEquals("Multiplicação - Caso feliz ", Calculadora.multiplica(a, b), 27, 0.0001);	
	}

	@Test
	public void testSubtracao() {
		double a = 10;
		double b = 3;	
		Assert.assertEquals("Subtração - Caso feliz ", Calculadora.subtrai(a, b), 7, 0.0001);	
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
