package com.exercicios.set3;

<<<<<<< HEAD
import java.math.BigDecimal;

=======
>>>>>>> adc920336f0fdddf4cca6ef9c5e11154ae9d6ea2
public class Exercicio024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Preço do pão: R$ 0.18");
<<<<<<< HEAD
		System.out.println("Panificadora Pão de Ontem - Tabela de preçosaaaa");
//		Double preco = 0.18d;
		BigDecimal preco = new BigDecimal("0.18");
		for (Double i = 1d; i <= 50; i++) {
			System.out.println(i + " - R$ " + (preco.multiply(new BigDecimal(i))));
=======
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (i * 0.18));
>>>>>>> adc920336f0fdddf4cca6ef9c5e11154ae9d6ea2
		}

	}

}
