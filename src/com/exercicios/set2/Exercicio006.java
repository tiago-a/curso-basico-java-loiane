package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double primeiroNumero = scan.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double segundoNumero = scan.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		double terceiroNumero = scan.nextDouble();
		
		if ( primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro n�mero: " + primeiroNumero + " � maior que os n�meros: " + segundoNumero + " e " + terceiroNumero);
		} else if ( segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O segundo n�mero: " + segundoNumero + " � maior que os n�meros: " + primeiroNumero + " e " + terceiroNumero);
		} else if ( terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			System.out.println("O terceiro n�mero: " + terceiroNumero + " � maior que os n�meros: " + primeiroNumero + " e " + segundoNumero);
		} else if ( primeiroNumero == segundoNumero && primeiroNumero == terceiroNumero) {
			System.out.println("Os n�meros s�o iguais");
		} else {
			System.out.println("Erro no engano.");
		}

	}

}
