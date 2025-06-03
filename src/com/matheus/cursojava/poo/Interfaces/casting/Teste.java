package com.matheus.cursojava.poo.Interfaces.casting;

public class Teste {

		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting

		Pessoa aluno2 = (Pessoa) new Aluno();
		
		Pessoa aluno3 = new Pessoa();
		
		Aluno aluno4 = (Aluno) aluno3;
}
