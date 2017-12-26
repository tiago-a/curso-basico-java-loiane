package com.exercicios.set5;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		int qtdPar = 0;
		int qtdImpar = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print("Entre com o valor matrix[" + i + "][" + j + "]: ");
				matrix[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j] + ", ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] % 2 == 0) {
					//é par
					qtdPar++;
				} else {
					//é impar
					qtdImpar++;
				}
			}
		}
		System.out.println("Quantidade de números pares: " + qtdPar);
		System.out.println("Quantidade de números impares: " + qtdImpar);
		
	}

}
