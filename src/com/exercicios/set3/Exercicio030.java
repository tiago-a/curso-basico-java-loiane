package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int resultadoTabuada = 0;
		
		System.out.println("Digite o número para calcular a sua tabuada: ");
		int tabuadaUser = scan.nextInt();
		
		System.out.println("Digite o número o inicio do calculo da tabuada: ");
		int tabuadaInicio = scan.nextInt();
		
		System.out.println("Digite o número o fim do calculo da tabuada: ");
		int tabuadaFim = scan.nextInt();
		
		System.out.println("Montar a tabuada de: " + tabuadaUser);
		System.out.println("Começar por: " + tabuadaInicio);
		System.out.println("Terminar em: " + tabuadaFim);
		
		for (int i = tabuadaInicio; i <= tabuadaFim; i++) {
			resultadoTabuada = i * tabuadaUser;
			System.out.println(tabuadaUser + " X " + i + " = " + resultadoTabuada);
		}

	}

}
