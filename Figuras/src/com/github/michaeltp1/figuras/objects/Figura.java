package com.github.michaeltp1.figuras.objects;

import java.io.Serializable;

public abstract class Figura implements Cloneable {
	
	
	 abstract float area();
	 abstract float perimetro();
	 public abstract Figura clonar();
	
}
