package Controlador;

import Modelo.Numero;

public class Principal {

	//Atributos que vienen del Modelo 
	private static Numero numero; 
	
	/*
	 * Metodo main(), punto de entrada a la ejecución de la aplicación
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numero = new Numero();
		numero.solicitarNumero();
		numero.calcularMonto();
		numero.imprimirMonto();
	}
	

}
