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
			System.out.println("O coeficiente 'a' não pode ser zero.");
		} else {
			System.out.println("Digite o coeficiente 'b': ");
			double coefB = scan.nextDouble();
			
			System.out.println("Digite o coeficiente 'c': ");
			double coefC = scan.nextDouble();
			
			double delta = (coefB * coefB) - (4 * ( coefA * coefC));
			
			if (delta == 0) {
				System.out.println("Delta é igual a zero, a equação terá somente uma raíz.");
				raiz1 = -coefB / (2 * coefA);
				System.out.println("A raíz da equação é: " + raiz1);
			} else if (delta > 0) {
				System.out.println("Delta é maior que zero, a equação terá duas raízes.");
				raiz1 = (-coefB + Math.sqrt(delta))/(2 * coefA);
				raiz2 = (-coefB - Math.sqrt(delta))/(2 * coefA);
				System.out.println("As raízes da equação são: " + raiz1 + " e: " + raiz2);
			} else {
				System.out.println("Delta é negativo, portanto a equação não tem raízes reais.");
			}
		}

	}

}