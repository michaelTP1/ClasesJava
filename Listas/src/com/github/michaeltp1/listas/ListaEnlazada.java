package com.github.michaeltp1.listas;

import java.util.AbstractList;

public class ListaEnlazada<E> extends AbstractList<E> implements Iterable<E> {
	/**
	 * Objeto nodo que almacena los datos de nuestra lista y contiene una referencia al siguiente
	 * 
	 * @author Michael
	 *
	 */
	protected class Nodo{
		E dato;
		Nodo next;
		public Nodo() {
			
		}
		public Nodo(E dato) {
			this.dato=dato;
		}
	}
	
	protected Nodo inicio=new Nodo();
	protected int size=0;

	
	@Override
	public void add(int index, E element) {
		if(index<0|| index>size)
			throw new ListaEnlazadaOutOFBoundsException();
		
		Nodo nodoActual=inicio;
		Nodo nuevoNodo=new Nodo(element);
		
		while(index>0) {
			nodoActual=nodoActual.next;
			index--;
			}
		
		
		
		nuevoNodo.next=nodoActual.next;
		nodoActual.next=nuevoNodo;
		size++;
	}
	
	
	
	@Override
	public boolean add(E e) {
		add(size,e);
		return true;
	}
	
	
	@Override
	public E remove(int index) {
		if(index<0|| index>size)
			throw new ListaEnlazadaOutOFBoundsException();
		
		Nodo nodoActual;
		E dato;
		
		nodoActual=inicio;
		
		while(index>0) {
			nodoActual=nodoActual.next;
			index--;
			}
		dato=nodoActual.next.dato;
		nodoActual.next=nodoActual.next.next;
		
		size--;
		
		return dato;
		
		
		
	}
	
	@Override
	public E get(int index) {
		if(index<0|| index>size)
			throw new ListaEnlazadaOutOFBoundsException();
		
		Nodo nodoActual=inicio;
		E dato;
		
		while(index>0) {
			nodoActual=nodoActual.next;
			index--;
			}
		dato=nodoActual.next.dato;
		return dato;
	}

	@Override
	public int size() {
		return size;
	}
	
	
	@Override
	public boolean equals(Object o) {
		
		
		if(o==this)
			return true;
		if(!(o instanceof ListaEnlazada))
			return false;
		
		ListaEnlazada<E> listaAComprobar=(ListaEnlazada<E>)o;
		
		if(this.size!=listaAComprobar.size)
			return false;
		
		Nodo nodoActual=inicio.next;
		Nodo nodoActualListaAComprobar=listaAComprobar.inicio.next;
		
		while(nodoActual!=null&&nodoActual.dato.equals(nodoActualListaAComprobar.dato)) {
			nodoActual=nodoActual.next;
			nodoActualListaAComprobar=nodoActualListaAComprobar.next;
		}
		
		return nodoActual==null;
	}
	

}
