package com.exercicios.aula46;

public class Cubo extends Figura3D {
	
	private double aresta;
	
	public Cubo(String nome, String cor) {
		super(nome, cor);
	}
	public double getAresta() {
		return aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
}
