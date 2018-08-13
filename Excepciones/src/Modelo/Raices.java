package Modelo;

//Representa los datos de persistencia que van a ser utilizados por el mundo y/o controlador
//es opcional: ser puede o no tener datos.

public class Raices {

	private float X1;
	private float X2;
	private int a;
	private int b;
	private int c;
	private int radical;
	private int cociente;
	
	public Raices() 
	{
		// TODO Auto-generated constructor stub
		this.a = this.b = this.c = 0;
		this.radical = this.cociente = 0;
		this.X1 = this.X2 = (float)0.0;
	}
	
	public void solicitarConstantes(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.print("Los valores ingresados de a, b, y c son:");
		System.out.println(this.a+" "+this.b+" "+this.c);
	}
	
	public void calcularRaices()
	{
		
		this.radical = ((b*b) - (4*this.a*this.c));
		this.cociente  = (2*this.a);

		System.out.println("raiz:"+ radical);
		System.out.println("cociente:"+ cociente);
		
		this.X1 = (float) ((-this.b + Math.sqrt(radical)) / (cociente));
		this.X2 = (float) ((-this.b - Math.sqrt(radical)) / (cociente));
	}
	
	
	public int getRadical() {
		return radical;
	}

	public void setRadical(int radical) {
		this.radical = radical;
	}

	public int getCociente() {
		return cociente;
	}

	public void setCociente(int cociente) {
		this.cociente = cociente;
	}

	public void imprimirRaices()
	{
		System.out.println("\nLos resultados de las Raices son:");
		System.out.println("X1: "+this.X1);
		System.out.println("X2: "+this.X2);
	}

}
