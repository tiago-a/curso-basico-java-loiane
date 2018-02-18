package com.exercicios.aula36;

public class Aluno {
	private String nome;
	private String matricula;
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
	public void printInfor() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Notas: ");
		for (int i = 0; i < this.notas.length; i++) {
			System.out.println(this.notas[i] + " ");
		}
		System.out.println();
	}
}
