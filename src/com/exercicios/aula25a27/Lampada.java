package com.exercicios.aula25a27;

public class Lampada {
	boolean ligada;
	double potencia;
	String tipo;
	int tensao;
	
	void ligarLampada() {
		if (ligada) {
			System.out.println("Lampada ja esta acesa.");
		} else {
			System.out.println("Ligando lampada.");
			ligada = true;
		}
	}
	
	void desligarLampada() {
		if (!ligada) {
			System.out.println("Lampada ja esta apagada.");
		} else {
			System.out.println("Desligando lampada.");
			ligada = false;
		}
	}
}
