package com.matheus.cursojava.poo.heranca.finall;

public class Professor {
	
	private double salario;
	private String nomeCurso;
	

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco() {
		
		String endProfessor = "Endereço do Professor: ";
		//endProfessor += super.getEndereco();
		return endProfessor;
	}
	
	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimindo endereço do Professor.");
		System.out.println(this.obterEtiquetaEndereco());
		
	}

}
