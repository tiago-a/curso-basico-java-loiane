package com.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double primeiraNota = scan.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double segundaNota = scan.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double terceiraNota = scan.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double quartaNota = scan.nextDouble();
		
		double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		
		System.out.println("A sua média nesse bimestre é: " + media);

	}

}
