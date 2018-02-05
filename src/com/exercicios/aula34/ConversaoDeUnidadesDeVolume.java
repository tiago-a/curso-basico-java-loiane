package com.exercicios.aula34;

public class ConversaoDeUnidadesDeVolume {
	public static void litrosToCm3(double litros) {
		System.out.println(litros + " litros sao " + (litros * 1000) + " centimetros cubicos.");
	}
	public static void metros3ToLitros(double metros3) {
		System.out.println(metros3 + " metros cubicos sao " + (metros3 * 1000) + " litros." );
	}
	public static void metros3ToPes3(double metros3) {
		System.out.println(metros3 + " metros cubicos sao " + (metros3 * 35.32) + " pes cubicos");
	}
	public static void galoesToPolegadas3(double galoes) {
		System.out.println(galoes + " galoes sao " + (galoes * 231) + " polegadas cubicas.");
	}
	public static void galoesToLitros(double galoes) {
		System.out.println(galoes + " galoes sao " + (galoes * 3.785) + " litros.");
	}
}
