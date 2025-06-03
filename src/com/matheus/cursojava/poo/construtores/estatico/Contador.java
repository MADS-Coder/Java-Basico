package com.matheus.cursojava.poo.construtores.estatico;

public class Contador {
	
	private static int cont;
	
	public Contador() {
		cont++;
	}
	
	public static void incremetar() {
		cont++;
	}

	public static void zerar() {
		cont = 0;
	}
	
	public static int obterValor() {
		return cont;
	}
}
