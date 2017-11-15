package com.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite quanto você ganha por hora: ");
		double salarioUser = scan.nextDouble();
		
		System.out.print("Digite quantas horas você trabalha por mês: ");
		double horasUser = scan.nextDouble();
		
		double salarioBruto = salarioUser * horasUser;
		System.out.println("Seu salário bruto é: " + salarioBruto);
		
		double descontoIR = salarioBruto * 0.11;
		System.out.println("De IR você pagou: " + descontoIR);
		
		double descontoINSS = salarioBruto * 0.08;
		System.out.println("De INSS você pagou: " + descontoINSS);
		
		double descontoSind = salarioBruto * 0.05;
		System.out.println("Para o sindicato você pagou: " + descontoSind);
		
		double salarioLiquido = salarioBruto - (descontoIR + descontoINSS + descontoSind);
		System.out.print("Seu salário líquido é: " + salarioLiquido);

	}

}
