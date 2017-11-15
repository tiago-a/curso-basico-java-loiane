package com.exercicios.set3;

<<<<<<< HEAD
=======
import java.util.Scanner;

>>>>>>> adc920336f0fdddf4cca6ef9c5e11154ae9d6ea2
public class Exercicio010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		for(int i = 0; i < 50; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
=======
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		
		for (int i = num1 + 1; i < num2 ; i++) {
			System.out.println(i);
		}
		
>>>>>>> adc920336f0fdddf4cca6ef9c5e11154ae9d6ea2

	}

}
