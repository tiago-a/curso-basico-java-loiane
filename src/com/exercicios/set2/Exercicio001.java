package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double primeiroNumero = scan.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		double segundoNumero = scan.nextDouble();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("O n�mero " + primeiroNumero + " � maior que o n�mero " + segundoNumero);
		} else if (primeiroNumero < segundoNumero) {
			System.out.println("O n�mero " + primeiroNumero + " � menor que o n�mero " + segundoNumero);
		} else
			System.out.println("O n�mero " + primeiroNumero + " � igual ao n�mero " + segundoNumero);

	}

}
