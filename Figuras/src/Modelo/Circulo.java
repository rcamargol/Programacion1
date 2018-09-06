package Modelo;

public class Circulo implements Figura{
	
	private double radio;

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * this.radio * this.radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
