package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua hora (R$): ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha por mês: ");
		double quantidadeHora = scan.nextDouble();
		
		double salarioBruto = valorHora * quantidadeHora;
		
		double taxaIR = 0;
		double taxaSind = 0.03;
		double taxaINSS = 0.1;
		double taxaFGTS = 0.11;
		
		double descontoIR = 0;
		double descontoSind = salarioBruto * taxaSind;
		double descontoINSS = salarioBruto * taxaINSS;
		
		double contribuicaoFGTS = salarioBruto * taxaFGTS;
		
		double totalDescontos = 0;
		double salarioLiquido = 0;
		
		if ( salarioBruto > 0 && salarioBruto <= 900 ) {
			totalDescontos = descontoINSS + descontoIR + descontoSind;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salário bruto: " + "(" + valorHora + " * " + quantidadeHora + ")\t: R$ " + salarioBruto);
			System.out.println("(-) Sindicato (3%)\t\t: R$ " + descontoSind);
			System.out.println("(-) INSS (10%)\t\t\t: R$ " + descontoINSS);
			System.out.println("Isento de IR.");
			System.out.println("FGTS (11%)\t\t\t: R$ " + contribuicaoFGTS);
			System.out.println("Total Descontos\t\t\t: R$ " + totalDescontos);
			System.out.println("Salário líquido\t\t\t: R$ " + salarioLiquido);
			
		} else if ( salarioBruto > 900 && salarioBruto <= 1500) {
			taxaIR = 0.05;
			descontoIR = salarioBruto * taxaIR;
			totalDescontos = descontoINSS + descontoIR + descontoSind;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salário bruto: " + "(" + valorHora + " * " + quantidadeHora + ")\t: R$ " + salarioBruto);
			System.out.println("(-) Sindicato (3%)\t\t: R$ " + descontoSind);
			System.out.println("(-) IR (5%)\t\t\t: R$ " + descontoIR);
			System.out.println("(-) INSS (10%)\t\t\t: R$ " + descontoINSS);
			System.out.println("FGTS (11%)\t\t\t: R$ " + contribuicaoFGTS);
			System.out.println("Total Descontos\t\t\t: R$ " + totalDescontos);
			System.out.println("Salário líquido\t\t\t: R$ " + salarioLiquido);
		} else if ( salarioBruto > 1500 && salarioBruto <= 2500) {
			taxaIR = 0.1;
			descontoIR = salarioBruto * taxaIR;
			totalDescontos = descontoINSS + descontoIR + descontoSind;
			salarioLiquido = salarioBruto - totalDescontos; 
			System.out.println("Salário bruto: " + "(" + valorHora + " * " + quantidadeHora + ")\t: R$ " + salarioBruto);
			System.out.println("(-) Sindicato (3%)\t\t: R$ " + descontoSind);
			System.out.println("(-) IR (10%)\t\t\t: R$ " + descontoIR);
			System.out.println("(-) INSS (10%)\t\t\t: R$ " + descontoINSS);
			System.out.println("FGTS (11%)\t\t\t: R$ " + contribuicaoFGTS);
			System.out.println("Total Descontos\t\t\t: R$ " + totalDescontos);
			System.out.println("Salário líquido\t\t\t: R$ " + salarioLiquido);
		} else if ( salarioBruto > 2500) {
			taxaIR = 0.2;
			descontoIR = salarioBruto * taxaIR;
			totalDescontos = descontoINSS + descontoIR + descontoSind;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salário bruto: " + "(" + valorHora + " * " + quantidadeHora + ")\t: R$ " + salarioBruto);
			System.out.println("(-) Sindicato (3%)\t\t: R$ " + descontoSind);
			System.out.println("(-) IR (20%)\t\t\t: R$ " + descontoIR);
			System.out.println("(-) INSS (10%)\t\t\t: R$ " + descontoINSS);
			System.out.println("FGTS (11%)\t\t\t: R$ " + contribuicaoFGTS);
			System.out.println("Total Descontos\t\t\t: R$ " + totalDescontos);
			System.out.println("Salário líquido\t\t\t: R$ " + salarioLiquido);
		} else {
			System.out.println("Salário Inválido.");
		}

	}

}
