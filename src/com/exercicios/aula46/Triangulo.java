package com.exercicios.aula46;

public class Triangulo extends Figura2D {
	
	private double lado;

	public Triangulo(String nome, String cor) {
		super(nome, cor);
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
}
