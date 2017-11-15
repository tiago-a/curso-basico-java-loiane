package com.exercicios.set4;

public class Exercicio002 {

	public static void main(String[] args) {
		double[] vetorA = new double[8];
		double[] vetorB = new double[8];
		
		vetorA[0] = -2;
		vetorA[1] = 11;
		vetorA[2] = 34;
		vetorA[3] = 200.1;
		vetorA[4] = 12.4;
		vetorA[5] = -4.1;
		vetorA[6] = 2.445;
		vetorA[7] = 9;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * 2;
			System.out.println("vetorB[" + i + "]: " + vetorB[i]);
		}
	}

}
