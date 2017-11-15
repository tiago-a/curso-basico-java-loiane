package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio019 {

	public static void main(String[] args) {
		
		double resultado = 0;
		boolean continua = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Qual opera��o deseja realizar (+, - , * , /) ?");
		String escolha = scan.next();
		
		if ( escolha.equalsIgnoreCase("+")) {
			resultado = num1 + num2;
		} else if (escolha.equalsIgnoreCase("-")) {
			resultado = num1 - num2;
		} else if (escolha.equalsIgnoreCase("*")) {
			resultado = num1 * num2;
		} else if (escolha.equalsIgnoreCase("/")) {
			resultado = num1 / num2;
		} else {
			System.out.println("Op��o inv�lida.");
			continua = false;
		}
		
		if (continua) {
			if (resultado == 0) {
				System.out.println(resultado + " n�o � �mpar nem par.");
			} else if (resultado % 2 == 0) {
				System.out.println(resultado + " � par.");
			} else {
				System.out.println(resultado + " � �mpar.");
			}
			if (resultado > 0) {
				System.out.println(resultado + " � positivo.");
			} else if (resultado < 0) {
				System.out.println(resultado + " � negativo.");
			} else {
				System.out.println(resultado + " � zero.");
			}
		}
	}

}
