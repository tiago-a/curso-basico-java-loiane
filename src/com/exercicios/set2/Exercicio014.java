package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		char conceito = 'X';
		String statusAluno = "Indefinido";
		
		if ( media >= 9 && media <= 10 ) {
			conceito = 'A';
			statusAluno = "APROVADO.";
		} else if ( media >= 7.5 && media < 9 ) {
			conceito = 'B';
			statusAluno = "APROVADO.";
		} else if ( media >= 6 && media < 7.5 ) {
			conceito = 'C';
			statusAluno = "APROVADO.";
		} else if ( media >= 4 && media < 6) {
			conceito = 'D';
			statusAluno = "REPROVADO.";
		} else if ( media >= 0 && media < 4) {
			conceito = 'E';
			statusAluno = "REPROVADO.";
		} else {
			System.out.println("Média inválida.");
		}
		
		System.out.println("\nAs sua notas foram: " + nota1 + " e " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Status: " + statusAluno);
	}

}
