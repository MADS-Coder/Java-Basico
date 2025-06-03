package com.matheus.cursojava.poo.construtores.estatico;

public class TesteCantador {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
				
		Contador.incremetar();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
		
		Contador.incremetar();
		Contador.incremetar();

		imprimirValor();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		
		imprimirValor();
	}

}
