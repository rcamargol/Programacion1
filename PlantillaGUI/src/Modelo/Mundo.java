package Modelo;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	Persistencia BD;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.
	private String dato; // atributo ejemplo que se va a cargar por un método de vista

	public Mundo() {
		// TODO Auto-generated constructor stub
		dato = "";
	}

	//getter para el atributo ejemplo
	public String getDato() {
		return dato;
	}


	//setter para el atributo ejemplo
	public void setDato(String dato) {
		this.dato = dato;
	}



	/* metodo que realiza un proceso basado en un atributo dato (ejemplo)  
	 * Reemplazar por lo que se necesiten
	 */
	public void procesarDato() {
		this.dato = this.dato + " procesado";
	}
	
}
