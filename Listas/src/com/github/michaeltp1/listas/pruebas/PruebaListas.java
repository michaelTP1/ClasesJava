package com.github.michaeltp1.listas.pruebas;

import java.util.LinkedList;

import com.github.michaeltp1.listas.ListaEnlazada;

public class PruebaListas {
	
	
	public static void main(String[] args) {
		
		ListaEnlazada<Integer> miLista=new ListaEnlazada<Integer>();
		ListaEnlazada<Integer> miLista2=new ListaEnlazada<Integer>();
		
		miLista.add(3);
		miLista.add(5);
		miLista.add(34);
		miLista2.add(3);
		miLista2.add(5);
		miLista2.add(34);
		System.out.println(miLista.equals(miLista2));
		
		miLista.remove(1);
		
		System.out.println(miLista.equals(miLista2));
	}
}
