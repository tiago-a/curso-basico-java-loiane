package com.exercicios.set4;

public class Exercicio015 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		
		double porcentoPar = 0.0;
		double porcentoImpar = 0.0;
		
		double numeroDePares = 0;
		double numeroDeImpares = 0;
		
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
			if (vetorA[i] % 2 != 0) {
				numeroDeImpares++;
			} else {
				numeroDePares++;
			}
		}
		porcentoImpar = (numeroDeImpares/vetorA.length) * 100;
		porcentoPar = (numeroDePares/vetorA.length) * 100;
		
		System.out.println("A porcentagem de números impares é: " + porcentoImpar);
		System.out.println("A porcentagem de números pares é: " + porcentoPar);

	}

}
