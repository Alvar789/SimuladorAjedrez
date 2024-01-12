package controlador;

import modelo.Pieza;

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
	
	public Pieza[][] moverPiezaProvisional(char filaInicial, int columnaInicial) {
		Traductor tr = new Traductor();
		String piezaSeleccionada;
		int[] cooredenadasFinales;
		int fila;
		for (char f = 'a'; f < 'i'; f++) {
			for (int columna = 0; columna < tablero.length; columna++) {
				fila = tr.charToInt(f);
				if(filaInicial == f && columnaInicial == columna) {
					//Sutituir 'f' y 1 por los valores del fichero de jugadas
					cooredenadasFinales = tablero[fila][columna].mover('f', 1);
					if(cooredenadasFinales == null) {
						System.err.println("Jugada no valida");
						return tablero;
					}
					piezaSeleccionada = tablero[fila][columna].getPieza();
					tablero[fila][columna].setPieza("_");
					tablero[cooredenadasFinales[0]][cooredenadasFinales[1]].setPieza(piezaSeleccionada);
				}
			}
		}
		return tablero;
	}
}
