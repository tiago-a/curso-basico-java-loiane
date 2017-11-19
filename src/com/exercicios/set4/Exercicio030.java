package com.exercicios.set4;

public class Exercicio030 {

	public static void main(String[] args) {
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int[] vetorC = new int[20];
		
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
		vetorA[10] = -2; 
		vetorA[11] = 66; 
		vetorA[12] = 3;  
		vetorA[13] = 8;  
		vetorA[14] = 33; 
		vetorA[15] = 100;
		vetorA[16] = 12; 
		vetorA[17] = 328;
		vetorA[18] = -71;
		vetorA[19] = -8;
				
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
			} else {
				vetorC[i] = vetorA[i];
			}
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + ", ");
		}
	}

}
