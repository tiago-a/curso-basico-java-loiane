package com.exercicios.aula43;

public class ContaEspecial extends ContaBancaria {
	private double limite;
	
	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double quantidade) {
		if(this.temSaldoSuficiente(quantidade)) {
			double saldo = super.getSaldo(); 
			saldo -= quantidade;
			super.setSaldo(saldo);
		} else {
			super.printSaldoInsuficiente();
		}
	}
	private boolean temSaldoSuficiente(double quantidade) {
		if (quantidade > this.somaSaldoLimite()) {
			return false;
		} else {
			return true;
		}
	}
	private double somaSaldoLimite() {
		return this.limite + super.getSaldo();
	}
	
	@Override
	public String toString() {
		return super.toString() + " ContaEspecial [limite=" + limite + "]";
	}
	
}
