package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota do aluno: ");
		double primeiraNota = scan.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		double segundaNota = scan.nextDouble();
		
		double media = (primeiraNota + segundaNota)/2;
		
		if (media >= 7 && media < 10) {
			System.out.println("O aluno est� aprovado.");
			System.out.println("Com m�dia: " + media);
		} else if (media < 7) {
			System.out.println("O aluno est� reprovado.");
			System.out.println("Com m�dia: " + media);
		} else if (media == 10){
			System.out.println("O aluno est� aprovado com distin��o!");
			System.out.println("Com m�dia: " + media);
		} else {
			System.out.println("M�dia inv�lida.");
		}

	}

}