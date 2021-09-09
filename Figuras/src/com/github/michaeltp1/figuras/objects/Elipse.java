package com.github.michaeltp1.figuras.objects;


public class Elipse extends Figura {
	float r1, r2;
	public float getRadioMayor() {
		return r1>=r2?r1:r2;
	}

	public float getRadioMenor() {
		return r1<r2 ? r1:r2;
		
	}

	public Elipse( float r1, float r2) {
		
		if(r2 <= 0 | r1 <=0)
			throw new IllegalArgumentException();
		this.r1=r2;
		this.r2=r1;
	}
	@Override
	public float area() {
		return (float)(Math.PI*r1*r2) ;
	}
	@Override
	public float perimetro() {
		return (float)(2*Math.PI*Math.sqrt((r1*r1+r2*r2)/2)) ;
	}

	@Override
	public Figura clonar() {
		// TODO Auto-generated method stub
		return null;
	}

}
