package com.matheus.cursojava.poo.construtores.sobrecarga;

public class MinhaCalculadora {
	
	public int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public double soma(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public int soma(int[] vetorInteiro) {
		
		int total=0;
		
		for(int i=0; i<vetorInteiro.length; i++) {
			
			total += vetorInteiro[i];
		}
		
		return total;
	}
}
