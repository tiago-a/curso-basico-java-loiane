package com.java.aula14;

public class Exercicio001 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.marca = "Consul";
		lampada.modelo = "A01";
		lampada.potencia = 60.0;
		lampada.preco = 40.0;
		lampada.tipo = "LED";
		
		System.out.println(lampada.marca);
		System.out.println(lampada.modelo);
		System.out.println(lampada.potencia);
		System.out.println(lampada.preco);
		System.out.println(lampada.tipo);
	}

}
