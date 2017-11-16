package com.exercicios.set4;

public class Exercicio026 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		vetorA[0] = 2; 
		vetorA[1] = 12;
		vetorA[2] = 13;
		vetorA[3] = 1; 
		vetorA[4] = 7; 
		vetorA[5] = 80;
		vetorA[6] = 90;
		vetorA[7] = 28;
		vetorA[8] = 11;
		vetorA[9] = 2; 
		
		vetorB[0] = 22; 
		vetorB[1] = 2;
		vetorB[2] = 3;
		vetorB[3] = 121; 
		vetorB[4] = 2; 
		vetorB[5] = 50;
		vetorB[6] = 90;
		vetorB[7] = 58;
		vetorB[8] = 56;
		vetorB[9] = 23;
		
		for (int i = 0; i < vetorC.length; i++) {
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			} else {
				vetorC[i] = 0;
			}
			System.out.println("VetorC[" + i + "]: " + vetorC[i]);
		}
	}

}
