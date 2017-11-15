package com.exercicios.set4;

public class Exercicio003 {

	public static void main(String[] args) {
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		vetorA[0] = 1;
		vetorA[1] = 21;
		vetorA[2] = -4;
		vetorA[3] = 33;
		vetorA[4] = 642;
		vetorA[5] = 11;
		vetorA[6] = 1121;
		vetorA[7] = 10092;
		vetorA[8] = 10;
		vetorA[9] = 53;
		vetorA[10] = -822;
		vetorA[11] = 4;
		vetorA[12] = 111;
		vetorA[13] = 1004040;
		vetorA[14] = -1;
		
		System.out.println("Printando o vetor B:");
		for (int i = 0; i < vetorA.length ; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
			System.out.println("vetorB[" + i + "]: " + vetorB[i]);
		}
		

	}

}
