package vista;

import java.util.Iterator;

import controlador.Traductor;
import modelo.Pieza;

public class Consola {
	Traductor tr = new Traductor();
	public void mostrarTablero(Pieza[][] tablero) {
		for (int fila = 0; fila < tablero.length; fila++) {
			System.out.print(tr.intToChar(fila) + "   ");
			for (int columna = 0; columna < tablero.length; columna++) {
				System.out.print(tablero[fila][columna].getPieza() + " ");
			}
			System.out.println();
		}
		System.out.println("\n    1 2 3 4 5 6 7 8");
	}
}
