package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double userIn;
		
		while(true) {
			System.out.print("Digite um numero de 0 a 10: ");
			userIn = scan.nextDouble();
			if (userIn > 0 && userIn < 10) {
				break;
<<<<<<< HEAD
=======
			} else {
				System.out.println("Nota inválida. Tente novamente.");
>>>>>>> adc920336f0fdddf4cca6ef9c5e11154ae9d6ea2
			}
		}

	}

}
