package com.matheus.cursojava.poo.construtores.publiepriv;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; 
	private double consumoCombustivel; 		
	
	//Método Simples
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	//Método com Retorno
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	//Método com Parâmetro
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/this.consumoCombustivel;
		
		return qtdCombustivel;
	}
}
