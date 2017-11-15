package com.exercicios.set4;

public class Exercicio001 {

	public static void main(String[] args) {
		int [] VetorA = new int[5];
		int [] VetorB = new int[5];
		
		VetorA[0] = 4;
		VetorA[1] = 1;
		VetorA[2] = 33;
		VetorA[3] = 102;
		VetorA[4] = -91;
		
		for (int i = 0; i < VetorA.length; i++) {
			System.out.println("VetorA[" + i + "]: " + VetorA[i]);
			VetorB[i] = VetorA[i];
		}
		System.out.println("\nPrintando o vetor B: ");
		for (int i = 0; i < VetorB.length; i++) {
			System.out.println("VetorB[" + i + "]: " + VetorB[i]);
		}
		
	}

}
