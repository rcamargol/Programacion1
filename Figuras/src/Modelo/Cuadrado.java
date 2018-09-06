package Modelo;

public class Cuadrado implements Figura{

	private double lado;
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.lado * this.lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado * 4;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
