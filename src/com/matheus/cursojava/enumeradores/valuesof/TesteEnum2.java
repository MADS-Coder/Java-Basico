package com.matheus.cursojava.enumeradores.valuesof;

import com.matheus.cursojava.enumeradores.classeemetodo.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {

		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia);
		
		
	}

}
