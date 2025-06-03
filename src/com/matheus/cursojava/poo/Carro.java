package com.matheus.cursojava.poo;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; 
	double consumoCombustivel; 
	
	//Método Simples
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " km");
	}
	
	//Método com Retorno
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	//Método com Parâmetro
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
