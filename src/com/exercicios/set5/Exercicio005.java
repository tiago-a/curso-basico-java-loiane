package com.exercicios.set5;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		String[][][] calendario = new String[12][31][24];
		int mes = 0;
		int dia = 0;
		int hora = 0;
		int escolha = 0;
		String compromisso = new String();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < calendario.length; i++) {
			for (int j = 0; j < calendario[i].length; j++) {
				for (int k = 0; k < calendario[i][j].length; k++) {
					calendario[i][j][k] = "Nada planejado.";					
				}
			}
		}
		
		while(true) {
			System.out.println("Escolha entre consultar(1) ou escrever no calendário(2) ou sair(3): ");
			escolha = scan.nextInt();
			if (escolha == 1) {
				//consultar
				System.out.println("Digite o mes: ");
				mes = scan.nextInt();
				System.out.println("Digite o dia: ");
				dia = scan.nextInt();
				System.out.println("Digite a hora: ");
				hora = scan.nextInt();
				System.out.println(calendario[mes][dia][hora]);
			} else if (escolha == 2) {
				//escrever
				System.out.println("Digite o mes: ");
				mes = scan.nextInt();
				System.out.println("Digite o dia: ");
				dia = scan.nextInt();
				System.out.println("Digite a hora: ");
				hora = scan.nextInt();
				System.out.println("Entre com o compromisso para o dia " + dia + " às " + hora + ": ");
				compromisso = scan.next();
				calendario[mes][dia][hora] = compromisso;
			} else if (escolha == 3){
				break;
			}
			else {
				System.out.println("Opção Inválida, tente novamente.");
			}
			
		}
	}

}
