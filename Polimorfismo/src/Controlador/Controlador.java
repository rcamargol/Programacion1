package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		gui = new Interfaz();

		//aqui van los métodos que se invocan de Modelo (Mundo) y de Vista y que ejecutarán el programa.
		
		gui.escribirDato(bd.hacerSobrecarga());
		gui.escribirDato(bd.hacerSobrecarga(123));
		gui.escribirDato(bd.hacerSobrecarga(100, 3.1416));
		
		//bd.hacerPolimorfismo();
	}

}
