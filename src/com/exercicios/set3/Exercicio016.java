package com.exercicios.set3;

public class Exercicio016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;

		System.out.println(n1);
		System.out.println(n2);
		
		while(n3 < 500) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);			
		}

	}

}
