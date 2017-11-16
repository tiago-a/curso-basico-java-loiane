package com.exercicios.set4;

public class Exercicio018 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		
		int posMenor = 0;
		int posMaior = 0;
		int idadeMenor = 0;
		int idadeMaior = 0;
		
		int tempMenor = Integer.MAX_VALUE;
		int tempMaior = Integer.MIN_VALUE;
		
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
			if (vetorA[i] < tempMenor) {
				tempMenor = vetorA[i];
				posMenor = i + 1;
			}
			if (vetorA[i] > tempMaior) {
				tempMaior = vetorA[i];
				posMaior = i + 1;
			}
		}
		
		System.out.println("A pessoa com menor idade é a #" + posMenor + " com idade: " + tempMenor);
		System.out.println("A pessoa com maior idade é a #" + posMaior + " com idade: " + tempMaior);

	}

}
