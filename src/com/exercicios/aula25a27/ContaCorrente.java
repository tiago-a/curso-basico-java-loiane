package com.exercicios.aula25a27;

public class ContaCorrente {
	String numero;
	String status;
	double saldo;
	double limite;
	
	void fazerSaque(double valorSaque) {
		System.out.println("Entrando no metodo fazerSaque!");
		if (saldo - valorSaque < (-1*limite)) {
			System.out.println("Saldo insuficiente.");
		} else {
			System.out.println("Saldo antes do saque: " + saldo);
			saldo = saldo - valorSaque;
			System.out.println("Saldo depois do saque: " + saldo);
		}
	}
	
	void fazerDeposito(double valorDeposito) {
		System.out.println("Entrando no metodo fazerDeposito!");
		System.out.println("Saldo antes do deposito: " + saldo);
		saldo = saldo + valorDeposito;
		System.out.println("Saldo depois do deposito: " + saldo);
	}
	
	void consultarSaldo() {
		System.out.println("O saldo da sua conta e: " + saldo);
		if (saldo < 0) {
			System.out.println("Voce esta utilizando o cheque especial!");
		}
	}
}
