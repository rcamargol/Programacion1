package Controlador;

import Modelo.Mundo;

public class Controlador {
	
	Mundo m;
	
	public Controlador() {
		m = new Mundo();
		m.crearMontos();
		m.leerMontos();
	}
	
}
