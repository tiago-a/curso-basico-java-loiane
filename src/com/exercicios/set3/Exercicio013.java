package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		double base = scan.nextDouble();
		
		System.out.println("Digite o expoente:");
		int expoente = scan.nextInt();
		
		double resultado = 1;
		
		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		System.out.println("Resultado: " + resultado);

	}

}
