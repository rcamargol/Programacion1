package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.BD;
import Vista.InterfazGUI;

public class Controlador implements ActionListener{

	//Atributos que vienen del Modelo 
	private BD bd;
	
	//Atributos que vienen de Vista
	private InterfazGUI gui;
	
	public Controlador()
	{
		bd = new BD();
		gui = new InterfazGUI(this);
		gui.setVisible(true);
	}

	public void actionPerformed(ActionEvent evento) 
	{
		// TODO Auto-generated method stub
		
		if(evento.getSource() == gui.getPanelEntrada().getBoton())
		{
			realizarConversion();
		}
	}

	public void realizarConversion()
	{
		try
		{
			int n= Integer.parseInt(gui.getPanelEntrada().getCampoNumero().getText());
			System.out.println("aqui invoca EL SUPERMETODO de convertir");
			if (validarNumero(n))
			{	
				bd.setValor(n);
				calcularMonto(bd);
				gui.getPanelResultados().settxtMonto(bd.getMonto());
			}	
			else
			{
				gui.getPanelResultados().settxtMonto("");
				mostrarAlerta("Número Fuera de Rango",bd.getNombreApp());
			}
		}
		catch(Exception e)
		{
			mostrarAlerta(e.getMessage(),bd.getNombreApp());
		}
	}
	
	public boolean validarNumero(int n)
	{
		if (n >= 0 && n<= 99)
			return true;
		else
			return false;
	}
	
	//metodo auxilar que muestra una alerta por pantalla
	public void mostrarAlerta(String mensaje, String aplicacion)
	{
		JOptionPane.showMessageDialog(null, mensaje, aplicacion, JOptionPane.ERROR_MESSAGE);
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
