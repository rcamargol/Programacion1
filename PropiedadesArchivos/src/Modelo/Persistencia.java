package Modelo;


//Representa los datos de persistencia que van a ser utilizados por el mundo y/o controlador
//es opcional: puede o no tener datos.


public class Persistencia {
	
	private String archivo = "C:\\data\\archivo.txt";
	private String archivoProp = "C:\\data\\archivo.properties";

	public String getArchivo() {
		return this.archivo;
	}

	public String getArchivoProp() {
		return archivoProp;
	}

	public void setArchivoProp(String archivoProp) {
		this.archivoProp = archivoProp;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	
}
