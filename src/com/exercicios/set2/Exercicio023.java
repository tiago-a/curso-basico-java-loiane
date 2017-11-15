package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio023 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean cartaoTabajara = false;
		
		System.out.println("É cliente Tabajara? S ou N.");
		String clienteTabajara = scan.next();
		if (clienteTabajara.equalsIgnoreCase("S")) {
			cartaoTabajara = true;
		}
		
		System.out.println("Escolha o tipo de carne, F (Filé Duplo), A (Alcatara), P (Picanha).");
		String escolha = scan.next();
		
		System.out.println("Digite a quantidade em kg: ");
		double quantidadeKg = scan.nextDouble();
		double quantidadeAcima = quantidadeKg - 5;
		
		double desconto = 0;
		
		double precoFile1 = 4.9;
		double precoFile2 = 5.8;
		
		double precoAlcatra1 = 5.9;
		double precoAlcatra2 = 6.8;
		
		double precoPicanha1 = 6.9;
		double precoPicanha2 = 7.8;
		
		double totalAPagar = 0;
		
		switch(escolha) {
		case "F":
			if (quantidadeAcima > 0) {
				totalAPagar = quantidadeAcima * precoFile2;
				totalAPagar = totalAPagar + ((quantidadeKg - quantidadeAcima) * precoFile1);
			} else {
				totalAPagar = quantidadeKg * precoFile1;
			}
			System.out.println("Você escolheu Filé Duplo.");
			break;
		case "A":
			if (quantidadeAcima > 0) {
				totalAPagar = quantidadeAcima * precoAlcatra2;
				totalAPagar = totalAPagar + ((quantidadeKg - quantidadeAcima) * precoAlcatra1);
			} else {
				totalAPagar = quantidadeKg * precoAlcatra1;
			}
			System.out.println("Você escolheu Alcatra.");
			break;
		case "P":
			if (quantidadeAcima > 0) {
				totalAPagar = quantidadeAcima * precoPicanha2;
				totalAPagar = totalAPagar + ((quantidadeKg - quantidadeAcima) * precoPicanha1);
			} else {
				totalAPagar = quantidadeKg * precoPicanha1;
			}
			System.out.println("Você escolheu Picanha.");
			break;
		default:
			System.out.println("Opção Inválida.");
			break;
		}
		
		if (cartaoTabajara) {
			desconto = totalAPagar * 0.1;
			totalAPagar = totalAPagar - desconto;
			System.out.println("É cliente Tabajara.");
			System.out.println("O desconto é de: " + desconto);
		}
		System.out.println("Preço total a pagar: " + totalAPagar);

	}

}
