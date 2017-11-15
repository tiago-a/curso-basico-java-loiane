package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ano = 0;
		boolean bMaiorQueA = true;
		
		double taxaA = 0;
		double taxaB = 0;
		
		System.out.println("Digite a população da cidade A: ");
		double populacaoA = scan.nextDouble();
		
		System.out.println("Digite a população da cidade B: ");
		double populacaoB = scan.nextDouble();
		
		while(bMaiorQueA) {
			
			System.out.println("Digite a taxa de crescimento da cidade A: ");
			taxaA = scan.nextDouble();
			
			System.out.println("Digite a taxa de crescimento da cidade B: ");
			taxaB = scan.nextDouble();
			
			if (taxaB < taxaA) {
				bMaiorQueA = false;
			} else {
				System.out.println("Taxa de crescimento de B não pode ser maio ou igual a A, digite os valores novamente.");
			}
		}
		
		while(populacaoA <= populacaoB) {
			ano++;
			populacaoA = populacaoA + (taxaA * populacaoA);
			populacaoB = populacaoB + (taxaB * populacaoB);
		}
		System.out.println("A população da cidade A é: " + populacaoA);
		System.out.println("A população da cidade B é: " + populacaoB);
		System.out.println("Levaram " + ano + " anos para população de A ultrapassar ou igual a de B.");


	}

}
