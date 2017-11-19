package com.exercicios.set4;

public class Exercicio029 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
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
		
		vetorB[0] = -2;  
		vetorB[1] = 66;  
		vetorB[2] = 3;  
		vetorB[3] = 8;   
		vetorB[4] = 33;   
		vetorB[5] = 100;  
		vetorB[6] = 12;  
		vetorB[7] = 328; 
		vetorB[8] = -71; 
		vetorB[9] = -8;
		
		for (int i = 0; i < vetorC.length; i++) {
			if ( i < 10) {
				vetorC[i] = vetorA[i]; 
			} else {
				vetorC[i] = vetorB[i-10];
			}
			System.out.println("VetorC[" + i + "]: " + vetorC[i]);
		}
	}

}
