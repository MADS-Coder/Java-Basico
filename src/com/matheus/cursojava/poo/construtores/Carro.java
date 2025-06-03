package com.matheus.cursojava.poo.construtores;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; 
	double consumoCombustivel; 
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {}

	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros.");
	}
	
	
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10); //Chama o construtor com 3 parâmetros primeiro, inicializa a classe.	
		System.out.println("Chamando o construtor com 2 parâmetros."); //Depois este e por ultimo o numPassageiros.
	}
		
	
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
