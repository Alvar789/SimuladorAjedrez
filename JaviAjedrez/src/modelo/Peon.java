package modelo;

import controlador.Traductor;

public class Peon extends Pieza{
	private boolean primerMovimiento;
	public Peon(String pieza,  boolean isBlanca, int fila, int columna) {
		super(pieza, isBlanca, fila, columna);
		this.primerMovimiento = true;
	}

	@Override
	public Pieza mover(char fila, int columna) {
		//TODO Gestionar capturar en diagonal
		Traductor traductor = new Traductor();
		System.out.println("Estoy moviendo un peon");
		int filaInt = traductor.charToInt(fila);
		boolean avanza1 = ((super.getFila() + 1) == filaInt && super.getColumna() == columna) || ((super.getFila() - 1) == filaInt && super.getColumna() == columna);
		boolean avanza2 = ((super.getFila() + 2) == filaInt && super.getColumna() == columna) || ((super.getFila() - 2) == filaInt && super.getColumna() == columna);
		if(avanza1 || (avanza2 && primerMovimiento)) {
			System.out.println("Se puede mover");
			primerMovimiento = false;
			super.setFila(filaInt);
			super.setColumna(columna);
			
			return this;
		}
		return null;
	}

}
