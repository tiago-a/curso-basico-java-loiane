package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio019 {

	public static void main(String[] args) {
		
		double resultado = 0;
		boolean continua = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Qual operação deseja realizar (+, - , * , /) ?");
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
			System.out.println("Opção inválida.");
			continua = false;
		}
		
		if (continua) {
			if (resultado == 0) {
				System.out.println(resultado + " não é ímpar nem par.");
			} else if (resultado % 2 == 0) {
				System.out.println(resultado + " é par.");
			} else {
				System.out.println(resultado + " é ímpar.");
			}
			if (resultado > 0) {
				System.out.println(resultado + " é positivo.");
			} else if (resultado < 0) {
				System.out.println(resultado + " é negativo.");
			} else {
				System.out.println(resultado + " é zero.");
			}
		}
	}

}
