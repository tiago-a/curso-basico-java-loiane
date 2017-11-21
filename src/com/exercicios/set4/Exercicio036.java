package com.exercicios.set4;

public class Exercicio036 {

	public static void main(String[] args) {
		double[] vetorA = new double[11];
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Math.pow(2, i);
			System.out.println("vetorA[" + i + "]: " + vetorA[i]);
		}

	}

}
