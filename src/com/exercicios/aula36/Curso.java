package com.exercicios.aula36;

public class Curso {
	private String nome;
	private String horario;
	private double media;
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
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public void printInfo() {
		System.out.println("Informações do Curso.");
		System.out.println("Nome: " + this.nome);
		System.out.println("Horario: " + this.horario);
		System.out.println("Info Professor: ");
		this.professor.printInfo();
		System.out.println("Media da Turma: " + this.calculaMedia());
	}
	private double calculaMedia() {
		double total = 0.0;
		for (int i = 0; i < this.alunos.length; i++) {
			total += this.alunos[i].getMedia();
		}
		return total/this.alunos.length;
	}
}
