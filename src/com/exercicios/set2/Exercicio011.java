package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu sal�rio(R$): ");
		double salarioUser = scan.nextDouble();
		
		double taxaAumento = 0;
		double aumento = 0;
		double novoSalarioUser = 0;
		
		if ( salarioUser > 0 && salarioUser <= 280 ) {
			taxaAumento = .2;
			aumento = salarioUser * taxaAumento;
			novoSalarioUser = salarioUser + aumento;
			System.out.println("Voc� ter� um aumento de 20%");
			System.out.println("Voc� receber� um aumento de: " + aumento);
			System.out.println("Sal�rio anterior: " + salarioUser + " novo sal�rio: " + novoSalarioUser);
		} else if ( salarioUser > 280 && salarioUser <= 700 ) {
			taxaAumento = .15;
			aumento = salarioUser * taxaAumento;
			novoSalarioUser = salarioUser + aumento;
			System.out.println("Voc� ter� um aumento de 15%");
			System.out.println("Voc� receber� um aumento de: " + aumento);
			System.out.println("Sal�rio anterior: " + salarioUser + " novo sal�rio: " + novoSalarioUser);
		} else if ( salarioUser > 700 && salarioUser <= 1500) {
			taxaAumento = .1;
			aumento = salarioUser * taxaAumento;
			novoSalarioUser = salarioUser + aumento;
			System.out.println("Voc� ter� um aumento de 10%");
			System.out.println("Voc� receber� um aumento de: " + aumento);
			System.out.println("Sal�rio anterior: " + salarioUser + " novo sal�rio: " + novoSalarioUser);
		} else if ( salarioUser > 1500) {
			taxaAumento = .05;
			aumento = salarioUser * taxaAumento;
			novoSalarioUser = salarioUser + aumento;
			System.out.println("Voc� ter� um aumento de 5%");
			System.out.println("Voc� receber� um aumento de: " + aumento);
			System.out.println("Sal�rio anterior: " + salarioUser + " novo sal�rio: " + novoSalarioUser);
		} 
		else {
			System.out.println("Sal�rio inv�lido.");
		}

	}

}
