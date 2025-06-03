package com.matheus.cursojava.poo.heranca.finall;

public class Aluno {
	
	private String curso;
	private double[] notas;
	
	//Acessando o modificador protected.
	public void verificarAcesso() {
		//this.nomeVisbilidade = "Maria";
		//super.nomeVisbilidade = "Matheus";
	}
	
		
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		
		String endAluno = "Endereço do Aluno: ";
		//endAluno += super.getEndereco();
		return endAluno;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimindo endereço do Aluno.");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	
}
