package com.exercicios.set4;

public class Exercicio016 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		
		int respA = 0;
		int respB = 0;
		double respC = 0.0;
		double soma = 0.0;
		
		vetorA[0] = -2; 
		vetorA[1] = 12; 
		vetorA[2] = 13; 
		vetorA[3] = 1;  
		vetorA[4] = 7;  
		vetorA[5] = 80; 
		vetorA[6] = 90; 
		vetorA[7] = 328;
		vetorA[8] = -11;
		vetorA[9] = -8;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				respA++;
			}
			if (vetorA[i] == 15) {
				respB++;
			}
			
			if (vetorA[i] > 15) {
				respC++;
				soma += vetorA[i];
			}
		}
		System.out.println("O numero de elementos menores que 15 e: " + respA);
		System.out.println("O numero de elementos iguais a 15 e: " + respB);
		System.out.println("A media dos numeros de elementos maiores que 15 e: " + (soma/respC));
		
	}

}
