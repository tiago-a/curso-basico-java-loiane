package com.exercicios.set5;

public class Exercicio001 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		int temp = 0;
		int max = 0;
		int local_i = -1;
		int local_j = -1;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) Math.round(Math.random() * 20);
				System.out.println("matrix[" + i + "][" + j + "]: " + matrix[i][j]);
				temp = matrix[i][j];
				if (temp > max) {
					max = temp;
					local_i = i;
					local_j = j;
				}
			}
		}
		System.out.println("max: " + max);
		System.out.println("local_i: " + local_i);
		System.out.println("local_j: " + local_j);
	}

}
