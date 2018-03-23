package com.exercicios.aula52;

import java.util.Scanner;

public class Agenda {
	private Contato contatos[];

	public Agenda() { }
	
	public Agenda(Contato[] contatos) {
		super();
		this.contatos = contatos;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	public void consultaContato() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o indice do contato a ser consultado: ");
		int indice = scan.nextInt();
		scan.close();
		buscaContato(indice);
	}
	private void buscaContato(int indice) {
		this.contatos[indice].toString();
	}
	public void adicionaContato(Contato c) {
		int length = 1;
		if (this.contatos != null) {
			length = this.contatos.length + 1;
		} 
		Contato contatos[] = new Contato[length];
		
		if (this.contatos != null) {
			for(int i = 0; i < this.contatos.length; i++) {
				contatos[i] = this.contatos[i];
			}			
			contatos[length] = c;
		} else {
			contatos[length - 1] = c;
		}
		this.contatos = contatos;
	}
}
