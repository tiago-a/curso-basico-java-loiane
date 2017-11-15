package com.exercicios.set3;

public class Exercicio011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		for(int i = 0; i < 50; i++) {
			if (i%2 != 0) {
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.println("A soma dos números ímpares de 0 a 50 é: " + soma);

	}

}
