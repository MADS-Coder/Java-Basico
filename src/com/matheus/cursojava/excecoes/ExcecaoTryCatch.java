package com.matheus.cursojava.excecoes;

public class ExcecaoTryCatch {

	public static void main(String[] args) {
		
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception.");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impressor.");
			
		}catch (ArrayIndexOutOfBoundsException exeception) {
			
			System.out.println("Erro ao tentar acessar índice que não exite.");
		}

		System.out.println("Esse texto será impressor após a exception.");

	}

}
