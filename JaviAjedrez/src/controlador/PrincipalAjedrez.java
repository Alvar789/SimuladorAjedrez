package controlador;

import java.io.File;
import java.util.Scanner;

import modelo.Tablero;
import vista.Consola;

public class PrincipalAjedrez {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tablero tablero = new Tablero();
		GestorMoviminetos gm = new GestorMoviminetos(tablero);
		Consola c = new Consola();
		String[] dirPartidas = new File("partidas").list();
		for (int i = 0; i < dirPartidas.length; i++) {
			if(new File("partidas/" + dirPartidas[i]).isFile()) {
				System.out.println(dirPartidas[i]);
			}
		}
		System.out.println("Introduce el numero de la partida");
		c.mostrarTablero(tablero.getTablero());	
		scanner.next();
		c.mostrarTablero(gm.moverPieza("N", 'f', 3));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("", 'd', 1));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("N", 'f', 8));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("", 'e', 1));
		scanner.next();
		c.mostrarTablero(gm.moverPieza("O-O-O", 'i', -1));
		
	}
}
