package com.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite quanto voc� ganha por hora: ");
		double salarioUser = scan.nextDouble();
		
		double salarioUserMes = salarioUser * 8 * 22;
		
		System.out.print("Seu sal�rio bruto por m�s �: " + salarioUserMes);

	}

}
