package com.exercicios.aula43;

public class Ex02 {

	public static void main(String[] args) {
		Contribuinte c1 = new Contribuinte("Tiago", 0.25, 2400.0);
		c1.imprimeRendas();
		PessoaJuridica p1 = new PessoaJuridica("Locao", 9000.0);
		p1.imprimeRendas();
	}
}
