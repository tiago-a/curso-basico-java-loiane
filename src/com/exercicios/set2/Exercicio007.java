package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double primeiroNumero = scan.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double segundoNumero = scan.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		double terceiroNumero = scan.nextDouble();
		
		if ( primeiroNumero > segundoNumero && segundoNumero > terceiroNumero) {
			System.out.println("O maior n�mero � o: " + primeiroNumero + " e o menor n�mero � o " + terceiroNumero);
		} else if ( segundoNumero > primeiroNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O maior n�mero � o: " + segundoNumero + " e o menor n�mero � o " + terceiroNumero);
		} else if ( terceiroNumero > primeiroNumero && primeiroNumero > segundoNumero) {
			System.out.println("O maior n�mero � o: " + terceiroNumero + " e o menor n�mero � o " + segundoNumero);
		} else if ( primeiroNumero > segundoNumero && terceiroNumero > segundoNumero ) {
			System.out.println("O maior n�mero � o: " + primeiroNumero + " e o menor n�mero � o " + segundoNumero);
		} else if ( segundoNumero > primeiroNumero && terceiroNumero > primeiroNumero) {
			System.out.println("O maior n�mero � o: " + segundoNumero + " e o menor n�mero � o " + primeiroNumero);
		} else if ( terceiroNumero > primeiroNumero && segundoNumero > primeiroNumero) {
			System.out.println("O maior n�mero � o: " + terceiroNumero + " e o menor n�mero � o " + primeiroNumero);
		} else if ( primeiroNumero > segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("O maior n�mero � o: " + primeiroNumero + " e o menor n�mero � o " + terceiroNumero);
		} else if ( segundoNumero > primeiroNumero && primeiroNumero == terceiroNumero) {
			System.out.println("O maior n�mero � o: " + segundoNumero + " e o menor n�mero � o " + terceiroNumero);
		} else if ( terceiroNumero > primeiroNumero && primeiroNumero == segundoNumero) {
			System.out.println("O maior n�mero � o: " + terceiroNumero + " e o menor n�mero � o " + segundoNumero);
		} else {
			System.out.println("Os n�meros s�o iguais.");
		}

	}

}
