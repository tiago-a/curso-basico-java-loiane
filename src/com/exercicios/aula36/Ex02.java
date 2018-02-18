package com.exercicios.aula36;

public class Ex02 {

	public static void main(String[] args) {
		Curso curso = new Curso();
		Professor professor = new Professor();
		
		professor.setNome("Hari Seldon");
		professor.setDepartamento("Big Data Master!");
		professor.setEmail("hseldon@gmail.com");
		professor.printInfo();
		
		Aluno aluno1 = new Aluno();
		double[] notasAluno1 = new double[4];
		notasAluno1[0] = 1.1;
		notasAluno1[1] = 7.1;
		notasAluno1[2] = 8.1;
		notasAluno1[3] = 5.5;
		
		aluno1.setNome("Zezin");
		aluno1.setMatricula("123-0");
		aluno1.setNotas(notasAluno1);
		
		aluno1.printInfor();
		
		Aluno[] alunos = new Aluno[3];
		
		
		
		curso.setNome("Big Data");
		curso.setHorario("Noturno");
//		curso.setProfessor("Hari Seldon");
		curso.setAlunos(alunos);
	}

}
