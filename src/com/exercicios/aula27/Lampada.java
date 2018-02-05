package com.exercicios.aula27;

public class Lampada {
	boolean ligada;
	int potencia;
	String tensao;
	String tipo;
	
	void ligarLampada() {
		if (ligada) {
			System.out.println("A lampada já está acesa.");
		} else {
			System.out.println("Ligando a lampanda.");
			ligada = true;
		}
	}
	
	void apagarLampada() {
		if (ligada) {
			System.out.println("Apagando a lampada.");
			ligada = false;
		} else {
			System.out.println("Lampada já está apagada.");
		}
	}
	
}