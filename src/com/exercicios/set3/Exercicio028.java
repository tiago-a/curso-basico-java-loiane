package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é primo ou não: ");
		int userPrimo = scan.nextInt();
		int countPrimo = 0;
		
		for (int i = 1; i <= userPrimo; i++) {
			if(userPrimo % i == 0) {
				countPrimo++;
//				System.out.println("É divisivel por: " + i);
			} else {
//				System.out.println("Não é divisivel por: " + i);
			}
		}
		if (countPrimo == 2) {
			System.out.println("É primo!");
		} else {
			System.out.println("Não é primo!");
		}
	}

}
