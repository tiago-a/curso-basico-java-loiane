package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para calcular o seu fatorial");
		int fatorialUser = scan.nextInt();
		int resultadoFatorial = 1;
		System.out.println("Fatorial de: " + fatorialUser);
		System.out.print(fatorialUser + "! = ");
		for (int i = 1; i <= fatorialUser; i++) {
			resultadoFatorial = resultadoFatorial * i;
		}
		System.out.print(resultadoFatorial);

	}

}
