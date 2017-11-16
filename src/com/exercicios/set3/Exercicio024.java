package com.exercicios.set3;

import java.math.BigDecimal;

public class Exercicio024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Preço do pão: R$ 0.18");

		System.out.println("Panificadora Pão de Ontem - Tabela de preçosaaaa");
		// Double preco = 0.18d;
		BigDecimal preco = new BigDecimal("0.18");
		for (Double i = 1d; i <= 50; i++) {
			System.out.println(i + " - R$ " + (preco.multiply(new BigDecimal(i))));

			System.out.println("Panificadora Pão de Ontem - Tabela de preços");
			for (int a = 1; a <= 50; a++) {
				System.out.println(a + " - R$ " + (a * 0.18));

			}

		}

	}
}
