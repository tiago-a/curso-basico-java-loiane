package com.exercicios.aula33;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String[][] disciplinasNotas;
		
	public Aluno() {
		this.nome = "Joao";
		this.matricula = "0000";
		this.curso = "Nenhum";
		this.disciplinasNotas = this.criaNotas();
	}
	
	public Aluno(String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinasNotas = this.criaNotas();
	}

	private String[][] criaNotas(){
		String[] disciplinas = new String[3];
		disciplinas[0] = "Portugues";
		disciplinas[1] = "Matematica";
		disciplinas[2] = "Ingles";
		String[][] disciplinasNotas = new String[3][2];
		
		for (int i = 0; i < disciplinasNotas.length; i++) {
			disciplinasNotas[i][0] = disciplinas[i];
			disciplinasNotas[i][1] = "0.0";
		}
		return disciplinasNotas;
		
	}
	
	public void aprovado(String materia) {
		if (this.existeMateria(materia)) {
			this.printaAprovadoReprovado(materia);
		} else {
			System.out.println("Materia nao existe.");
		}
	}
	
	private boolean existeMateria(String materia) {
		for (int i = 0; i < this.disciplinasNotas.length; i++) {
			if(this.disciplinasNotas[i][0].equalsIgnoreCase(materia)) {
				return true;
			}
		}
		return false;
	}
	
	public void entraNotas() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < this.disciplinasNotas.length; i++) {
			System.out.print("Entre com a Nota para a disciplina " + this.disciplinasNotas[i][0] + ": ");
			this.disciplinasNotas[i][1] = scan.nextLine();
		}
		scan.close();
	}
	
	private int getIndiceMateria(String materia) {
		for (int i = 0; i < disciplinasNotas.length; i++) {
			if(disciplinasNotas[i][0].equalsIgnoreCase(materia)) {
				return i;
			}
		}
		return -1;
	}
	
	private void printaAprovadoReprovado(String materia) {
		if (Double.parseDouble(this.disciplinasNotas[this.getIndiceMateria(materia)][1]) >= 7.0) {
			System.out.println("Aluno: " + this.nome + " APROVADO na materia: " + this.disciplinasNotas[this.getIndiceMateria(materia)][0] + " com nota: " + this.disciplinasNotas[this.getIndiceMateria(materia)][1]);
		} else {
			System.out.println("Aluno: " + this.nome + " REPROVADO na materia: " + this.disciplinasNotas[this.getIndiceMateria(materia)][0] + " com nota: " + this.disciplinasNotas[this.getIndiceMateria(materia)][1]);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[][] getDisciplinasNotas() {
		return disciplinasNotas;
	}

	public void setDisciplinasNotas(String[][] disciplinasNotas) {
		this.disciplinasNotas = disciplinasNotas;
	}
	
	
	
}
