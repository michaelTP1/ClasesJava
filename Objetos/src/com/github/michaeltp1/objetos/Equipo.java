package com.github.michaeltp1.objetos;

import java.util.ArrayList;

public class Equipo {

	private String nombre, localidad;
	private ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
	
	
	public Equipo(String nombre, String localidad) {
		this.nombre=nombre;
		this.localidad=localidad;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public String getLocalidad() {
		return localidad;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	/**
	 * Recibe un jugador por parametro y lo anade a nuestro array de jugadores
	 * @param jugador
	 */
	public void addJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
}
