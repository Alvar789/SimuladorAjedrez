package controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Alfil;
import modelo.Peon;
import modelo.Pieza;
import modelo.Tablero;
import vista.Consola;

public class PrincipalAjedrez {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tablero tablero = new Tablero();
		GestorMoviminetos gm = new GestorMoviminetos(tablero);
		Consola c = new Consola();
		c.mostrarTablero(tablero.getTablero());
		scanner.next();
		c.mostrarTablero(gm.moverPieza("", 'e', 2));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("", 'd', 3));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("", 'd', 3));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("O-O", 'o', -1));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("O-O-O", 'o', -1));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("", 'c', 5));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("", 'e', 3));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("", 'd', 6));
		
	}
}
