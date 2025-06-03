package com.matheus.teste;

import java.util.Scanner;

public class BateriaLaptop {

    public static int getBattery(int[] eventos) {
    	
        int porcentagemBateria = 50;
        
        System.out.println("Carga inicial: " + porcentagemBateria + "%");

        for (int i = 0; i < eventos.length; i++) {
            int evento = eventos[i];
            int antes = porcentagemBateria;
            porcentagemBateria += evento;

            // Limitar entre 0 e 100
            if (porcentagemBateria > 100) {
            	porcentagemBateria = 100;
            } else if (porcentagemBateria < 0) {
            	porcentagemBateria = 0;
            }

            System.out.println("Evento[" + i + "] = " + evento + " minutos -> "
                    + antes + "% " + (evento >= 0 ? "+" : "") + evento + "% = " + porcentagemBateria + "%");
        }

        return porcentagemBateria;
    }
    
    
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos eventos? ");
        
        int numeroEventos = scanner.nextInt();
        int[] eventos = new int[numeroEventos];
        
        for(int i = 0; i < numeroEventos; i++) {
        	System.out.println("Digite um numero inteiro (Positivo) ou (Negativo).");
        	eventos[i] = scanner.nextInt();
        }

        int bateriaFinal = BateriaLaptop.getBattery(eventos);
        System.out.println("Porcentagem final da bateria: "+ bateriaFinal + "%");
	}
}