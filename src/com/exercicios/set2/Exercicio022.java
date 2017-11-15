package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio022 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto Kg de morango deseja comprar: ");
		double kgMorango = scan.nextDouble();
		
		System.out.println("Digite quanto Kg de maça deseja comprar: ");
		double kgMaca = scan.nextDouble();
		
		double precoMorango1 = 2.5;
		double precoMorango2 = 2.2;
		double totalMorangoDinheiro = 0;
		double pesoMorangoRestante = 0;
		
		double precoMaca1 = 1.8;
		double precoMaca2 = 1.5;
		double totalMacaDinheiro = 0;
		double pesoMacaRestante = 0;
		
		double descontoMaxPeso = 8;
		double descontoMaxDinheiro = 25;
		double descontoExtra = 0.1;
		
		double totalPagarBruto = 0;
		double totalPagarFinal = 0;
		
		if (kgMorango > 0 && kgMorango <= 5) {
			totalMorangoDinheiro = kgMorango * precoMorango1;
			totalPagarBruto = totalPagarBruto + totalMorangoDinheiro;
		} else {
			pesoMorangoRestante = kgMorango - 5;
			totalMorangoDinheiro = 5 * precoMorango1;
			totalMorangoDinheiro = totalMorangoDinheiro + (pesoMorangoRestante * precoMorango2);
			totalPagarBruto = totalPagarBruto + totalMorangoDinheiro; 
		}
		
		if (kgMaca > 0 && kgMaca <= 5) {
			totalMacaDinheiro = kgMaca * precoMaca1;
			totalPagarBruto = totalPagarBruto + totalMacaDinheiro;
		} else {
			pesoMacaRestante = kgMaca - 5;
			totalMacaDinheiro = 5 * precoMaca1;
			totalMacaDinheiro = totalMacaDinheiro + (pesoMacaRestante * precoMaca2);
			totalPagarBruto = totalPagarBruto + totalMacaDinheiro; 
		}
		
		if (totalPagarBruto > descontoMaxDinheiro || (kgMaca + kgMorango >= descontoMaxPeso)) {
			totalPagarFinal = totalPagarBruto - totalPagarBruto * descontoExtra;
		} else {
			totalPagarFinal = totalPagarBruto;
		}
		
		System.out.println("Você comprou " + kgMorango + " kg de Morango, em um total de : " + totalMorangoDinheiro);
		System.out.println("Você comprou " + kgMaca + " kg de Maça, em um total de : " + totalMacaDinheiro);
		System.out.println("O total a pagar sem desconto: " + totalPagarBruto);
		System.out.println("O total a pagar com desconto: " + totalPagarFinal);

	}

}