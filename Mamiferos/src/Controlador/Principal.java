package Controlador;

import Modelo.Canino;
import Modelo.Felino;
import Modelo.Mundo;

public class Principal {

	//private static Mundo m;
	private static Canino can1;
	private static Felino fel1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		can1 = new Canino("Cocker", 4);
		fel1 = new Felino("Tigre", 4);
		can1.alimentar();
		can1.hacerSonido();
		fel1.alimentar();
		fel1.hacerSonido();

	}

}
