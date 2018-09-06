package Modelo;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	private Cuadrado cuad;
	private Circulo  circ;


	public Mundo() {
		// TODO Auto-generated constructor stub
		cuad = new Cuadrado();
		circ = new Circulo();
	}
	
	
	
	public Cuadrado getCuad() {
		return cuad;
	}

	public void setCuad(Cuadrado cuad) {
		this.cuad = cuad;
	}

	public Circulo getCirc() {
		return circ;
	}

	public void setCirc(Circulo circ) {
		this.circ = circ;
	}
	
	
}
