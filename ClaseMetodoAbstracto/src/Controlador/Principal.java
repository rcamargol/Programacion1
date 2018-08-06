package Controlador;

import Modelo.Mundo;

public class Principal {

	private static Mundo m;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m = new Mundo();
		m.getCar1().imprimirDatosVehiculo();
		m.getAv1().imprimirDatosVehiculo();
	}
}
