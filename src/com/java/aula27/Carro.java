package com.java.aula27;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		System.out.println("Método obter autonomia chamado!");
		return capCombustivel * consumoCombustivel;
	}
	
	double qtdCombustivel(double km) {
		double qtdCombutivel = km/consumoCombustivel;
		return qtdCombutivel;
	}
}