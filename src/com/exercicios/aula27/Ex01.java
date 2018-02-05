package com.exercicios.aula27;

public class Ex01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.ligada = false;
		
		lampada.ligarLampada();
		System.out.println();
		lampada.apagarLampada();
		lampada.apagarLampada();
	}

}
