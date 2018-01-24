package com.exercicios.aula25a27;

public class Ex01 {

	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		l1.ligada = false;
		
		System.out.println("A lampada l1 esta ligada(true/false): " + l1.ligada);
		l1.ligarLampada();
		l1.desligarLampada();
	}

}
