package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anoAdmissao = 1995;
		double salarioInicial = 1000;
		double salarioAtual = 1000;
		double salario1996 = 0;
		double aumento1996 = 0.015;
//		double aumento1995 = 0.00;
		int anoAtual = 2017;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário do funcionário: ");
		salarioAtual = scan.nextDouble();
		salario1996 = salarioAtual;
		
		double aumentoAnoAnterior = 0.015;
		double aumentoAtual = 0.015;
		
		for (int i = anoAdmissao; i <= anoAtual; i++) {
			System.out.print("Ano: " + i + " ");
			if (i == 1995) {
//				System.out.println(aumento1995);
				System.out.println("Salário: " + salarioInicial);
			} else if (i == 1996){
//				System.out.println(aumento1996);
				salario1996 = salarioInicial + (salarioInicial * aumento1996);
				System.out.println("Salário: " + salario1996);
				salarioAtual = salario1996;
			}
			else {
				aumentoAtual = 2 * aumentoAnoAnterior;
				aumentoAnoAnterior = aumentoAtual;		
//				System.out.println(aumentoAtual);
				salarioAtual = salarioAtual + (salarioAtual * aumentoAtual);
				System.out.println("Salário atual: " + salarioAtual);
			}
			}
		

	}

}
