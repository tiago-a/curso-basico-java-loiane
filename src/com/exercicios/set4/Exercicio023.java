package com.exercicios.set4;

public class Exercicio023 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		
		vetorA[0] = 2; 
		vetorA[1] = 12;
		vetorA[2] = 13;
		vetorA[3] = 1; 
		vetorA[4] = 7; 
		vetorA[5] = 80;
		vetorA[6] = 90;
		vetorA[7] = 28;
		vetorA[8] = 11;
		vetorA[9] = 8;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				System.out.println("O elemento : " + vetorA[i] + " n�o � par, parando o loop.");
				break;
			} 
		}
	}

}
