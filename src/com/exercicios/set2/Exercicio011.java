package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu salário(R$): ");
		double salarioUser = scan.nextDouble();
		
		double taxaAumento = 0;
		double aumento = 0;
		double novoSalarioUser = 0;
		
		if ( salarioUser > 0 && salarioUser <= 280 ) {
			taxaAumento = .2;
			aumento = salarioUser * taxaAumento;
			novoSalarioUser = salarioUser + aumento;
			System.out.println("Você terá um aumento de 20%");
			System.out.println("Você receberá um aumento de: " + aumento);
			System.out.println("Salário anterior: " + salarioUser + " novo salário: " + novoSalarioUser);
		} else if ( salarioUser > 280 && salarioUser <= 700 ) {
			taxaAumento = .15;
			aumento = salarioUser * taxaAumento;
			novoSalarioUser = salarioUser + aumento;
			System.out.println("Você terá um aumento de 15%");
			System.out.println("Você receberá um aumento de: " + aumento);
			System.out.println("Salário anterior: " + salarioUser + " novo salário: " + novoSalarioUser);
		} else if ( salarioUser > 700 && salarioUser <= 1500) {
			taxaAumento = .1;
			aumento = salarioUser * taxaAumento;
			novoSalarioUser = salarioUser + aumento;
			System.out.println("Você terá um aumento de 10%");
			System.out.println("Você receberá um aumento de: " + aumento);
			System.out.println("Salário anterior: " + salarioUser + " novo salário: " + novoSalarioUser);
		} else if ( salarioUser > 1500) {
			taxaAumento = .05;
			aumento = salarioUser * taxaAumento;
			novoSalarioUser = salarioUser + aumento;
			System.out.println("Você terá um aumento de 5%");
			System.out.println("Você receberá um aumento de: " + aumento);
			System.out.println("Salário anterior: " + salarioUser + " novo salário: " + novoSalarioUser);
		} 
		else {
			System.out.println("Salário inválido.");
		}

	}

}
