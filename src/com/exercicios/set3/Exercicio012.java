package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número de 0 a 10 que deseje vem a tabuada.");
		
		int numeroTabuada = scan.nextInt();
		System.out.println("Tabuada de " + numeroTabuada);
		for (int i = 0; i < 11; i++) {
			int resultadoTabuada = numeroTabuada * i;
			System.out.println(numeroTabuada + " X " + i + " = " + resultadoTabuada);
		}

	}

}
