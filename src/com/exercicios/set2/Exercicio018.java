package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para saber se ele é par ou ímpar: ");
		int parImpar = scan.nextInt();
		
		if (parImpar == 0) {
			System.out.println(parImpar + " não é ímpar nem par.");
		} else if (parImpar % 2 == 0) {
			System.out.println(parImpar + " é par.");
		} else {
			System.out.println(parImpar + " é ímpar.");
		}

	}

}
