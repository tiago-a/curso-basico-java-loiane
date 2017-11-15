package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double userIn;
		
		while(true) {
			System.out.print("Digite um numero de 0 a 10: ");
			userIn = scan.nextDouble();
			if (userIn > 0 && userIn < 10) {
				break;
			}
		}

	}

}
