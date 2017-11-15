package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para ser calculado seu fatorial: ");
		int fatorialUser = scan.nextInt();
		int resultado = 1;
		
		for (int i = 1; i <= fatorialUser; i++) {
			resultado = resultado * i;
		}
		System.out.println("O fatorial é: " + resultado);

	}

}
