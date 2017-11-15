package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de alunos a turma tem.");
		int numeroAlunos = scan.nextInt();
		double mediaIdade = 0;
		
		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite a idade para esse aluno: ");
			mediaIdade = mediaIdade + scan.nextDouble()/numeroAlunos;
		}
		
		if (mediaIdade > 0 && mediaIdade <= 25) {
			System.out.println("Média de idade da turma é: " + mediaIdade + ", turma jovem!");
		} else if (mediaIdade > 25 && mediaIdade <= 60) {
			System.out.println("Média de idade da turma é: " + mediaIdade + ", turma adulta!");
		} else {
			System.out.println("Média de idade da turma é: " + mediaIdade + ", turma idosa!");
		}

	}

}
