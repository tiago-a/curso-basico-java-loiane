package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número N para gerar um série n/m, onde m são números primos.");
		int primoMax = scan.nextInt();
		int countPrimo = 0;
		double k = 1;
		double fracaoParcial = 0;
		
		System.out.print("s = ");
		for(double i = 1; i <= primoMax; i++) {
			for (int j = primoMax; j >= 1; j--) {
				if (i % j == 0) {
					countPrimo++;
				}
			}
			if (countPrimo == 2 || i == 1) {
				System.out.print(k + "/" + i + " + ");
				fracaoParcial = fracaoParcial + k/i;
//				System.out.println(fracaoParcial);
				k++;
			} else {
//				System.out.println("O número: " + i + " não é primo.");
			}
			countPrimo = 0;
		}
		System.out.println("\ns = " + fracaoParcial);

	}

}
