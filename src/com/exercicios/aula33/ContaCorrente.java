package com.exercicios.aula33;

public class ContaCorrente {
	private String numero;
	private String status;
	private double saldo;
	private double limite;
	
	public ContaCorrente() {
		this.numero = "0000-0";
		this.status = "Normal";
		this.saldo = 0.0;  
		this.limite = 0.0;
	}
	
	public ContaCorrente(String numero, String status, double saldo, double limite) {
		this.numero = numero;
		this.status = status;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void sacarDinheiro(double qtdSaque) {
		if (this.checaSaldo() && qtdSaque <= this.checaLimiteSaque()) {
			this.saldo -= qtdSaque;
			System.out.println("Efetuando Saque!");
			if (this.checaChequeEspecial()) {
				this.printaAvisoChequeEspecial();
			}
		} else {
			System.out.println("Saldo Insuficiente!");
		}
	}	
	private boolean checaSaldo() {
		double saldoMaisLimite = this.saldo - this.limite;
		if (saldoMaisLimite < (this.limite * -1)) {
			return false;
		} else {
			return true;
		}
	}	
	private double checaLimiteSaque() {
		if (this.saldo + this.limite > 0.0) {
			return this.saldo + this.limite;
		} else {
			return 0.0;
		}
	}
	private boolean checaChequeEspecial() {
		if (this.saldo < 0.0) {
			return true;
		} else {
			return false;
		}
	}
	private void printaAvisoChequeEspecial() {
		System.out.println("ATENCAO!!!");
		System.out.println("Voce esta utilizando o cheque especial!!!");
	}
	public void printaInfo() {
		System.out.println();
		System.out.println("numero: " + this.numero);
		System.out.println("staus: " + this.status);
		System.out.println("saldo: " + this.saldo);
		System.out.println("limite: " + this.limite);
		if (this.checaChequeEspecial()) {
			this.printaAvisoChequeEspecial();
		}
		System.out.println();
	}
	
	
}
