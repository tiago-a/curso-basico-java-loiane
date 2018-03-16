package com.exercicios.aula43;

public class PessoaJuridica extends Contribuinte {
	public static final double TAXA_IMPOSTO_RENDA = 0.1;
	
	public PessoaJuridica(String nome, double renda) {
		super(nome,TAXA_IMPOSTO_RENDA, renda);
	}
	private double calculaImposto() {
		super.setImposto(super.getRenda() * TAXA_IMPOSTO_RENDA);
		return super.getImposto();
	}
	private double calculaRendaLiquida() {
		double rendaLiquida = super.getRenda() - this.calculaImposto();
		return rendaLiquida;
	}
	public void imprimeRendas() {
		System.out.println("\nInformações do Contribuinte: " + super.getNome());
		System.out.println("Sua renda bruta é de: " + super.getRenda());
		System.out.println("Taxa de imposto: " + super.getTaxa());
		System.out.println("Total pago em imposto: " + super.getImposto());
		System.out.println("Sua renda líquida: " + this.calculaRendaLiquida());
	}
	
}
