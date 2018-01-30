package com.exercicios.aula33;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String[][] disciplinasNotas;
	
	public Aluno() {
		this.nome = "Joao";
		this.matricula = "0000";
		this.curso = "Nenhum";
	}
	
	private String[][] criaNotas(){
		String[][] disciplinasNotas = new String[3][3];
	}
}
