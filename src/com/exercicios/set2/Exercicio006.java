package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double primeiroNumero = scan.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double segundoNumero = scan.nextDouble();
		
		System.out.print("Digite o terceiro número: ");
		double terceiroNumero = scan.nextDouble();
		
		if ( primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro número: " + primeiroNumero + " é maior que os números: " + segundoNumero + " e " + terceiroNumero);
		} else if ( segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O segundo número: " + segundoNumero + " é maior que os números: " + primeiroNumero + " e " + terceiroNumero);
		} else if ( terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			System.out.println("O terceiro número: " + terceiroNumero + " é maior que os números: " + primeiroNumero + " e " + segundoNumero);
		} else if ( primeiroNumero == segundoNumero && primeiroNumero == terceiroNumero) {
			System.out.println("Os números são iguais");
		} else {
			System.out.println("Erro no engano.");
		}

	}

}
