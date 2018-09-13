package Modelo;

import javax.swing.JOptionPane;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	private Persona personas[];

	public Mundo() {
		// TODO Auto-generated constructor stub
		personas = new Persona[3];
	}

	public String hacerSobrecarga() {
		return "Sobrecarga solita";
	}
	
	public String hacerSobrecarga(int argumento) {
		return "Sobrecarga "+ argumento +" un parametro tipo entero";
	}
	
	public String hacerSobrecarga(int argumento1, double argumento2) {
		return "Sobrecarga "+ argumento1 + " " + " " + argumento2 + " argumento entero y tipo double";
	}
	
	//getter para el atributo ejemplo
	public void hacerPolimorfismo() {
		personas[0] = new Persona();
		personas[1] = new Alumno();
		personas[2] = new Profesor();
		for (int i=0 ; i<3; i++) 
			JOptionPane.showMessageDialog(null, personas[i], "Polimorfismo", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
