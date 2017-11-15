package com.exercicios.set4;

public class Exercicio012 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int soma = 0;
		
		vetorA[0] = -2;
		vetorA[1] = 12;
		vetorA[2] = 13;
		vetorA[3] = 1;
		vetorA[4] = 7;
		vetorA[5] = 80;
		vetorA[6] = 92;
		vetorA[7] = 327;
		vetorA[8] = -11;
		vetorA[9] = -8;
		
		for(int i = 0; i < vetorA.length ; i++) {
			soma += vetorA[i];
		}
		System.out.println("Soma dos elementos: " + soma);

	}

}
