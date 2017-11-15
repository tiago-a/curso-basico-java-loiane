package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double media = 0;
		double soma = 0;
		double valorUser = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			valorUser = scan.nextDouble();
			media = media + (valorUser/5);
			soma = soma + valorUser;
		}
		System.out.println("A média dos números digitados é: " + media);
		System.out.println("A soma dos números digitados é: " + soma);

	}

}
