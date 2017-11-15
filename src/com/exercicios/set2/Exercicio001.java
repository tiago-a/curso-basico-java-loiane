package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double primeiroNumero = scan.nextDouble();
		
		System.out.print("Digite outro número: ");
		double segundoNumero = scan.nextDouble();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("O número " + primeiroNumero + " é maior que o número " + segundoNumero);
		} else if (primeiroNumero < segundoNumero) {
			System.out.println("O número " + primeiroNumero + " é menor que o número " + segundoNumero);
		} else
			System.out.println("O número " + primeiroNumero + " é igual ao número " + segundoNumero);

	}

}
