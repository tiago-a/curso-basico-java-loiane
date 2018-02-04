package com.exercicios.aula34;

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
}
