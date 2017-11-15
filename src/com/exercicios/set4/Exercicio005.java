package com.exercicios.set4;

public class Exercicio005 {

	public static void main(String[] args) {
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		vetorA[0] = -9;
		vetorA[1] = 149;
		vetorA[2] = -449;
		vetorA[3] = 50;
		vetorA[4] = 49;
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;
			System.out.println("vetorB[" + i + "]: " + vetorB[i]);
		}
	}

}
