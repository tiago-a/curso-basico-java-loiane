package com.exercicios.set4;

public class Exercicio020 {

	public static void main(String[] args) {
		double[] A = new double[20];
		double cotacaoDolar = 3.78;
		
		A[0] = 5.99;
		A[1] = 182.13;
		A[2] = 15.09;
		A[3] = 9.99;
		A[4] = 2.00;
		A[5] = 31.41;
		A[6] = 2.21;
		A[7] = 77.11;
		A[8] = 3.02;
		A[9] = 2.62;
		A[10] = 18.71;
		A[11] = 421.21;
		A[12] = 81.75;
		A[13] = 655.10;
		A[14] = 30.00;
		A[15] = 23.21;
		A[16] = 4.21;
		A[17] = 25.99;
		A[18] = 1.79;
		A[19] = 2.65;
		
		for (int i = 0; i < A.length; i++) {
			A[i] *= cotacaoDolar;
			System.out.println("O valor de A[" + i + "]: " + A[i]);
		}
		
		
	}

}
