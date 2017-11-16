package com.exercicios.set4;

public class Exercicio027 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		char[] vetorB = new char[10];
		
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
		
		for (int i = 0; i < vetorB.length; i++) {
			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else if (vetorA[i] > 7) {
				vetorB[i] = 'e';
			} else {
				vetorB[i] = 'x';
			}
			System.out.println(vetorB[i]);
		}
	}

}
