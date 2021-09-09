package com.github.michaeltp1.figuras.objects;


public class Cuadrado extends Rectangulo {

	public Cuadrado(int lado) {
		super( lado, lado);
	}

	public float getLado() {
		return getLadoMenor();
	}

	
}
