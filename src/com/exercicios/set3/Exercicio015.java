package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a n-esíma sequencia de fibonacci");
		int nesimo = scan.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;

		System.out.println(n1);
		System.out.println(n2);
		
		for (int i = 2; i < nesimo; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);			
		}

	}

}
