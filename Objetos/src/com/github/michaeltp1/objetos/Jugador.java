package com.github.michaeltp1.objetos;

public class Jugador {

	private String nombre, apellidos;
	private Double altura, peso;
	private int edad;
	 private static TCosa cosa;
	public static void main(String[] args) {
		cosa=TCosa.dfgfdgd;
	}
	
	public Jugador(String nombre, String apellido) {
		setNombre(nombre);
		setApellidos(apellido);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return nombre+" "+apellidos;
	}
}
