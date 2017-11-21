package com.exercicios.set4;

public class Exercicio034 {

	public static void main(String[] args) {
		double[] vetorA = new double[10];
		
		vetorA[0] = 2.0;  
		vetorA[1] = 12.0; 
		vetorA[2] = 13.0; 
		vetorA[3] = 23.0;  
		vetorA[4] = 7.0;  
		vetorA[5] = 80.0; 
		vetorA[6] = 90.0; 
		vetorA[7] = 28.0; 
		vetorA[8] = 11.0; 
		vetorA[9] = 2.0;
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 1; j <= vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println("vetorA[" + i + "]: " + vetorA[i] + "/" + j + " = " + (vetorA[i]/j));					
				}
			}
		}
	}

}
