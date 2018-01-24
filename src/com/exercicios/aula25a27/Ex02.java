package com.exercicios.aula25a27;

public class Ex02 {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		c1.limite = 800;
		c1.numero = "55.001-02";
		c1.saldo = 351.89;
		c1.status = "especial";
		
		c1.consultarSaldo();
		System.out.println();
		c1.fazerDeposito(400.0);
		System.out.println();
		c1.fazerSaque(287.1);
		System.out.println();
		c1.consultarSaldo();
		System.out.println();
		c1.fazerSaque(1000.0);
		System.out.println();
		c1.consultarSaldo();
	}

}
