package com.matheus.cursojava.enumeradores.classeemetodo;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(1, 2, 2025, DiaSemana.SEGUNDA);
		
		System.out.println(data.getDiaSemana());
		

	}

}
