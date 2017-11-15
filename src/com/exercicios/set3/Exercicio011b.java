package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio011b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		
		for (int i = num1 + 1; i < num2; i++) {
			soma += i;
		}
		System.out.println("A soma dos números entre " + num1 + " e " + num2 + " é: " + soma);
		
		

	}

}
