package com.matheus.cursojava.poo.construtores.sobrecarga;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
					
		System.out.println(calc.soma(2, 3));
		System.out.println(calc.soma(2.5, 3.5));
		System.out.println(calc.soma(2, 4, 5));

	}

}
