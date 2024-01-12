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
		GestorMoviminetos gm = new GestorMoviminetos(tablero.getTablero());
		Consola c = new Consola();
		c.mostrarTablero(tablero.getTablero());
		scanner.next();
		c.mostrarTablero(gm.moverPiezaProvisional('h', 6, 'f', 1));
		
		
		
//		ArrayList<Pieza> arrLPiezas = new ArrayList<>();
//		arrLPiezas.add(new Peon("E"));
//		arrLPiezas.add(new Alfil("B"));
//		for (Pieza pieza : arrLPiezas) {
//			pieza.mover();
//		}
	}
}
