package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio016 {

	public static void main(String[] args) {
		
		double raiz1 = 0;
		double raiz2 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente 'a': ");
		double coefA = scan.nextDouble();
		
		if ( coefA == 0) {
			System.out.println("O coeficiente 'a' n�o pode ser zero.");
		} else {
			System.out.println("Digite o coeficiente 'b': ");
			double coefB = scan.nextDouble();
			
			System.out.println("Digite o coeficiente 'c': ");
			double coefC = scan.nextDouble();
			
			double delta = (coefB * coefB) - (4 * ( coefA * coefC));
			
			if (delta == 0) {
				System.out.println("Delta � igual a zero, a equa��o ter� somente uma ra�z.");
				raiz1 = -coefB / (2 * coefA);
				System.out.println("A ra�z da equa��o �: " + raiz1);
			} else if (delta > 0) {
				System.out.println("Delta � maior que zero, a equa��o ter� duas ra�zes.");
				raiz1 = (-coefB + Math.sqrt(delta))/(2 * coefA);
				raiz2 = (-coefB - Math.sqrt(delta))/(2 * coefA);
				System.out.println("As ra�zes da equa��o s�o: " + raiz1 + " e: " + raiz2);
			} else {
				System.out.println("Delta � negativo, portanto a equa��o n�o tem ra�zes reais.");
			}
		}

	}

}