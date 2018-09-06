package Modelo;

public class Circulo implements Figura{
	
	private double radio;
	private double pi = 3.1416;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.pi * this.radio * this.radio ;
	}
	
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * this.pi* this.radio;
	}
	
	

}
