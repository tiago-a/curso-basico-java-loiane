package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio020 {

	public static void main(String[] args) {
		
		String resposta = " ";

		Scanner scan = new Scanner(System.in);
		System.out.println("Responda as perguntas com Sim ou Não.");
		
		int pontuacaoSuspeito = 0;
		
		System.out.println("Telefonou para a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("Sim")) {
			pontuacaoSuspeito++;
		} 
		
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("Sim")) {
			pontuacaoSuspeito++;
		}
		
		System.out.println("Mora perto da vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("Sim")) {
			pontuacaoSuspeito++;
		}
		
		System.out.println("Devia para a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("Sim")) {
			pontuacaoSuspeito++;
		}
		
		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("Sim")) {
			pontuacaoSuspeito++;
		}
		
		if (pontuacaoSuspeito == 2) {
			System.out.println("Entrevistado é considerado suspeito.");
		} else if (pontuacaoSuspeito == 3 || pontuacaoSuspeito == 4) {
			System.out.println("Entrevistado é considerado cúmplice.");
		} else if (pontuacaoSuspeito == 5) {
			System.out.println("Entrevistado é considerado assassino.");
		} else {
			System.out.println("Entrevistado é considerado inocente.");
		}

	}

}
