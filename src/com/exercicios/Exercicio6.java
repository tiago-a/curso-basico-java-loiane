package com.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio da circunfer�ncia: ");
		double raioUsuario = scan.nextDouble();
		
		double areaCircunferencia = Math.PI * raioUsuario * raioUsuario;
		
		System.out.print("A �rea da circunfer�ncia �: " + areaCircunferencia + "m�");

	}

}
