package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	private Mundo bd;
	private Interfaz gui;
	
	public Controlador() 
	{
		bd = new Mundo();
		gui = new Interfaz();
	}

}
