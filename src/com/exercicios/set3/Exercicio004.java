package com.exercicios.set3;

public class Exercicio004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double populacaoA = 80000;
		double populacaoB = 200000;
		
		double taxaA = 0.03;
		double taxaB = 0.015;
		
		int  ano = 0;
		
		while(populacaoA <= populacaoB) {
			ano++;
			populacaoA = populacaoA + (taxaA * populacaoA);
			populacaoB = populacaoB + (taxaB * populacaoB);
		}
		System.out.println("A popula��o da cidade A �: " + populacaoA);
		System.out.println("A popula��o da cidade B �: " + populacaoB);
		System.out.println("Levaram " + ano + " anos para popula��o de A ultrapassar ou igual a de B.");

	}

}
