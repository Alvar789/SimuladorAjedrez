package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import modelo.Partida;

public class LectorPartidas {
	public HashMap<String, Partida> lectorPartidas(int numPartida){
		HashMap< String, Partida> mapaPartidas = new HashMap<>();
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
			while((linea = bf.readLine()) != null) {
				linea = linea.substring(linea.indexOf(" "));
				jugadas = linea.split(" ");
				partida.getMovimientosBlancas().add(jugadas[0]);
				partida.getMovimientosNegras().add(jugadas[1]);
			}
			mapaPartidas.put(jugadores, partida);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapaPartidas;
	}
}
