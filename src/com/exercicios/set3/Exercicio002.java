package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean nameEqualsPW = false;		
		do {
			
			System.out.print("Digite o nome do usuário: ");
			String userName = scan.nextLine();
			
			System.out.print("Digite a senha do usuário: ");
			String userPW = scan.nextLine();
			
			if(userName.equalsIgnoreCase(userPW)) {
				nameEqualsPW = true;
				System.out.println("A senha não poder ser igual ao nome do usuário, tente novamente\n");
			} else {
				nameEqualsPW = false;
			}
			
		}while(nameEqualsPW);
		

	}

}
