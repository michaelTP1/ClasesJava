package com.github.michaeltp1.figuras.objects;



public class TrianguloEq extends Figura {
	private float lado;
	public TrianguloEq(float l) {
		if(l<=0)
			throw new IllegalArgumentException();
		lado = l;
	}
	
	@Override
	public float area() {
		return (float)(lado*lado*Math.sqrt(3)/4);
	}
	@Override
	public float perimetro() {
		return 3*lado;
	}

	@Override
	public Figura clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
