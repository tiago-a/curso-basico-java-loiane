package com.exercicios.aula46;

public class Circulo extends Figura2D {
	
	private double raio;

	public Circulo(String nome, String cor) {
		super(nome, cor);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
