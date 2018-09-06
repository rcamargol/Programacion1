package Modelo;

public class Cuadrado implements Figura{

	private double lado;
	private double area;
	private double perimetro;
	
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area =  this.lado * this.lado;
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro = this.lado * 4;
	}

	public double getLado() {
		return lado;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
