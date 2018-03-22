package com.exercicios.aula46;

public class Cilindro extends Figura3D {

	private double raio;
	private double altura;

	public Cilindro(String nome, String cor) {
		super(nome, cor);
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
