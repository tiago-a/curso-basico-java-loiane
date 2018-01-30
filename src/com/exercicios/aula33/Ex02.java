package com.exercicios.aula33;

public class Ex02 {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("1234-5", "Especial", 1000.0, 500.0);
		c1.printaInfo();
		c1.sacarDinheiro(1499.0);
		c1.printaInfo();
		c1.sacarDinheiro(200.0);
	}

}
