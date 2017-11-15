package com.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double tempCelsius = scan.nextDouble();
		
		double tempFarenheit = ((9 * tempCelsius)/5) + 32;
		System.out.print("A temperatura em Farenheit: " + tempFarenheit);

	}

}
