package com.exercicios.aula36;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public void printInfo() {
		System.out.println("Informações do Curso.");
		System.out.println("Nome: " + this.nome);
		System.out.println("Horario: " + this.horario);
		this.professor.printInfo();
//		sy
	}
}
