package com.exercicios.aula36;

public class Agenda {
	private String nome;
	private Contato[] contatos;
	
	public Agenda(String nome) {
		this.nome = nome;
	}
	public Contato[] getContato() {
		return contatos;
	}
	public void setContato(Contato[] contato) {
		this.contatos = contato;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void printAllContacts() {
		for(Contato c : this.contatos) {
			c.printInfo();
		}
	}
	public void printSingleContact(int i) {
		this.contatos[i].printInfo();
	}
	
}
