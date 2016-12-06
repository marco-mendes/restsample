package com.arkhi.pocdevops;


/**
 * Classe  da calculadora DevOps
 * Usada para demonstrar os conceitos de automação de builds, integração noturna, integração contínua (CI), 
 * implantação contínua (CD) e entrega contínua (CD)
 * @author Marco Mendes
 *
 */
public class Calculadora {
	public static double soma(double a, double b) {
		return a + b;
	}

	public static double multiplica(double a, double b) {
		return a * b;
	}

	public static double subtrai(double a, double b) {
		return a - b;
	}

	public static double divide(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a/b; 
	}

}