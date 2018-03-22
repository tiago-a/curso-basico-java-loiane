package com.exercicios.aula46;

public class Quadrado extends Figura2D {
	
	private double aresta;

	public Quadrado(String nome, String cor) {
		super(nome, cor);
	}
	public double getAresta() {
		return aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
}
