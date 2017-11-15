package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int qtdItem = 0;
		
		double preco100 = 1.2;
		double preco101 = 1.3;
		double preco102 = 1.5;
		double preco103 = 1.2;
		double preco104 = 1.3;
		double preco105 = 1;
		
		double precoPedido = 0;
		double precoTotal = 0;
		int codigoItem = 0;
		
		System.out.println("Especificação\t\tCódigo\t\tPreço");
		System.out.println("Cachorro Quente\t\t100\t\tR$ 1,20");
		System.out.println("Bauru Simples\t\t101\t\tR$ 1,30");
		System.out.println("Bauru com Ovo\t\t102\t\tR$ 1,50");
		System.out.println("Hambúrguer\t\t103\t\tR$ 1,20");
		System.out.println("Cheeseburguer\t\t104\t\tR$ 1,30");
		System.out.println("Refrigerante\t\t105\t\tR$ 1,00\n");
		
		while(codigoItem != -1) {
			qtdItem = 0;
			System.out.println("Digite o código do item(Digite -1 para sair ou encerrar o pedido): ");
			codigoItem = scan.nextInt();
			if (codigoItem != -1) {
			System.out.println("Digite a quantidade: ");
			qtdItem = scan.nextInt();
			}
			
			if(codigoItem == 100) {
				precoPedido = preco100 * qtdItem;		
			} else if (codigoItem == 101) {
				precoPedido = preco101 * qtdItem;								
			} else if (codigoItem == 102) {
				precoPedido = preco102 * qtdItem;
			} else if (codigoItem == 103) {
				precoPedido = preco103 * qtdItem;
			} else if (codigoItem == 104) {
				precoPedido = preco104 * qtdItem;
			} else if (codigoItem == 105) {
				precoPedido = preco105 * qtdItem;
			} else if (codigoItem == -1){
				System.out.println("Pedido finalizado.");
			} else {
				System.out.println("Código Inválido.");
			}
			precoTotal = precoTotal + precoPedido;
			precoPedido = 0;
		}
		System.out.println("Preço Total R$: " + precoTotal);

	}

}
