package controlador;

import modelo.Pieza;
import modelo.Vacio;

public class GestorMoviminetos {
	private boolean turno;
	private Pieza[][] tablero;
	public GestorMoviminetos(Pieza[][] tablero) {
		this.tablero = tablero;
		this.turno = true;
	}
	public Pieza[][] getTablero() {
		return tablero;
	}
	public void setTablero(Pieza[][] tablero) {
		this.tablero = tablero;
	}
	
	public Pieza[][] moverPiezaProvisional(char filaInicial, int columnaInicial, char filaFinal, int columnaFinal) {
		Traductor tr = new Traductor();
		Pieza piezaAMover;
		int fila;
		boolean puedeCapturar;
		for (char f = 'a'; f < 'i'; f++) {
			for (int columna = 0; columna < tablero.length; columna++) {
				fila = tr.charToInt(f);
				if(filaInicial == f && columnaInicial-1 == columna) {
					//Sutituir 'f' y 1 por los valores del fichero de jugadas
					puedeCapturar = !tablero[filaFinal][columnaFinal-1].getPieza().contains("_");
					piezaAMover = tablero[fila][columna].mover(filaFinal, columnaFinal-1, puedeCapturar);
					if(piezaAMover == null) {
						System.err.println("Jugada no valida");
						return tablero;
					}
					tablero[fila][columna] = new Vacio("_", fila, columna);
					tablero[piezaAMover.getFila()][piezaAMover.getColumna()] = piezaAMover;
				}
			}
		}
		return tablero;
	}
	
	public Pieza[][] moverPieza(String pieza, char filaFinal, int columnaFinal) {
		Traductor tr = new Traductor();
		Pieza piezaAMover;
		int fila, filaCapturar;
		boolean seMueve = false, puedeCapturar;
		String piezaMover = elegirPieza(pieza);
		System.out.println(piezaMover);
		for (char f = 'a'; f < 'i'; f++) {
			for (int columna = 0; columna < tablero.length; columna++) {
				fila = tr.charToInt(f);
				if(tablero[fila][columna].getPieza().equals(piezaMover)) {
					filaCapturar = tr.charToInt(filaFinal);
					puedeCapturar = !tablero[filaCapturar][columnaFinal-1].getPieza().contains("_");
					piezaAMover = tablero[fila][columna].mover(filaFinal, columnaFinal-1, puedeCapturar);
					if(piezaAMover != null) {
						tablero[fila][columna] = new Vacio("_", fila, columna);
						tablero[piezaAMover.getFila()][piezaAMover.getColumna()] = piezaAMover;
						seMueve = true;
						return tablero;
					}
					
				}
			}
		}
		if(!seMueve) {
			System.err.println("Jugada no valida");
		}
		return tablero;
	}
	private String elegirPieza(String pieza) {
		String piezaMover = pieza;
		if(pieza.isEmpty()) {
			pieza = "E";
			piezaMover = pieza;
		}
		if(!turno) {
			piezaMover = pieza.toLowerCase();
		}
		turno = !turno;
		System.out.println(piezaMover);
		return piezaMover;
	}
}
