package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double primeiroNumero = scan.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double segundoNumero = scan.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		double terceiroNumero = scan.nextDouble();
		
		if ( primeiroNumero > segundoNumero && segundoNumero >= terceiroNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + primeiroNumero + " " + segundoNumero + " " + terceiroNumero);
		} else if ( segundoNumero > primeiroNumero && primeiroNumero >= terceiroNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + segundoNumero + " " + primeiroNumero + " " + terceiroNumero);
		} else if ( terceiroNumero > primeiroNumero && primeiroNumero >= segundoNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + terceiroNumero + " " + primeiroNumero + " " + segundoNumero);
		} else if ( primeiroNumero > terceiroNumero && terceiroNumero > segundoNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + primeiroNumero + " " + terceiroNumero + " " + segundoNumero);
		} else if ( segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + segundoNumero + " " + terceiroNumero + " " + primeiroNumero);
		} else if ( terceiroNumero > segundoNumero && segundoNumero > primeiroNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + terceiroNumero + " " + segundoNumero + " " + primeiroNumero);
		} else if ( primeiroNumero > segundoNumero && segundoNumero == terceiroNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + primeiroNumero + " " + segundoNumero + " " + segundoNumero);
		} else if ( segundoNumero > primeiroNumero && primeiroNumero == terceiroNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + segundoNumero + " " + primeiroNumero + " " + terceiroNumero);
		} else if ( terceiroNumero > primeiroNumero && primeiroNumero == segundoNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + terceiroNumero + " " + primeiroNumero + " " + segundoNumero);
		} else if ( segundoNumero > terceiroNumero && primeiroNumero == segundoNumero ) {
			System.out.println("Os n�mero em ordem decrescente: " + segundoNumero + " " + primeiroNumero + " " + terceiroNumero);
		} else {
			System.out.println("Os n�mero sao iguais.");
		}

	}

}
