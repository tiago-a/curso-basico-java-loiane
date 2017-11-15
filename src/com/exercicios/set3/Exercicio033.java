package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número para testar se há números primos entre eles");
		int primoMax = scan.nextInt();
		int countPrimo = 0;
		int k = 1;
//		for(int i = primoMax; i >= 1; i--) {
//			for (int j = 1; j <= primoMax; j++) {
//				if (i % j == 0) {
		for(int i = 1; i <= primoMax; i++) {
			for (int j = primoMax; j >= 1; j--) {
				if (i % j == 0) {
					countPrimo++;
				}
			}
			if (countPrimo == 2 || i == 1) {
//				System.out.println("O número: " + i + " é primo.");
				System.out.print("s = ");
				System.out.print(k + "/" + i + " ");
				k++;
			} else {
//				System.out.println("O número: " + i + " não é primo.");
			}
			countPrimo = 0;
		}
	}

}
