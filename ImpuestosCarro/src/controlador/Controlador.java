package controlador;

import vista.Interfaz;

public class Controlador {

	private Interfaz gui;
	
	public Controlador() {
		gui = new Interfaz();
		gui.setVisible(true);
	}
}
