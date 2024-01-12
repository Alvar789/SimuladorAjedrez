package modelo;

import controlador.Traductor;

public class Vacio extends Pieza{
	public Vacio(String pieza, int fila, int columna) {
		super(pieza, fila, columna);
	}
	@Override
	public int[] mover(char fila, int columna) {
		System.out.println("Aqui, aqui, aqui, aqui no hay quien viva");
		return null;
	}
}
