package modelo;

import controlador.Traductor;

public class Rey extends Pieza{
	public Rey(String pieza,  boolean isBlanca, int fila, int columna) {
		super(pieza, isBlanca, fila, columna);
	}
	@Override
	public int[] mover(char fila, int columna) {
		//TODO Gestionar el movimiento
		Traductor traductor = new Traductor();
		int[] coordenadas = new int[2];
		System.out.println("Estoy moviendo un rey");
		super.setFila(traductor.charToInt(fila));
		super.setColumna(columna);
		coordenadas[0] = super.getFila();
		coordenadas[1] = super.getColumna();
		return coordenadas;
	}
}
