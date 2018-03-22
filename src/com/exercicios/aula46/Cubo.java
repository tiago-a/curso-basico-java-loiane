package com.exercicios.aula46;

public class Cubo extends Figura3D {
	
	private double aresta;
	
	public double getAresta() {
		return aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	@Override
	public void calcularVolume() {
		double volume;
		volume = calcularArea() * aresta;
		System.out.println("O volume é: " + volume);
	}
	@Override
	public double calcularArea() {
		double area;
		area = Math.pow(aresta, 2);
		System.out.println("A área é: " + area);
		return area;
	}
}
