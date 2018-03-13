package com.exercicios.aula43;

public class Ex1 {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("Tiago", "123", 900.0);
		System.out.println(c1.toString());
		
		ContaPoupanca c2 = new ContaPoupanca("Tiago2", "321", 500.0, 5.0);
		System.out.println(c2.toString());
		
		ContaBancaria c3 = new ContaEspecial("Tiago Zika", "666", 1000.0, 200.0);
		System.out.println(c3.toString());
		
		c2.calculaNovoSaldo();
		System.out.println(c2.toString());
	}

}
