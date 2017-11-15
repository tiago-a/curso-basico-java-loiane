package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio021 {

	public static void main(String[] args) {
		
		boolean continua = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha G para gasolina ou A para álcool.");
		String escolhaCombustivel = scan.next();
		
		System.out.println("Quantos litros foram vendidos?");
		double litrosCombustivel = scan.nextDouble();

		double valorIntegral = 0;
		double desconto = 0;
		double valorAPagar = 0;
		
		double precoAlcool = 1.9;
		double descontoAlcool1 = 0.03;
		double descontoAlcool2 = 0.05;
		
		double precoGasolina = 2.5;
		double descontoGasolina1 = 0.04;
		double descontoGasolina2 = 0.06;
		
		if (escolhaCombustivel.equalsIgnoreCase("G")) {
			valorIntegral = litrosCombustivel * precoGasolina;
			if (litrosCombustivel > 0 || litrosCombustivel <= 20) {
				desconto = valorIntegral * descontoGasolina1;
				valorAPagar = valorIntegral - desconto;
			} else {
				desconto = valorIntegral * descontoGasolina2;
				valorAPagar = valorIntegral - desconto;
			}
		} else if (escolhaCombustivel.equalsIgnoreCase("A")) {
			valorIntegral = litrosCombustivel * precoAlcool;
			if (litrosCombustivel > 0 || litrosCombustivel <= 20) {
				desconto = valorIntegral * descontoAlcool1;
				valorAPagar = valorIntegral - desconto;
			} else {
				desconto = valorIntegral * descontoAlcool2;
				valorAPagar = valorIntegral - desconto;
			}
		} else {
			System.out.println("Opção Inválida.");
			continua = false;
		}
		
		if (continua) {
			System.out.println("O valor integral é: " + valorIntegral);
			System.out.println("O desconto é: " + desconto);
			System.out.println("O valor a ser pago é: " + valorAPagar);
		}
		
		

	}

}
