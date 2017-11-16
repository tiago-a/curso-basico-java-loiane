package com.exercicios.set4;

public class Exercicio019 {

	public static void main(String[] args) {
		double[] nota1 = new double[5];
		double[] nota2 = new double[5];
		double[] result = new double[5];
		
		nota1[0] = 6.5;
		nota1[1] = 8.0;
		nota1[2] = 5.5;
		nota1[3] = 9.5;
		nota1[4] = 3.5;
		
		nota2[0] = 4.5;
		nota2[1] = 9.0;
		nota2[2] = 8.5;
		nota2[3] = 9.0;
		nota2[4] = 8.5;
		
		for (int i = 0; i < result.length; i++) {
			result[i] = (nota1[i] + nota2[i])/2;
			if (result[i] >= 7.0) {
				System.out.println("Aluno #" + (i+1) + " APROVADO, com média: " + result[i]);
			} else {
				System.out.println("Aluno #" + (i+1) + " REPROVADO, com média: " + result[i]);
			}
		}
		
	}

}
