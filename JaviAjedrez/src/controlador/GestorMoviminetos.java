package controlador;

import modelo.Pieza;
import modelo.Vacio;

public class GestorMoviminetos {
	private Pieza[][] tablero;
	public GestorMoviminetos(Pieza[][] tablero) {
		this.tablero = tablero;
	}
	public Pieza[][] getTablero() {
		return tablero;
	}
	public void setTablero(Pieza[][] tablero) {
		this.tablero = tablero;
	}
	
	public Pieza[][] moverPiezaProvisional(char filaInicial, int columnaInicial, char filaFinal, int columnaFinal) {
		Traductor tr = new Traductor();
		String piezaSeleccionada;
//		int[] cooredenadasFinales;
		Pieza piezaAMover;
		int fila;
		for (char f = 'a'; f < 'i'; f++) {
			for (int columna = 0; columna < tablero.length; columna++) {
				fila = tr.charToInt(f);
				if(filaInicial == f && columnaInicial == columna) {
					//Sutituir 'f' y 1 por los valores del fichero de jugadas
//					cooredenadasFinales = tablero[fila][columna].mover(filaFinal, columnaFinal);
					piezaAMover = tablero[fila][columna].mover(filaFinal, columnaFinal);
					if(piezaAMover == null) {
						System.err.println("Jugada no valida");
						return tablero;
					}
//					piezaSeleccionada = tablero[fila][columna].getPieza();
//					tablero[fila][columna].setPieza("_");
//					tablero[cooredenadasFinales[0]][cooredenadasFinales[1]].setPieza(piezaSeleccionada);
					tablero[fila][columna] = new Vacio("_", fila, columna);
					tablero[piezaAMover.getFila()][piezaAMover.getColumna()] = piezaAMover;
				}
			}
		}
		return tablero;
	}
}
