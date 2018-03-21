package com.exercicios.aula43;

public class PessoaFisica extends Contribuinte {
	public PessoaFisica(String nome, double renda) {
		super(nome, renda);
	}
	private double calculaImposto() {
		double renda = super.getRenda();
		
		if(renda <= 1400.0) {
			super.setTaxa(0.0);
			return 0.0;
		}
		else if(renda > 1400.0 && renda <= 2100.0) {
			super.setTaxa(0.1);
			return (renda * 0.1) - 100.0;
		}
		else if(renda > 2100.0 && renda <= 2800.0) {
			super.setTaxa(0.15);
			return (renda * 0.15) - 270.0;
		}
		else if(renda > 2800.0 && renda <= 3600.0) {
			super.setTaxa(0.25);
			return (renda * 0.25) - 500.0;
		}
		else {
			super.setTaxa(0.3);
			return (renda * 0.3) - 700.0;
		}
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
