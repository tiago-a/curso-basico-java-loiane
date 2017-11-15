package com.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numeroInt1 = scan.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		int numeroInt2 = scan.nextInt();
		
		System.out.print("Digite um número real: ");
		double numeroReal1 = scan.nextDouble();
		
		double calculoA = (2 * numeroInt1) * (numeroInt2/2);
		System.out.println("O dobro do primeiro número com produto da metade do segundo número é: " + calculoA);
		
		double calculoB = (3 * numeroInt1) + (numeroReal1);
		System.out.println("A soma do triplo do primeiro número com o terceiro é: " + calculoB);
		
		double calculoC = Math.pow(numeroReal1, 3);
		System.out.println("O terceiro número elevado ao cubo é: " + calculoC);

	}

}
