package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma letra para seu sexo: ");
		String letraUser = scan.nextLine();
		
		if (letraUser.equals("M") || letraUser.equals("m")) {
			System.out.println("M - Masculino.");
		} else if (letraUser.equals("F") || letraUser.equals("f")) {
			System.out.println("F - Feminino.");
		} else {
			System.out.println("Sexo inválido.");
		}
		

	}

}
