package com.exercicios.aula46;

public class Ex01 {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.setRaio(1.0);
//		c1.calcularArea();
		
		Quadrado q1 = new Quadrado();
		q1.setAresta(4.0);
//		q1.calcularArea();
		
		Triangulo t1 = new Triangulo();
		t1.setAltura(3.0);
		t1.setBase(2.0);
//		t1.calcularArea();
		
		Cilindro c2 = new Cilindro();
		c2.setAltura(5.0);
		c2.setRaio(2.0);
//		c2.calcularVolume();
		
		Cubo c3 = new Cubo();
		c3.setAresta(5.0);
//		c3.calcularVolume();
		FiguraGeometrica[] fg = new FiguraGeometrica[5];
		fg[0] = c1;
		fg[1] = q1;
		fg[2] = t1;
		fg[3] = c2;
		fg[4] = c3;
		
		
		for (FiguraGeometrica f : fg) {
			if (f instanceof Figura2D) {
				((Figura2D) f).calcularArea();
			}
			if (f instanceof Figura3D) {
				((Figura3D) f).calcularVolume();
			}
		}
	}

}
