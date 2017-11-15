package com.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		int soma = primeiroNumero + segundoNumero;
		
		System.out.println("A soma do primeiro número e do segundo número é: " + soma);

	}

}
