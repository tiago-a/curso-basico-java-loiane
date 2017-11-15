package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double maiorTemp = 0;
		double menorTemp = 0;
		double mediaTemp = 0;
		double userTemp = 0;
		int index = 0;
		
		while(userTemp >= 0) {
			index++;
			System.out.println("Digite uma temperatura");
			userTemp = scan.nextDouble();
			mediaTemp = mediaTemp + userTemp;
			if (userTemp >= maiorTemp) {
				maiorTemp = userTemp;
			}
			if (userTemp <= maiorTemp) {
				menorTemp = userTemp;
			}
		}
		mediaTemp = mediaTemp/index;
		System.out.println("Maior temperatura lida: " + maiorTemp);
		System.out.println("Menor temperatura lida: " + menorTemp);
		System.out.println("Média das temperaturas lida: " + mediaTemp);

	}

}
