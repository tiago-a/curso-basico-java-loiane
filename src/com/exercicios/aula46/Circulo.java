package com.exercicios.aula46;

public class Circulo extends Figura2D {
	
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area;
		area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área é: " + area);
		return area;
	}
	
}
