package com.exercicios.aula46;

public class Cilindro extends Figura3D {

	private double raio;
	private double altura;

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
	@Override
	public void calcularVolume() {
		double volume;
		volume = calcularArea() * altura;
		System.out.println("O volume é: " + volume);
	}
	@Override
	public double calcularArea() {
		double area;
		area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área é: " + area);
		return area;
	}
}
