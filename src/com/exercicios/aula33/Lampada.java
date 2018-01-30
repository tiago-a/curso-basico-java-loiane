package com.exercicios.aula33;

public class Lampada {
	private boolean ligada;
	private double potencia;
	private String tipo;
	private int tensao;
	
	public Lampada( ) {
		this.ligada = false;
		this.potencia = 60.0;
		this.tipo = "incandecente";
		this.tensao = 220;
	}
	
	public Lampada(boolean ligada, double potencia, String tipo, int tensao) {
		this.ligada = ligada;
		this.potencia = potencia;
		this.tipo = tipo;
		this.tensao = tensao;
	}
	
	public boolean getLigada() {
		return this.ligada;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public double getPotencia() {
		return this.potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getTensao() {
		return this.tensao;
	}
	
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	public void ligarLampada() {
		if(this.getLigada()) {
			System.out.println("Lampada ja esta ligada!");
		} else {
			System.out.println("Ligando lampada!");
			this.setLigada(true);
		}
	}
	
	public void desligarLampada() {
		if(this.getLigada()) {
			System.out.println("Desligando lampada!");
			this.setLigada(false);
		} else {
			System.out.println("Lampada ja esta desligada!");
		}
	}
	
	public void mudarEstado() {
		if(this.getLigada()) {
			this.desligarLampada();
		} else {
			this.ligarLampada();
		}
	}
	
	public void printaInfo() {
		System.out.println("");
		System.out.println("A Lampada esta ligada? " + this.getLigada());
		System.out.println("A Lamapda tem potencia de: " + this.getPotencia());
		System.out.println("A Lampada e do tipo: " + this.getTipo());
		System.out.println("A Lampada e da tensao: " + this.getTensao());
		System.out.println("");
	}
}
