package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o preço do primeiro produto: ");
		double primeiroProduto = scan.nextDouble();
		
		System.out.print("Digite o preço do segundo produto: ");
		double segundoProduto = scan.nextDouble();
		
		System.out.print("Digite o preço do terceiro produto: ");
		double terceiroProduto = scan.nextDouble();
		
		if ( primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto) {
			System.out.println("O primeiro produto é o mais barato de todos!");
		} else if ( segundoProduto < primeiroProduto && segundoProduto < terceiroProduto ) {
			System.out.println("O segundo produto é o mais barato de todos!");
		} else if ( terceiroProduto < primeiroProduto && terceiroProduto < segundoProduto ) {
			System.out.println("O terceiro produto é o mais barato de todos!");
		} else if ( primeiroProduto < segundoProduto && terceiroProduto == segundoProduto ) {
			System.out.println("O primeiro produto é o mais barato de todos!");
		} else if ( segundoProduto < primeiroProduto && terceiroProduto == primeiroProduto ) {
			System.out.println("O segundo produto é o mais barato de todos!");
		} else if ( terceiroProduto < segundoProduto && primeiroProduto == segundoProduto ) {
			System.out.println("O terceiro produto é o mais barato de todos!");
		} else {
			System.out.println("Os produtos tem o mesmo preço.");
		}

	}

}
