package com.matheus.cursojava.poo.construtores.geteset;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		
		van.setMarca("Fiat");
		
		System.out.println(van.getMarca());
		
		van.setModelo("Ducato");
		
		System.out.println(van.getModelo());
				
	}

}
