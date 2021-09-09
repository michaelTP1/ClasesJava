package com.github.michaeltp1.objetos.prueba;

import com.github.michaeltp1.objetos.Equipo;
import com.github.michaeltp1.objetos.Jugador;

public class PruebaEquipos {

	public static void main(String[] args) {
		Jugador mbappe=new Jugador("Kylian","Mbappé" );
		Jugador cr7= new Jugador("Cristiano", "Ronaldo");
		
		Equipo madrid= new Equipo("Real Madrid", "Madrid");
		
		
		madrid.addJugador(cr7);		
		madrid.addJugador(mbappe);	
		madrid.addJugador(new Jugador("Vinicius", "Jr"));
		
		System.out.println(madrid.getJugadores().toString());
	}
}
