package com.exercicios.aula52;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		boolean exit = false;
		
		Agenda agenda = new Agenda();
		Contato c = new Contato();
		String nome = "";
		String telefone = "";
		int indice = 0;
		
		Scanner scan = new Scanner(System.in);
		String escolha = "";
		while(!exit) {
			System.out.println("Digite 1 - para adicionar contatos");
			System.out.println("Digite 2 - para consultar contatos");
			System.out.println("Digite 3 - para sair.");
			escolha = scan.nextLine();
			
			if (escolha.equals("1")) {
				System.out.println("Digite o nome: ");
				nome = scan.nextLine();
				System.out.println("Digite o telefone: ");
				telefone = scan.nextLine();
				agenda.adicionaContato(c);
			} else if (escolha.equals("2")) {
				agenda.consultaContato();
			} else if (escolha.equals("3")) {
				exit = true;
			} else {
				System.out.println("Opção invalida.");
			}
		}

	}

}
