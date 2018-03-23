package com.exercicios.aula52;

public class Contato {
	private String nome;
	private String telefone;
	private int ID;
	
	public static int IDGenerator;
	
	public Contato() {
		this.ID = ++IDGenerator;
	}
	
	public Contato(String nome, String telefone, String iD) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.ID = ++IDGenerator;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public static int getIDGenerator() {
		return IDGenerator;
	}

	public static void setIDGenerator(int iDGenerator) {
		IDGenerator = iDGenerator;
	}
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", ID=" + ID + "]";
	}
	
	
}
