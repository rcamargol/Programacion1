package Modelo;

import javax.swing.JOptionPane;

public class Numero {

	private int valor;
	private String monto;
	private Persistencia data;

	
	public Numero() {
		this.valor = 0;
		this.monto = "";
		this.data = new Persistencia();
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int numero) {
		this.valor = numero;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}
	
	//aqui van los metodos de Numero que realiza entrada calculo y salida
	
	/*
	 *Responsabilidad del metodo solicitarNumero(): 
	 *Realiza ingreso del nùmero por teclado, y ejecuta la valida del rango
	 *Si es el correcto, asigna el valor al objeto numero, que es la instancia de la clase Numero en MODELO
	*/
	
	public void solicitarNumero()
	{
		int n=0;
		
		n = obtenerEntero("Ingrese un Valor");
		
		if (!validarNumero(n))
			mostrarAlerta("Número Fuera de Rango");
		else
			this.setValor(n);
	}
	
	//metodo auxiliar que valida si el número ingresado está en el rango indicado 
	private static boolean validarNumero(int n)
	{
		if (n >= 0 && n<= 99)
			return true;
		else
			return false;
	}
	
	/*
	 *Responsabilidad del metodo calcularMonto(): 
	 *Realiza la conversión del atributo "valor" del objeto numero, y asigna al atributo "monto" el string correspondiente
	 *al monto escrito resultante.
	*/
	
	public String calcularMonto()
	{
		String cadena = "";
		int unidad=0, decena=0;
		decena = this.getValor() / 10;
		unidad = this.getValor() % 10;
		
		if(decena == 0)
		{
			cadena = data.getUnidades()[unidad];
		}
		else if (decena == 1)
		{
			cadena = data.getOnceal19()[unidad];
		}
		else if (decena == 2)
		{
			if (unidad == 0)
				cadena = data.getDecenas()[decena-2];
			else
				cadena = data.getVeinti() + data.getUnidades()[unidad];
		}
		else if (decena > 2)
		{
			if (unidad == 0)
				cadena = data.getDecenas()[decena-2];
			else
				cadena = data.getDecenas()[decena-2] + " y " +data.getUnidades()[unidad];
		}
		return (cadena + " " + data.getMoneda());
	}
	
	/*
	 *Responsabilidad del metodo imprimirMonto(): 
	 *Imprime el monto escrito resultante por pantalla.
	*/	
	public void imprimirMonto()
	{
		String mensaje = "El monto escrito de: "+this.getValor()+" es:\n"+this.getMonto();
		JOptionPane.showMessageDialog(null, mensaje, data.getNombreApp(), JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	//metodo auxilar que muestra una alerta por pantalla
	private void mostrarAlerta(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje, data.getNombreApp(), JOptionPane.ERROR_MESSAGE);
	}

	
	//metodo auxilar que pide por dialogo en pantalla un número entero
	private static int obtenerEntero(String mensaje)
	{
		String cad = JOptionPane.showInputDialog(null, mensaje);
		if (cad != null)
			return Integer.parseInt(cad);
		else
			return-1;
	}
	
	//final final no va mas
}
