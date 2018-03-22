package com.exercicios.aula43;

public class Ex03 {

	public static void main(String[] args) {
		Animal a1 = new Animal("Camelo", 150.0, 4, "Amarelo", "Terra", 2.0);
		System.out.println(a1.toString());
		
		String[] caracteristicas = {"Barbatanas", "cauda"};
		Peixe tubarao = new Peixe("Tubarão", 300.0, 0, "Cinzento", "Mar", 1.5, caracteristicas);
		System.out.println(tubarao.toString());
		
		Mamifero urso = new Mamifero("Urso-do-Canadá", 180.0, 4, "Vermelho", "Terra", 0.5, "Mel");
		System.out.println(urso.toString());
	}

}
