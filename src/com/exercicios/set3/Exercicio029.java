package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o n�mero para testar se h� n�meros primos entre eles");
		int primoMax = scan.nextInt();
		int countPrimo = 0;
		
		for(int i = primoMax; i >= 1; i--) {
			for (int j = 1; j <= primoMax; j++) {
//				System.out.println("i: " + i);
//				System.out.println("j: " + j);
				if (i % j == 0) {
					countPrimo++;
				}
				
			}
			if (countPrimo == 2) {
				System.out.println("O n�mero: " + i + " � primo.");
			} else {
//				System.out.println("O n�mero: " + i + " n�o � primo.");
			}
			countPrimo = 0;
		}
	}

}
