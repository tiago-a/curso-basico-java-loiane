package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio017 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um ano qualquer para saber se ele é Bisexto ou não.");
		int anoUser = scan.nextInt();
		
		if ( (anoUser % 400 == 0) || ((anoUser % 4 == 0) && (anoUser % 100 != 0))) {
			System.out.println(anoUser + " é um ano Bisexto.");
		} else {
			System.out.println(anoUser + " não é um ano Bisexto.");
		}

	}

}
