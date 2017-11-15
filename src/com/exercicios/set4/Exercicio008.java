package com.exercicios.set4;

public class Exercicio008 {

	public static void main(String[] args) {
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		int[] vetorC = new int[5];
		
		vetorA[0] = -9;
		vetorA[1] = 149;
		vetorA[2] = -449;
		vetorA[3] = 50;
		vetorA[4] = 49;
		
		vetorB[0] = -1;
		vetorB[1] = 59;
		vetorB[2] = 9;
		vetorB[3] = 160;
		vetorB[4] = 4;
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.println("vetorC[" + i + "]: " + vetorC[i]);
		}

	}

}
