package com.exercicios.aula36;

public class Aluno {
	private String nome;
	private String matricula;
	private double media;
	private double[] notas;
	
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
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public void printInfor() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Notas: ");
		for (int i = 0; i < this.notas.length; i++) {
			System.out.println(this.notas[i] + " ");
		}
		this.media = this.calculaMedia();
		System.out.println("Média: " + this.media);
		System.out.println("O aluno está aprovado? " + this.estaAprovado());
		System.out.println();
	}
	private double calculaMedia() {
		double total = 0.0;
		for (int i = 0; i < this.notas.length; i++) {
			total += this.notas[i];
		}
		return total/this.notas.length;
	}
	private String estaAprovado() {
		if(this.media >= 7.0) {
			return "Sim!";
		} else {
			return "Não!";
		}
	}
}
