package Controlador;

import Modelo.Monto;
import Vista.Interfaz;

public class Controlador {

	//Atributos que vienen del Modelo 
	private Monto bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador()
	{
		bd = new Monto();
		gui = new Interfaz();
		bd.setValor(gui.obtenerNumero());
		bd.cargarDigitos();
		bd.calcularMonto();
		gui.imprimirMonto(bd.getValor(),bd.getMonto());
	}
	

	//metodo auxiliar que valida si el número ingresado está en el rango indicado 

}
