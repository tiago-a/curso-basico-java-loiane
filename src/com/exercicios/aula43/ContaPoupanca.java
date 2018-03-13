package com.exercicios.aula43;

public class ContaPoupanca extends ContaBancaria {
	private double diaRendimento;
	
	

	public ContaPoupanca(String nomeCliente, String numConta, double saldo, double diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento/100.0;
	}
	public double getDiaRendimento() {
		return diaRendimento;
	}
	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	@Override
	public String toString() {
		return super.toString() + " ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}
	public void calculaNovoSaldo() {
		double saldo = this.getSaldo();
		saldo = saldo + (saldo * this.diaRendimento);
		this.setSaldo(saldo);
	}
}
