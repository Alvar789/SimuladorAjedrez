package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import modelo.Partida;

public class LectorPartidas {
	public Partida lectorPartidas(int numPartida){
		
		FileReader fr = null;
		BufferedReader bf = null;
		Partida partida = new Partida();
		String linea, jugadores;
		String[] jugadas;
		try {
			File archivoPartida = new File("partidas/Partida" + numPartida + ".txt");
			fr = new FileReader(archivoPartida);
			bf = new BufferedReader(fr);
			
			jugadores = bf.readLine();
			partida.setJugadores(jugadores);
			while((linea = bf.readLine()) != null) {
				linea = linea.substring(linea.indexOf(" "));
				jugadas = linea.split(" ");
				partida.getMovimientosBlancas().add(jugadas[0]);
				partida.getMovimientosNegras().add(jugadas[1]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return partida;
	}
}
