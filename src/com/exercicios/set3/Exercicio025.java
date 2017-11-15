package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double precoItem = 1;
		double soma = 0;
		int indexItem = 1;
		boolean fimCompra = false;
				
		while(true) {
			while(!fimCompra) {
				System.out.print("Produto " + indexItem + ": R$ ");
				precoItem = scan.nextDouble();
				if (precoItem == 0) {
					fimCompra = true;
				} else {
					soma = soma + precoItem;
					indexItem++;
				}
				
			}
			fimCompra = false;
			indexItem = 1;
			System.out.println("Total: R$ " + soma);
			System.out.print("Dinheiro: R$ ");
			double dinheiro = scan.nextDouble();
			System.out.println("Troco: R$ " + (dinheiro - soma));
		}

	}

}
