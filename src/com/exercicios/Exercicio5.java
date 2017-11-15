package com.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor em metros: ");
		double metroUsuario = scan.nextDouble();
		
		double centimetroConvertido = metroUsuario * 100;
		
		System.out.print("O valor em centímetros é: " + centimetroConvertido);

	}

}
