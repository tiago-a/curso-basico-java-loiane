package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número N para calcular o valor de H onde: H = 1 + 1/2 + 1/3 + ... + 1/N");
		int nUser = scan.nextInt();
		
		double fracaoParcial = 0;
		
		for (double i = 2; i <= nUser; i++) {
			fracaoParcial = fracaoParcial + 1/i;
		}
		double hFinal = fracaoParcial + 1;
		System.out.println("H = " + hFinal);

	}

}
