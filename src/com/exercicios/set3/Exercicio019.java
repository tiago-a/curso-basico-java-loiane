package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio019 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número de notas:");
		
		int nNotas = scan.nextInt();
		double soma = 0;
		int nota;
		
		for (int i = 0; i < nNotas; i++) {
			System.out.println("Digite a nota: ");
			nota = scan.nextInt();
			soma += nota;
		}
		
		System.out.println("A média é: " + soma/nNotas);

	}

}
