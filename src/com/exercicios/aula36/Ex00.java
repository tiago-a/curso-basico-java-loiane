package com.exercicios.aula36;

import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o nome da sua agenda: ");
		String nomeAgenda = scan.nextLine();
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		Contato contato3 = new Contato();
		Contato[] contatos = new Contato[3];

		Agenda a1 = new Agenda(nomeAgenda);
		System.out.println("Sua agenda foi criada!");
		System.out.println("Agora entre com 3 contatos para iniciar a agenda.");

		System.out.println("Entre com as informacoes do primeiro contato ");
		System.out.println("Nome: ");
		contato1.setNome(scan.nextLine());
		System.out.println("Telefone: ");
		contato1.setTelefone(scan.nextLine());
		System.out.println("Email: ");
		contato1.setEmail(scan.nextLine());

		System.out.println("Entre com as informacoes do segundo contato ");
		System.out.println("Nome: ");
		contato2.setNome(scan.nextLine());
		System.out.println("Telefone: ");
		contato2.setTelefone(scan.nextLine());
		System.out.println("Email: ");
		contato2.setEmail(scan.nextLine());

		System.out.println("Entre com as informacoes do terceiro contato ");
		System.out.println("Nome: ");
		contato3.setNome(scan.nextLine());
		System.out.println("Telefone: ");
		contato3.setTelefone(scan.nextLine());
		System.out.println("Email: ");
		contato3.setEmail(scan.nextLine());
		
		contatos[0] = contato1;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		a1.setContato(contatos);
		
		a1.printAllContacts();

		

	}

}
