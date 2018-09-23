package Controlador;

import Modelo.BD;
import Vista.Interfaz;

public class Controlador {

	//Atributos que vienen del Modelo 
	private BD bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador()
	{
		bd = new BD();
		gui = new Interfaz();
		gui.solicitarNumero(bd);
		calcularMonto(bd);
		gui.imprimirMonto(bd);
	}
	
	/*
	 *Responsabilidad del metodo calcularMonto(): 
	 *Realiza la conversión del atributo "valor" del objeto numero, y asigna al atributo "monto" el string correspondiente
	 *al monto escrito resultante.
	*/
	
	public static void calcularMonto(BD bd)
	{
		String cadena = "";
		int unidad=0, decena=0;
		decena = bd.getValor() / 10;
		unidad = bd.getValor() % 10;
		
		if(decena == 0)
		{
			cadena = bd.getUnidades()[unidad];
		}
		else if (decena == 1)
		{
			cadena = bd.getOnceal19()[unidad];
		}
		else if (decena == 2)
		{
			if (unidad == 0)
				cadena = bd.getDecenas()[decena-2];
			else
				cadena = bd.getVeinti() + bd.getUnidades()[unidad];
		}
		else if (decena > 2)
		{
			if (unidad == 0)
				cadena = bd.getDecenas()[decena-2];
			else
				cadena = bd.getDecenas()[decena-2] + " y " + bd.getUnidades()[unidad];
		}
		bd.setMonto(cadena + " " + bd.getMoneda());
	}	

}
