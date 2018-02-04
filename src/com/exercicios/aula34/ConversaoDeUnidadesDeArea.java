package com.exercicios.aula34;

public class ConversaoDeUnidadesDeArea {
	public static void m2ToPes2(double metros2) {
		System.out.println( metros2 + " metros quadrados sao " + (metros2*10.76) + " pes quadrados");
	}
	public static void pe2ToCm2(double pe2) {
		System.out.println( pe2 + " pes quadrados sao " + (pe2*929.0) + " metros quadrados");
	}
	public static void milha2ToAcres(double milha2) {
		System.out.println( milha2 + " milhas quadradas sao " + (milha2*640.0) + " acres.");
	}
	public static void acresToPes2(double acres) {
		System.out.println( acres + " acres sao " + (acres*43.560) + " pes quadrados.");
	}
}
