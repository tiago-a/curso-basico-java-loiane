package com.exercicios.set4;

public class Exercicio010 {

	public static void main(String[] args) {
		int[] vetorA = new int[4];
		int[] vetorB = new int[4];
		
		vetorA[0] = -2;
		vetorA[1] = 6;
		vetorA[2] = 21;
		vetorA[3] = -17;
		
		System.out.println("VetorB = VetorA % 2");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] % 2;
			System.out.println("vetorB[" + i + "]: " + vetorB[i]);
		}
		

	}

}
