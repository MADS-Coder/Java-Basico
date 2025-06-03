package com.matheus.cursojava.loops;

public class LoopFor {

	public static void main(String[] args) {
		
		for (int count = 0; count < 5; count++) {
			
			System.out.println("Count tem valor " + count);
			
		}
		
		for (int count = 5; count >= 0; count--) {
			
			System.out.println("Count tem valor " + count);
		}
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			
			System.out.println("i tem: " + i + "; j tem: " + j);
			
		}

	}

}
