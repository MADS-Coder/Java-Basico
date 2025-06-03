package com.matheus.cursojava.excecoes;

public class DivisaoNaoExata extends Exception {
	
	private int num;
	private int deno;
	
	@Override
	public String toString() {
		return "Resultado de " + num + "/" + deno + " não é um inteiro!";
	}

	public DivisaoNaoExata(int num, int deno) {
		super();
		this.num = num;
		this.deno = deno;
	}

}
