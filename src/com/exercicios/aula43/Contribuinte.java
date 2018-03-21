package com.exercicios.aula43;

public class Contribuinte {
	private String nome;
	private double taxa;
	private double imposto;
	private double renda;
	
	public Contribuinte(String nome, double renda) {
		this.nome = nome;
		this.renda = renda;
	}
	
	public Contribuinte(String nome, double taxa, double renda) {
		this.nome = nome;
		this.taxa = taxa;
		this.renda = renda;
		this.imposto = this.calculaImposto();
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private double calculaImposto() {
		this.imposto = this.renda * this.taxa;
		return this.imposto;
	}
	private double calculaRendaLiquida() {
		double rendaLiquida = this.renda - this.calculaImposto();
		return rendaLiquida;
	}
	public void imprimeRendas() {
		System.out.println("\nInforma��es do Contribuinte: " + this.nome);
		System.out.println("Sua renda bruta � de: " + this.renda);
		System.out.println("Taxa de imposto: " + this.taxa);
		System.out.println("Total pago em imposto: " + this.imposto);
		System.out.println("Sua renda l�quida: " + this.calculaRendaLiquida());
	}
}
