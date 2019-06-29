package Modelo;

import java.io.*;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	private Persistencia BD;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.
	private Archivos ar;
	private String archivo;
	private String archivoProject; 
	private Propiedades pr;
	private String[] directorio;
	
	public Mundo() {
		// TODO Auto-generated constructor stub
		BD = new Persistencia();
		ar= new Archivos();
		this.archivo = BD.getArchivo();
		this.archivoProject = BD.getArchivoProject();
		pr = new Propiedades();
		directorio = new String[70];
	}


	public Propiedades getPr() {
		return pr;
	}


	public void setPr(Propiedades pr) {
		this.pr = pr;
	}


	public void leerDirectorio() throws IOException {
		ar.setF(new File(archivo));
		String[] directoriof,directorio2 = new String[70];
		String ruta = "", fuente="", destino="";
		int i,j = 0;
		if(ar.getF().isDirectory()) {
			//System.out.println(ar.getF().getName());
			directorio = ar.getF().list();
		}
		
		for(i=0 ; i<directorio.length ; i++) {
			ar.setF(new File(archivo+"\\"+directorio[i]));
			//System.out.println(archivo+"\\"+directorio[i]+"\\");
			directoriof = ar.getF().list();
			directorio2[i] = directoriof[0];
			//System.out.println(archivo+"\\"+directorio[i]+"\\"+directorio2[i]);
		}
		
		for(i=0 ; i<directorio.length ; i++) {
			ruta = archivo+"\\"+directorio[i]+"\\"+directorio2[i];
			ar.setF(new File(ruta));
			directoriof = ar.getF().list();
			if(directoriof != null) {
				for(j=0 ; j < directoriof.length ; j++) {
					if(directoriof[j].equals(".project")) {
						fuente = ruta+"\\"+directoriof[j];
						destino = ruta+"\\project.backup";
						System.out.println("Haciendo backup de "+fuente+" a "+destino);
						copiarArchivo(new File(fuente) , new File(destino));
					}	
				}
				//System.out.println("limpiando: "+directorio[i]+" --- "+limpiarTexto(directorio[i]));
				System.out.println("\nReescribiendo  "+ruta+"\\.project");
				escribirProject(ruta+"\\.project",limpiarTexto(directorio[i]));
			}
		}
		
	}
	
	
	private String limpiarTexto(String texto) {
		String tex = new String (texto.toLowerCase());
		char [] arreglo = new char[70];
		arreglo = tex.toCharArray();
		for (int i=0 ; i<arreglo.length ; i++) {
			if(arreglo[i] == 'á') arreglo[i] = 'a';
			if(arreglo[i] == 'é') arreglo[i] = 'e';
			if(arreglo[i] == 'í') arreglo[i] = 'i';
			if(arreglo[i] == 'ó') arreglo[i] = 'o';
			if(arreglo[i] == 'u') arreglo[i] = 'u';
		}
		tex = String.valueOf(arreglo);
		return tex;
	}
	
	public void leerArchivo() {
		ar.setF(new File(archivo));
		String[] numero = new String[70];
		try {
			ar.setFr(new FileReader(ar.getF()));
			ar.setBr(new BufferedReader(ar.getFr()));
			String linea = ar.getBr().readLine();
			while(linea != null) {
				//System.out.println(linea);
				numero = linea.split(";");
				linea = ar.getBr().readLine();
			}
			for(int i=0 ; i<20 ; i++)
				System.out.println(numero[i]);
			ar.getFr().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void escribirArchivo() {
		
		ar.setF(new File(archivo));
		try 
		{
			ar.setFw(new FileWriter(ar.getF(),true));
			ar.setPw(new PrintWriter(ar.getFw()));
			for(int i = 1 ; i<=20 ; i++) {
				ar.getPw().print(i+";");
			}
			ar.getPw().println("");
			ar.getFw().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void escribirProject(String ruta, String nombre) {
		
		ar.setF(new File(ruta));
		
		try 
		{
			ar.setFw(new FileWriter(ar.getF()));
			ar.setPw(new PrintWriter(ar.getFw()));
			/*for(int i = 1 ; i<=20 ; i++) {
				ar.getPw().print(i+";");
			}*/
			ar.getPw().print(BD.setXML(nombre));
			ar.getFw().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void copiarArchivo(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	
}
