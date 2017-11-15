package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o N termos: ");
		int Ntermo = scan.nextInt();
		double H = 0;
		double fracao = 0;
		
		for (double i = 1; i <= Ntermo; i++) {
			fracao = 1/i;
//			H = H + fracao;
			H += fracao;
//			System.out.println(fracao);
//			System.out.println(H);
		}
		System.out.println("Valor de H: " + H);

	}

}
