package com.exercicios.set5;

public class Exercicio002 {

	public static void main(String[] args) {
		int[][] matrix = new int [10][10];
		int maior = 0;
		int menor = 10;
		int temp_menor = Integer.MIN_VALUE;
		int temp_maior = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) Math.round(Math.random() * 10);
//				System.out.print("[" + i + "][" + j + "]: " + matrix[i][j] + " ");
				System.out.print(" " + matrix[i][j] + ", ");
			}
			System.out.println();
		}
		
		for (int i = 0 ; i < matrix[4].length; i++) {
			temp_menor = matrix[4][i];
			temp_maior = matrix[4][i];
			
			if (temp_menor < menor) {
				menor = temp_menor;
			}
			if (temp_maior > maior) {
				maior = temp_maior;
			}
		}
		System.out.println("Menor linha 5: " + menor);
		System.out.println("Maior linha 5: " + maior);
		maior = 0;
		menor = 10;
		temp_menor = Integer.MIN_VALUE;
		temp_maior = Integer.MAX_VALUE;
		
		for (int i = 0 ; i < matrix[6].length; i++) {
			temp_menor = matrix[6][i];
			temp_maior = matrix[6][i];
			
			if (temp_menor < menor) {
				menor = temp_menor;
			}
			if (temp_maior > maior) {
				maior = temp_maior;
			}
		}
		System.out.println("Menor linha 7: " + menor);
		System.out.println("Maior linha 7: " + maior);
	}

}
