package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		boolean loopNome = true;
		boolean loopIdade = true;
		boolean loopSalario = true;
		boolean loopSexo = true;
		boolean loopCivil = true;
		
		while(loopNome) {			
			System.out.println("Digite o nome:");
			String nomeUser = scan.nextLine();			
			if (nomeUser.length() > 3) {
				loopNome = false;
			} else {
				System.out.println("Nome menor que 3 caracteres, digite novamente.\n");
			}			
		}
		
		while(loopIdade) {
			System.out.println("Digite a Idade:");
			int idadeUser = scan.nextInt();
			if (idadeUser > 0 && idadeUser < 150) {
				loopIdade = false;
			} else {
				System.out.println("Idade menor que 0 ou maior que 150 anos, digite novamente.\n");
			}
		}
		
		while(loopSalario) {
			System.out.println("Digite o salário:");
			double salarioUsuario = scan.nextDouble();
			if (salarioUsuario > 0) {
				loopSalario = false;
			} else {
				System.out.println("Salário menor que 0, digite novamente.\n");
			}
		}
		
		while(loopSexo) {
			System.out.println("Digite o sexo (F ou M):");
			String sexoUsuario = scan.nextLine();
			if (sexoUsuario.equalsIgnoreCase("f") || sexoUsuario.equalsIgnoreCase("m")) {
				loopSexo = false;
			} else {
				System.out.println("Opção inválida, digite novamente.\n");
			}
		}
		
		while(loopCivil) {
			System.out.println("Digite o estado civil (S - Solteirx, C - Casadx, V - Viuvx, D - Divorciadx)");
			String civilUsuario = scan.nextLine();
			if (civilUsuario.equalsIgnoreCase("s") || civilUsuario.equalsIgnoreCase("c") || civilUsuario.equalsIgnoreCase("v") || civilUsuario.equalsIgnoreCase("d")) {
				loopCivil = false;
			} else {
				System.out.println("Opção inválida, digite novamente.\n");
			}
		}

	}

}

