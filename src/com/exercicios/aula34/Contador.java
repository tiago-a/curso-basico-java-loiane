package com.exercicios.aula34;

public class Contador {
	private static int incrementa;
	
	public Contador() {
		this.incrementaContador();
	}
	
	public void zeraContador() {
		this.incrementa = 0;
	}
	
	public void incrementaContador() {
		this.incrementa++;
	}
	
	public int getIncrementa() {
		return this.incrementa;
	}
}
