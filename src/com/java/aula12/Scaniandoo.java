package com.java.aula12;

import java.util.Scanner;

public class Scaniandoo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo e: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome e: " + primeiroNome);
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade e: " + idade);
		
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("A sua altura e: " + altura);
		
		System.out.println("Digite seu primeiro nome e altura");
		String pNome = scan.next();
		double xaltura = scan.nextDouble();
		
		System.out.println("Voce digitou o seguinte");
		System.out.println("Primeiro Nome: " + pNome);
		System.out.println("Sua Altura: " + xaltura);
		
	}

}