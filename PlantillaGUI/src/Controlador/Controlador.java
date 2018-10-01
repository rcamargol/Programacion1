package Controlador;

import Modelo.Mundo;
import Vista.InterfazGUI;

public class Controlador{

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista - GUI
	private InterfazGUI gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		gui = new InterfazGUI();
		gui.setVisible(true); //hacer visible la ventana principal
		
	}
}
