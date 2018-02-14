package com.exercicios.aula35;

public class Calculadora {
	public static void soma(int num1, int num2) {
		System.out.println("A soma de: " + num1 + " + " + num2 + " eh: " + (num1+num2));
	}
	public static void subtrair(int num1, int num2) {
		System.out.println("A subtracao de: " + num1 + " - " + num2 + " eh: " + (num1-num2));
	}
	public static void multiplicar(int num1, int num2) {
		System.out.println("A multiplicacao de: " + num1 + " * " + num2 + " eh: " + (num1*num2));
	}
	public static void dividir(int num1, int num2) {
		System.out.println("A divisao de: " + num1 + " / " + num2 + " eh: " + (num1/num2));
	}
	public static void fatorial(int num) {
		int resultado = 1;
		for(int i = num; i >= 1; i--) {
			resultado = resultado * i;
		}
		System.out.println("O fatorial de " + num + "! eh: " + resultado);
	}
	public static int fatorialRecursivo(int num) {
		if(num == 0) {
			return 1;
		}
		return num * fatorialRecursivo(num-1);
	}
	public static int fibonacciRecursivo(int posicao) {	
		if(posicao == 1) {
			return 0;
		} else if (posicao == 2) {
			return 1;
		} else if (posicao == 3) {
			return 1;
		}
		return fibonacciRecursivo(posicao-1) + fibonacciRecursivo(posicao-2);
	}
	public static int somatorioRecursivo(int n) {
		if (n <= 1) {
			return 1;
		}
		return n + somatorioRecursivo(n-1);
	}
}
