package com.github.michaeltp1.figuras.objects;

public class Circunferencia extends Elipse {

	public Circunferencia(int x, int y, float r) {
		super( r, r);
	}
	public float getRadio() {
		return super.getRadioMenor();
	}
}
