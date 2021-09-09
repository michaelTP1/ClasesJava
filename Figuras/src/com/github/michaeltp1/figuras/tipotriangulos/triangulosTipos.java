package com.github.michaeltp1.figuras.tipotriangulos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.github.michaeltp1.figuras.tipotriangulos.utils.TrianguloNoValidoExcepcion;

public class triangulosTipos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double lado1, lado2, lado3;

		String condicion = "";
		while (!condicion.equals("Si")) {
			try {
				System.out.println("Introduzca el primer lado");
				lado1=teclado.nextDouble();
				if(lado1<=0)
					throw new TrianguloNoValidoExcepcion();
				
				System.out.println("Introduzca el segundo lado");
				lado2=teclado.nextDouble();
				if(lado2<=0)
					throw new TrianguloNoValidoExcepcion();
				System.out.println("Introduzca el tercer lado");
				lado3=teclado.nextDouble();
				if (lado3<=0)
					throw new TrianguloNoValidoExcepcion();
				teclado.nextLine();
				System.out.println("Ya has introducido todos los triangulos");
				condicion = teclado.nextLine();
				System.out.println(condicion);
			}catch(TrianguloNoValidoExcepcion e) {
				e.printStackTrace();
				System.err.println("no introduzcas numeros negativos");

			} catch (IllegalArgumentException e) {
				System.err.println("datos no válidos");
				
			} catch(InputMismatchException e) {
				System.out.println("no ha introducido un numero");
				teclado.nextLine();
			}catch (Exception e) {
				
			}

		}
//		for (int i = 0; i < lado1.size(); i++) {
//
//			if (lado1.get(i) + lado2.get(i) <= lado3.get(i) || lado1.get(i) + lado3.get(i) <= lado2.get(i)
//					|| lado2.get(i) + lado3.get(i) <= lado1.get(i)) {
//				System.out.println("No es un triangulo");
//			} else {
//				if (lado1.get(i) == lado2.get(i) & lado2.get(i) == lado3.get(i)) {
//					System.out.println("El triangulo " + i + " es Equilatero");
//				} else if (lado1.get(i) == lado2.get(i) || lado1.get(i) == lado3.get(i)
//						|| lado2.get(i) == lado3.get(i)) {
//					System.out.println("El triangulo " + i + " es Iscoceles");
//				} else if (lado1.get(i) != lado2.get(i) || lado1.get(i) != lado3.get(i) || lado2.get(i) != lado3.get(i))
//					System.out.println("El triangulo " + i + " es escaleno");
//
//			}
//		}

	}

}
