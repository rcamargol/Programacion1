package Modelo;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	private Raices r;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.

	public Mundo() {
		// TODO Auto-generated constructor stub
		r = new Raices();
	}

	public Raices getR() {
		return r;
	}

	public void setR(Raices r) {
		this.r = r;
	}

}
