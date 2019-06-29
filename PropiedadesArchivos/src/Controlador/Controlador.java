package Controlador;

import java.io.IOException;

import Modelo.Mundo;

public class Controlador {

	private Mundo m;
	
	public Controlador() throws Exception {
		m = new Mundo();
		//m.escribirArchivo();
		m.leerDirectorio();
		//m.escribirProject();
		//m.getPr().setPropiedades();
		//m.getPr().getPropiedades();
	}
}
