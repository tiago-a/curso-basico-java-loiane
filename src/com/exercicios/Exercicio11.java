package com.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int numeroInt1 = scan.nextInt();
		
		System.out.print("Digite outro n�mero inteiro: ");
		int numeroInt2 = scan.nextInt();
		
		System.out.print("Digite um n�mero real: ");
		double numeroReal1 = scan.nextDouble();
		
		double calculoA = (2 * numeroInt1) * (numeroInt2/2);
		System.out.println("O dobro do primeiro n�mero com produto da metade do segundo n�mero �: " + calculoA);
		
		double calculoB = (3 * numeroInt1) + (numeroReal1);
		System.out.println("A soma do triplo do primeiro n�mero com o terceiro �: " + calculoB);
		
		double calculoC = Math.pow(numeroReal1, 3);
		System.out.println("O terceiro n�mero elevado ao cubo �: " + calculoC);

	}

}
