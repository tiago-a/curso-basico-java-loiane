package com.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do arquivo para download em MB: ");
		double sizeFileMB = scan.nextDouble();
		
		System.out.print("Digite a velocidade do link de Internet em Mbps: ");
		double speedInternetMbps = scan.nextDouble();
		
		double tempoDeDownloadMin = ((sizeFileMB * 8) / speedInternetMbps ) / 60;
		System.out.println("O tempo de download em minutos é: " + tempoDeDownloadMin);

	}

}
