package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se ele � primo ou n�o: ");
		int userPrimo = scan.nextInt();
		int countPrimo = 0;
		
		for (int i = 1; i <= userPrimo; i++) {
			if(userPrimo % i == 0) {
				countPrimo++;
//				System.out.println("� divisivel por: " + i);
			} else {
//				System.out.println("N�o � divisivel por: " + i);
			}
		}
		if (countPrimo == 2) {
			System.out.println("� primo!");
		} else {
			System.out.println("N�o � primo!");
		}
	}

}
