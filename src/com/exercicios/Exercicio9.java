package com.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Farenheit: ");
		double tempUser = scan.nextDouble();
		
		double tempCelsius = (5 * (tempUser - 32) / 9);
		System.out.print("A temperatura em Celsius é: " + tempCelsius);

	}

}
