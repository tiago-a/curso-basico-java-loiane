package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o dia da semana em número: ");
		int numeroSemana = scan.nextInt();
		
		switch ( numeroSemana ) {
		
			case 1: System.out.println("1 - Domingo"); break;
			case 2: System.out.println("2 - Segunda-Feira"); break;
			case 3: System.out.println("3 - Terça-Feira"); break;
			case 4: System.out.println("4 - Quarta-Feira"); break;
			case 5: System.out.println("5 - Quinta-Feira"); break;
			case 6: System.out.println("6 - Sexta-Feira"); break;
			case 7: System.out.println("7 - Sábado"); break;
			default: System.out.println("Dia inválido."); break;
		}

	}

}
