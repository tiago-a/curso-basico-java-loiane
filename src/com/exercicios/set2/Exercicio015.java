package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado de um triangulo: ");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite o segundo lado de um triangulo: ");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro lado de um triangulo: ");
		double lado3 = scan.nextDouble();
		
		double ladoMaior = 0;
		
		boolean podeSerTriangulo = false;
		
		if (lado1 > lado2 && lado2 >= lado3) {
			ladoMaior = lado1;
			if ( lado2 + lado3 > ladoMaior) podeSerTriangulo = true;
		} else if (lado1 > lado3 && lado3 >= lado2) {
			ladoMaior = lado1;
			if ( lado2 + lado3 > ladoMaior) podeSerTriangulo = true;
		} else if (lado2 > lado1 && lado1 >= lado3) {
			ladoMaior = lado2;
			if ( lado1 + lado3 > ladoMaior) podeSerTriangulo = true;
		} else if (lado2 > lado3 && lado3 >= lado1) {
			ladoMaior = lado2;
			if ( lado1 + lado3 > ladoMaior) podeSerTriangulo = true;
		} else if (lado3 > lado1 && lado1 >= lado2) {
			ladoMaior = lado3;
			if ( lado1 + lado2 > ladoMaior) podeSerTriangulo = true;
		} else if (lado3 > lado2 && lado2 >= lado1) {
			ladoMaior = lado3;
			if ( lado1 + lado2 > ladoMaior) podeSerTriangulo = true;
		} else {
			podeSerTriangulo = true;
		}
		
		if ( podeSerTriangulo == true) {
			
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Com esses lados é possível formar um trinângulo equilátero.");
			} else if ( lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Com esses lados é possível formar um trinângulo isósceles.");
			} else {
				System.out.println("Com esses lados é possível formar um trinângulo escaleno.");
			}
			
		} else {
			System.out.println("Esses 3 lados não formam um trinâgulo.");
		}
/*		System.out.println("Lado maior: " + ladoMaior);
		System.out.println("Lado1: " + lado1);
		System.out.println("Lado2: " + lado2);
		System.out.println("Lado3: " + lado3);
		System.out.println(podeSerTriangulo);*/

	}

}
