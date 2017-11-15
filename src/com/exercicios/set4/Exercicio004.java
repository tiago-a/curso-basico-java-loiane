package com.exercicios.set4;

public class Exercicio004 {

	public static void main(String[] args) {
		int[] vetorA = new int[5];
		double[] vetorB = new double[5];
		
		vetorA[0] = 9;
		vetorA[1] = 19;
		vetorA[2] = 449;
		vetorA[3] = 59;
		vetorA[4] = 29;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
			System.out.println("vetorB[" + i + "]: " + vetorB[i]);
		}
		
	}

}
