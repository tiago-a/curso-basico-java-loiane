package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numeroUser = scan.nextDouble();
		
		if (numeroUser > 0) {
			System.out.print("O número: " + numeroUser + " é positivo.");
		} else if (numeroUser < 0){
			System.out.print("O número: " + numeroUser + " é negativo.");
		} else
			System.out.print("O número: " + numeroUser + " é zero.");

	}

}
