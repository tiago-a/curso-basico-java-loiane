package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double temp = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um n�mero: ");
			double numero = scan.nextDouble();
			if (numero > temp) {
				temp = numero;
			}
		}
		
		System.out.println("O Maior dos n�meros digitados foi: " + temp);
		
		

	}

}
