package com.exercicios.aula43;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
		
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void sacar(double quantidade) {
		if (this.temSaldoSuficiente(quantidade)) {
			this.saldo -= quantidade;
		} else {
			this.printSaldoInsuficiente();
		}
	}
	private boolean temSaldoSuficiente(double quantidade) {
		if (quantidade > this.saldo) {
			return false;
		} else {
			return true;
		}
	}
	protected void printSaldoInsuficiente() {
		System.out.println("Saldo Insuficiente.");
	}
	public void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	
}
