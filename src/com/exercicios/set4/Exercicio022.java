package com.exercicios.set4;

public class Exercicio022 {

	public static void main(String[] args) {
		int[] A = new int[10];
		
		double numZero = 0;
		double numUm = 0;
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * 1);
//			System.out.println(A[i]);
		}
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				numZero++;
			}
			if (A[i] == 1) {
				numUm++;
			}
		}
		
		System.out.println("% de 0: " + (numZero/A.length) * 100);
		System.out.println("% de 1: " + (numUm/A.length) * 100);
	}

}
