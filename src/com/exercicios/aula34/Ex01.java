package com.exercicios.aula34;

public class Ex01 {

	public static void main(String[] args) {
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		System.out.println(c1.getIncrementa());
		c3.incrementaContador();
		System.out.println(c2.getIncrementa());
		c2.zeraContador();
		System.out.println(c3.getIncrementa());
	}

}
