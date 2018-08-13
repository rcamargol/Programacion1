package Controlador;

import Modelo.Mundo;

public class Controlador {

	private Mundo m;
	
	public Controlador() {
		// TODO Auto-generated constructor stub
		ejemploTryCatchFinallyObjetos();
		/*m = new Mundo();
		m.getR().solicitarConstantes(1,-4,4);
		m.getR().calcularRaices();
		m.getR().imprimirRaices();*/
	}

	public void ejemploTryCatchFinallyObjetos()
	{
		try 
		{
			m.getR().solicitarConstantes(1, 1, 1);
		}
		catch (Exception e)
		{
			System.out.println("Qué pasó socio, olvido instanciar el objeto?, error:"+e.toString());
		}
		finally
		{
			System.out.println("Devuelvase pa'fundamentos!!");
		}
	}
}
