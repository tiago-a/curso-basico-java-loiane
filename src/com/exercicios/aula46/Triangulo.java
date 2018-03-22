package com.exercicios.aula46;

public class Triangulo extends Figura2D {
	
	private double base;
	private double altura;

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		double area;
		area = (base * altura)/2;
		System.out.println("A �rea �: " + area);
		return area;
	}
}
