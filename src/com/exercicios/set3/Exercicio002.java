package com.exercicios.set3;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean nameEqualsPW = false;		
		do {
			
			System.out.print("Digite o nome do usu�rio: ");
			String userName = scan.nextLine();
			
			System.out.print("Digite a senha do usu�rio: ");
			String userPW = scan.nextLine();
			
			if(userName.equalsIgnoreCase(userPW)) {
				nameEqualsPW = true;
				System.out.println("A senha n�o poder ser igual ao nome do usu�rio, tente novamente\n");
			} else {
				nameEqualsPW = false;
			}
			
		}while(nameEqualsPW);
		

	}

}
