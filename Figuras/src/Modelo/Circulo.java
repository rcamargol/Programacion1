package Modelo;

public class Circulo implements Figura{
	
	private double radio;
	private double area;
	private double perimetro;

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro = 2 * Math.PI * this.radio;
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

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area = Math.PI * this.radio * this.radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
