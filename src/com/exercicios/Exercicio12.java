package com.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua altura em metros: ");
		double alturaUser = scan.nextDouble();
		
		double pesoIdeal = (72.7 * alturaUser) - 58;
		System.out.print("Seu peso ideal é: " + pesoIdeal);

	}

}
