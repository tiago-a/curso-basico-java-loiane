package com.exercicios.aula36;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Curso curso = new Curso();
		Professor professor = new Professor();
		Scanner scan = new Scanner(System.in);
		
		professor.setNome("Hari Seldon");
		professor.setDepartamento("Big Data Master!");
		professor.setEmail("hseldon@gmail.com");
		professor.printInfo();
		
		Aluno aluno1 = new Aluno();
		double[] notasAluno1 = new double[4];
		for (int i = 0; i < notasAluno1.length; i++) {
			System.out.println("Entre com as 4 notas do aluno1: ");
			notasAluno1[i] = scan.nextDouble();
		}
		
		Aluno aluno2 = new Aluno();
		double[] notasAluno2 = new double[4];
		for (int i = 0; i < notasAluno2.length; i++) {
			System.out.println("Entre com as 4 notas do aluno2: ");
			notasAluno2[i] = scan.nextDouble();
		}
		
		Aluno aluno3 = new Aluno();
		double[] notasAluno3 = new double[4];
		for (int i = 0; i < notasAluno3.length; i++) {
			System.out.println("Entre com as 4 notas do aluno3: ");
			notasAluno3[i] = scan.nextDouble();
		}
		
		Aluno aluno4 = new Aluno();
		double[] notasAluno4 = new double[4];
		for (int i = 0; i < notasAluno4.length; i++) {
			System.out.println("Entre com as 4 notas do aluno4: ");
			notasAluno4[i] = scan.nextDouble();
		}
		
		Aluno aluno5 = new Aluno();
		double[] notasAluno5 = new double[4];
		for (int i = 0; i < notasAluno5.length; i++) {
			System.out.println("Entre com as 4 notas do aluno5: ");
			notasAluno5[i] = scan.nextDouble();
		}
		
		aluno1.setNome("Zezin");
		aluno1.setMatricula("123-0");
		aluno1.setNotas(notasAluno1);
		aluno1.printInfor();

		aluno2.setNome("Jaozin");
		aluno2.setMatricula("223-0");
		aluno2.setNotas(notasAluno2);
		aluno2.printInfor();

		aluno3.setNome("Paulin");
		aluno3.setMatricula("198-3");
		aluno3.setNotas(notasAluno3);
		aluno3.printInfor();

		aluno4.setNome("Juquinha");
		aluno4.setMatricula("443-0");
		aluno4.setNotas(notasAluno4);
		aluno4.printInfor();

		aluno5.setNome("Zezinzin");
		aluno5.setMatricula("666-0");
		aluno5.setNotas(notasAluno5);
		aluno5.printInfor();
		
		Aluno[] alunos = new Aluno[5];
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		alunos[2] = aluno3;
		alunos[3] = aluno4;
		alunos[4] = aluno5;
		
		
		
		curso.setNome("Big Data");
		curso.setHorario("Noturno");
		curso.setProfessor(professor);
		curso.setAlunos(alunos);
		curso.printInfo();
		scan.close();
	}

}
