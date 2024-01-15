package modelo;

import java.util.ArrayList;

public class Partida {
	private ArrayList<String> movimientosBlancas;
	private ArrayList<String> movimientosNegras;
	
	
	
	public Partida() {
		movimientosBlancas = new ArrayList<>();
		movimientosNegras = new ArrayList<>();
	}
	public ArrayList<String> getMovimientosBlancas() {
		return movimientosBlancas;
	}
	public void setMovimientosBlancas(ArrayList<String> movimientosBlancas) {
		this.movimientosBlancas = movimientosBlancas;
	}
	public ArrayList<String> getMovimientosNegras() {
		return movimientosNegras;
	}
	public void setMovimientosNegras(ArrayList<String> movimientosNegras) {
		this.movimientosNegras = movimientosNegras;
	}
	
}
