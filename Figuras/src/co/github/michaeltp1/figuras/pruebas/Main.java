package co.github.michaeltp1.figuras.pruebas;

import com.github.michaeltp1.figuras.objects.Cuadrado;
import com.github.michaeltp1.figuras.objects.Elipse;
import com.github.michaeltp1.figuras.objects.Rectangulo;

public class Main {
	public static void main(String[] args) {
		
		Rectangulo rectangulo=new Rectangulo(-4,5);
		Rectangulo rectanguloCopia=rectangulo.clonar();
		System.out.println(rectangulo);
		System.out.println(rectanguloCopia);
		System.out.println();
		rectangulo.setL1(14);
		System.out.println(rectangulo);
		System.out.println(rectanguloCopia);
		
	}

	
}
