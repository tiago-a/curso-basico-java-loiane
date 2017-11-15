package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double primeiroNumero = scan.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double segundoNumero = scan.nextDouble();
		
		System.out.print("Digite o terceiro número: ");
		double terceiroNumero = scan.nextDouble();
		
		if ( primeiroNumero > segundoNumero && segundoNumero > terceiroNumero) {
			System.out.println("O maior número é o: " + primeiroNumero + " e o menor número é o " + terceiroNumero);
		} else if ( segundoNumero > primeiroNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O maior número é o: " + segundoNumero + " e o menor número é o " + terceiroNumero);
		} else if ( terceiroNumero > primeiroNumero && primeiroNumero > segundoNumero) {
			System.out.println("O maior número é o: " + terceiroNumero + " e o menor número é o " + segundoNumero);
		} else if ( primeiroNumero > segundoNumero && terceiroNumero > segundoNumero ) {
			System.out.println("O maior número é o: " + primeiroNumero + " e o menor número é o " + segundoNumero);
		} else if ( segundoNumero > primeiroNumero && terceiroNumero > primeiroNumero) {
			System.out.println("O maior número é o: " + segundoNumero + " e o menor número é o " + primeiroNumero);
		} else if ( terceiroNumero > primeiroNumero && segundoNumero > primeiroNumero) {
			System.out.println("O maior número é o: " + terceiroNumero + " e o menor número é o " + primeiroNumero);
		} else if ( primeiroNumero > segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("O maior número é o: " + primeiroNumero + " e o menor número é o " + terceiroNumero);
		} else if ( segundoNumero > primeiroNumero && primeiroNumero == terceiroNumero) {
			System.out.println("O maior número é o: " + segundoNumero + " e o menor número é o " + terceiroNumero);
		} else if ( terceiroNumero > primeiroNumero && primeiroNumero == segundoNumero) {
			System.out.println("O maior número é o: " + terceiroNumero + " e o menor número é o " + segundoNumero);
		} else {
			System.out.println("Os números são iguais.");
		}

	}

}
