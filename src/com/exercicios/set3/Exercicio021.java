package com.exercicios.set3;

import java.util.Scanner;

import com.java.aula12.Scaniandoo;

public class Exercicio021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de turmas: ");
		double numeroTurma = scan.nextDouble();
		double mediaAlunos = 0;
		
		for (int i = 0; i < numeroTurma; i++) {
			System.out.println("Digite o n�mero de alunos para essa turma (n�o pode haver mais que 40)");
			int temp = scan.nextInt(); 
			if (temp > 40) {
				System.out.println("A turma n�o pode ter mais que 40 alunos, digite novamente.");
				i--;
			} else {
				mediaAlunos = mediaAlunos + temp/numeroTurma;
			}
		}
		System.out.println("N�mero de turmas: " + numeroTurma);
		System.out.println("M�dia de alunos por turmas: " + mediaAlunos);

	}

}
