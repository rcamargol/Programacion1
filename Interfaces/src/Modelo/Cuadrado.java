package Modelo;

public class Cuadrado implements Figura{
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

}
