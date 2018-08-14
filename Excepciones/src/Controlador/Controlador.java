package Controlador;

import Modelo.Division;
import Modelo.DivisorEnCeroException;
import Modelo.Mundo;

public class Controlador {

	private Mundo m;
	private Division d;
	
	public Controlador() throws NullPointerException, DivisorEnCeroException{
		// TODO Auto-generated constructor stub
		//ejemploTryCatchFinallyObjetos();
		//ejemploThrow();
		m = new Mundo();
		m.getR().solicitarConstantes(0,-4,4);
		m.getR().calcularRaices();
		m.getR().imprimirRaices();
	}

	public void ejemploTryCatchFinallyObjetos()
	{
		try 
		{
			d.dividir(5);
		}
		catch (Exception e)
		{
			System.out.println("Qué pasó socio, olvido instanciar el objeto?, error:"+e.toString());
			System.out.println("salió bien X");
		}
		finally
		{
			System.out.println("Devuelvase pa'fundamentos!!");
		}
	}
	
	public void ejemploThrow() throws NullPointerException, DivisorEnCeroException
	{
		int a = 0;
		d = new Division();
		
		if( a != 0 )
		{
			d.dividir(a);
		}
		else
		{
			throw new DivisorEnCeroException(); 
		}
	}
	
}
