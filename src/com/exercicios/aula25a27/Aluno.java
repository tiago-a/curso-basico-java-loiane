package com.exercicios.aula25a27;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	String[][] disciplinasNotas;
	
	void checaAprovacao() {
		for (int i = 0; i < disciplinasNotas.length; i++) {
			if (Double.parseDouble(disciplinasNotas[i][1]) >= 7) {
				System.out.println("O aluno " + nome +" esta APROVADO na disciplina: " + disciplinasNotas[i][0] + " com nota: " + disciplinasNotas[i][1]);
			} else {
				System.out.println("O aluno " + nome +" esta REPROVADO na disciplina: " + disciplinasNotas[i][0] + " com nota: " + disciplinasNotas[i][1]);
			}
			System.out.println();			
		}
	}
}
