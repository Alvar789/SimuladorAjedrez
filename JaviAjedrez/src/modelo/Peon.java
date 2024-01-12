package modelo;

import controlador.Traductor;

public class Peon extends Pieza{

	public Peon(String pieza,  boolean isBlanca, int fila, int columna) {
		super(pieza, isBlanca, fila, columna);
	}

	@Override
	public int[] mover(char fila, int columna) {
		//TODO Gestionar capturar en diagonal
		Traductor traductor = new Traductor();
		int[] coordenadas = new int[2];
		System.out.println("Estoy moviendo un peon");
		int filaInt = traductor.charToInt(fila);
		if(((super.getFila() + 1) == filaInt && (super.getColumna() + 1) == columna) || ((super.getFila() + 2) == filaInt && (super.getColumna() + 2) == columna)) {
			super.setFila(filaInt);
			super.setColumna(columna);
			coordenadas[0] = super.getFila();
			coordenadas[1] = super.getColumna();
			return coordenadas;
		}
		return null;
	}

}
