package com.exercicios.aula34;

public class ConversaoDeUnidadesDeTempo {
	public static void minutosToSegundos(double minutos) {
		System.out.println(minutos + " minutos sao " + (minutos * 60) + " segundos.");
	}
	public static void horasToMinutos(double horas) {
		System.out.println(horas + " horas sao " + (horas * 60) + " minutos.");
	}
	public static void diasToHoras(double dias) {
		System.out.println(dias + " dias sao " + (dias * 24) + " horas.");
	}
	public static void semanasToDias(double semanas) {
		System.out.println(semanas + " semanas sao " + (semanas * 7) + " dias.");
	}
	public static void mesesToDias(double meses) {
		System.out.println(meses + " meses sao " + (meses * 30) + " dias.");
	}
	public static void anosToDias(double anos) {
		System.out.println(anos + " anos sao " + (anos * 365.25) + " dias.");
	}
}
