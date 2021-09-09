package com.github.michaeltp1.figuras.objects;

import java.io.Serializable;

public class Rectangulo extends Figura{
	private float l1, l2;

	public Rectangulo(float l1, float l2) {
		if (l1 <= 0 | l2 <= 0)
			throw new IllegalArgumentException();
		this.l1 = l1;
		this.l2 = l2;
	}

	public float getL1() {
		return l1;
	}

	public void setL1(float l1) {
		this.l1 = l1;
	}

	public float getL2() {
		return l2;
	}

	public void setL2(float l2) {
		this.l2 = l2;
	}

	public float getLadoMayor() {
		return l1 >= l2 ? l1 : l2;
	}

	public float getLadoMenor() {
		return l1 < l2 ? l1 : l2;
	}

	@Override
	public float area() {
		return l1 * l2;
	}

	@Override
	public float perimetro() {
		return 2 * (l1 + l2);
	}

	@Override
	public String toString() {
		return "Rectagulo[, lado1:"+l1+", lado2:"+l2+"]";
	}

//	@Override
//	public Double getArea() {
//		return  (double) (l1 * l2);
//	}
//
//	@Override
//	public Double getPerimetro() {
//		return (double) (2 * (l1 + l2));
//	}



	@Override
	public Rectangulo clonar() {
		Rectangulo rectanguloCopia=new Rectangulo(l1,l2);
		return rectanguloCopia ;
	}
	
}
