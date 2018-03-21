package com.exercicios.aula43;

import java.util.Arrays;

public class Peixe extends Animal {
	private String[] caracteristicas;

	public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
			String[] caracteristicas) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
	}
	public String[] getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	@Override
	public String toString() {
		String s = super.toString();
		return s += " Peixe [caracteristicas=" + Arrays.toString(caracteristicas) + "]";
	}
}
