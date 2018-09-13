package Controlador;

import Modelo.Mundo;

public class Controlador {

	private Mundo m;
	
	public Controlador() {
		m = new Mundo();
		//m.escribirArchivo();
		//m.leerArchivo();
		m.getPr().setPropiedades();
		m.getPr().getPropiedades();
	}
}
