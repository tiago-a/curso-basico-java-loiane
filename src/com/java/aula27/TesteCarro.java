package com.java.aula27;

import com.java.aula27.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 8;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("Autonomia do carro �: " + autonomia);
		System.out.println("Autonomia do carro �: " + van.obterAutonomia());
		
		double qtdCombustivel10 = van.qtdCombustivel(10);
		double qtdCombustivel15 = van.qtdCombustivel(15);
		
		System.out.println("qtdCombustivel10: " + qtdCombustivel10);
		System.out.println("qtdCombustivel15: " + qtdCombustivel15);
	}

}
