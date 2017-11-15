package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é primo ou não.");
		int primoUser = scan.nextInt();
		int countPrimo = 0;
		
		for (int i = 1; i <= primoUser; i++) {
			if (primoUser % i == 0) {
//				System.out.println("É divisivel por: " + i);
				countPrimo++;
			} else {
//				System.out.println("Não é divisivel");
			}
		}
//		System.out.println("count: " + countPrimo);
		if (countPrimo == 2) {
			System.out.println("É primo!");
		} else {
			System.out.println("Não é primo!");
		}

	}

}
