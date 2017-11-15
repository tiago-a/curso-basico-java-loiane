package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numeroUser = 0;
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numeroUser = scan.nextInt();
			if (numeroUser % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Quantidade números pares: " + pares);
		System.out.println("Quantidade números impares: " + impares);

	}

}
