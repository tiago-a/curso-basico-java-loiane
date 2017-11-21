package com.exercicios.set4;

public class Exercicio032 {

	public static void main(String[] args) {
		int[] vetorA = new int[5];
		
		vetorA[0] = 3;
		vetorA[1] = 1;
		vetorA[2] = 4;
		vetorA[3] = -4;
		vetorA[4] = 8;
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.println(vetorA[i] + " x " + j + " : " + (vetorA[i] * j));
			}
			System.out.println();
		}
		
	}

}
