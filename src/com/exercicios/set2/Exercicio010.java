package com.exercicios.set2;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno voce estuda? (Digite M para matutino, V  para verpertino ou N para noturno.");
		char turnoUser = scan.nextLine().charAt(0);
		
		if ( turnoUser == 'M' || turnoUser == 'm' ) {
			System.out.println("Bom dia!");
		} else if ( turnoUser == 'V' || turnoUser == 'v' ) {
			System.out.println("Boa Tarde!");
		} else if ( turnoUser == 'N' || turnoUser == 'n' ) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Turno invalido!");
		}

	}

}
