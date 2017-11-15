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
<<<<<<< HEAD
			H = H + fracao;
=======
//			H = H + fracao;
			H += fracao;
>>>>>>> adc920336f0fdddf4cca6ef9c5e11154ae9d6ea2
//			System.out.println(fracao);
//			System.out.println(H);
		}
		System.out.println("Valor de H: " + H);

	}

}
