package Modelo;

import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "C:\\data\\archivo.properties";

	public void setPropiedades() {
		try {
			prop.setProperty("nombreArchivo", "C:\\data\\archivo.txt");
			prop.setProperty("archivoProp", "C:\\data\\archivo.properties");
			prop.setProperty("nombreCodigo", "Propiedades.Java");

			prop.store(new FileOutputStream(archivoprop), null);
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void getPropiedades() {
		try {
			// load a properties file for reading
			prop.load(new FileInputStream(archivoprop));
			// get the properties and print
			prop.list(System.out);
			//Reading each property value
			System.out.println(prop.getProperty("nombreArchivo"));
			System.out.println(prop.getProperty("archivoProp"));
			System.out.println(prop.getProperty("nombreCodigo"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	
}
