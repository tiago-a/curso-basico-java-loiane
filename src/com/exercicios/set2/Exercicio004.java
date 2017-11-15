package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		char letraUser = scan.next().charAt(0);
		
		if (letraUser >= 65 && letraUser <= 90) {
			System.out.println("A letra " + letraUser + " é MAIÚSCULA.");
		} else if (letraUser >= 97 && letraUser <= 122) {
			System.out.println("A letra " + letraUser + " é minúscula.");
		} else {
			System.out.println("Letra Inválida.");
		}

	}

}
