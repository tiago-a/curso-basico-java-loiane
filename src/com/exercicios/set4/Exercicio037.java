package com.exercicios.set4;

public class Exercicio037 {

	public static void main(String[] args) {
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		vetorA[0] = 2;  
		vetorA[1] = 12; 
		vetorA[2] = 13; 
		vetorA[3] = 23;  
		vetorA[4] = 7;  
		vetorA[5] = 21; 
		vetorA[6] = 13; 
		vetorA[7] = 23; 
		vetorA[8] = 11; 
		vetorA[9] = 2;
		vetorA[10] = 4;
		vetorA[11] = 6;
		vetorA[12] = 9;
		vetorA[13] = 12;
		vetorA[14] = 20;
		int temp = 1;
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 1; j <= vetorA[i]; j++) {
				temp = j * temp; 
			}
			vetorB[i] = temp;
			temp = 1;
			System.out.println(vetorB[i]);
		}
	}

}
