package com.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio da circunferência: ");
		double raioUsuario = scan.nextDouble();
		
		double areaCircunferencia = Math.PI * raioUsuario * raioUsuario;
		
		System.out.print("A área da circunferência é: " + areaCircunferencia + "m²");

	}

}
