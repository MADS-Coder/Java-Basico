package com.matheus.teste;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.matheus.cursojava.arraysematrizes.Arrays;

public class Player {

	public static void main(String[] args) {
		//****************************************
		//Não alterar o trecho de código abaixo
		//****************************************

		Scanner scanner = new Scanner(System.in);
		String logradouro = scanner.nextLine();

		System.out.println(endereco(logradouro));

		//****************************************
		//Não alterar o trecho de código acima
		//****************************************
	}

	public static String endereco(String logradouro) {
		
	    String tipo = "";

	    if (logradouro.matches("^\\d+\\s.*")) {
	        tipo = "INICIO_NUM";
	    } else if (logradouro.matches("^\\d+[,].*")) {
	        tipo = "NUMERO_VIRGULA";
	    } else if (logradouro.matches(".*[,]\\s*\\d+.*")) {
	        tipo = "LOGRADOURO_VIRGULA_NUM";
	    } else if (logradouro.matches(".*\\sNo\\s\\d+.*")) {
	        tipo = "NO_NUM";
	    } else {
	        tipo = "PADRAO";
	    }

	    String logradouroFinal = "";
	    String numeroFinal = "";

	    switch (tipo) {
	        case "INICIO_NUM":
	            // Ex: 100 Broadway Av
	            String[] partesInicioNum = logradouro.split("\\s+", 2);
	            numeroFinal = partesInicioNum[0];
	            logradouroFinal = partesInicioNum[1];
	            break;

	        case "NUMERO_VIRGULA":
	            // Ex: 4, Rue de la République
	            String[] partesNumVirgula = logradouro.split(",", 2);
	            numeroFinal = partesNumVirgula[0].trim();
	            logradouroFinal = partesNumVirgula[1].trim();
	            break;

	        case "LOGRADOURO_VIRGULA_NUM":
	            // Ex: Calle Sagasta, 26
	            String[] partesLogVirgulaNum = logradouro.split(",", 2);
	            logradouroFinal = partesLogVirgulaNum[0].trim();
	            numeroFinal = partesLogVirgulaNum[1].trim();
	            break;

	        case "NO_NUM":
	            // Ex: Calle 44 No 1991
	            int posNo = logradouro.indexOf("No");
	            logradouroFinal = logradouro.substring(0, posNo).trim();
	            numeroFinal = logradouro.substring(posNo).trim();
	            break;

	        case "PADRAO":
	            // Casos simples e intermediários
	            int lastSpace = logradouro.lastIndexOf(" ");
	            logradouroFinal = logradouro.substring(0, lastSpace).trim();
	            numeroFinal = logradouro.substring(lastSpace + 1).trim();
	            break;
	    }

	    return String.format("{\"logradouro\":\"%s\",\"numero\":\"%s\"}", logradouroFinal, numeroFinal);
	}



}
