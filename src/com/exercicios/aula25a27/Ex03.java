package com.exercicios.aula25a27;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		a1.nome = scan.nextLine();
		System.out.println("Digite a matricula do aluno: ");
		a1.matricula = scan.nextLine();
		System.out.println("Digite o curso do aluno: ");
		a1.curso = scan.nextLine();

		a1.disciplinasNotas = new String[3][2];
		for (int i = 0; i < a1.disciplinasNotas.length; i++) {
			System.out.println("Entre com o nome da disciplina: ");
			a1.disciplinasNotas[i][0] = scan.nextLine();
			System.out.println("Entre com a nota da disciplina: ");
			a1.disciplinasNotas[i][1] = scan.nextLine();
		}

		a1.checaAprovacao();
	}

}
