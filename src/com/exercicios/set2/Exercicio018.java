package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero para saber se ele � par ou �mpar: ");
		int parImpar = scan.nextInt();
		
		if (parImpar == 0) {
			System.out.println(parImpar + " n�o � �mpar nem par.");
		} else if (parImpar % 2 == 0) {
			System.out.println(parImpar + " � par.");
		} else {
			System.out.println(parImpar + " � �mpar.");
		}

	}

}
