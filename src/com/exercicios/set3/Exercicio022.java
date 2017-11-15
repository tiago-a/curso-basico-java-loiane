package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de CD's: ");
		double numeroCDs = scan.nextDouble();
		double precoMedioCD = 0;
		
		for (int i = 0; i < numeroCDs; i++) {
			System.out.println("Digite o preço para esse CD: ");
			precoMedioCD = precoMedioCD + scan.nextDouble()/numeroCDs;
		}
		System.out.println("O valor médio pago em um CD de sua coleção é: " + precoMedioCD);

	}

}
