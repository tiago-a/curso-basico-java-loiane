package com.exercicios.set3;

import java.math.BigDecimal;

public class Exercicio024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pre�o do p�o: R$ 0.18");
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�osaaaa");
//		Double preco = 0.18d;
		BigDecimal preco = new BigDecimal("0.18");
		for (Double i = 1d; i <= 50; i++) {
			System.out.println(i + " - R$ " + (preco.multiply(new BigDecimal(i))));
		}

	}

}
