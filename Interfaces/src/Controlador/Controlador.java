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
		bd.getCirculo().setRadio(Double.parseDouble(gui.pedirRadio()));
		bd.getCuadrado().setLado(Double.parseDouble(gui.pedirLado()));
		gui.imprimirResultado("Circulo",bd.getCirculo().calcularArea(), bd.getCirculo().calcularPerimetro());
		gui.imprimirResultado("Cuadrado",bd.getCuadrado().calcularArea(), bd.getCuadrado().calcularPerimetro());
	}

}
