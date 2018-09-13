package Modelo;

import java.io.*;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	private Persistencia BD;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.
	private Archivos ar;
	private String archivo; 
	private Propiedades pr;
	
	public Mundo() {
		// TODO Auto-generated constructor stub
		BD = new Persistencia();
		ar= new Archivos();
		this.archivo = BD.getArchivo();
		pr = new Propiedades();
	}


	public Propiedades getPr() {
		return pr;
	}


	public void setPr(Propiedades pr) {
		this.pr = pr;
	}


	public void leerArchivo() {
		ar.setF(new File(archivo));
		String[] numero = new String[20];
		try {
			ar.setFr(new FileReader(ar.getF()));
			ar.setBr(new BufferedReader(ar.getFr()));
			String linea = ar.getBr().readLine();
			while(linea != null) {
				//System.out.println(linea);
				numero = linea.split(";");
				linea = ar.getBr().readLine();
			}
			for(int i=0 ; i<20 ; i++)
				System.out.println(numero[i]);
			ar.getFr().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void escribirArchivo() {
		
		ar.setF(new File(archivo));
		try 
		{
			ar.setFw(new FileWriter(ar.getF(),true));
			ar.setPw(new PrintWriter(ar.getFw()));
			for(int i = 1 ; i<=20 ; i++) {
				ar.getPw().print(i+";");
			}
			ar.getPw().println("");
			ar.getFw().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
