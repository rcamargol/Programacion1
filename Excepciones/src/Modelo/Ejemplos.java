package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;	

public class Ejemplos {
	
	public Ejemplos() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void ejemploTryCatchArchivos()
	{
      BufferedReader in= null; PrintWriter out = null; String line;
      
      try 
      {
    	  in = new BufferedReader(new FileReader("Origen.txt"));
      }
      catch (IOException e) 
      {
          System.out.println("error en apertura"); 
          System.exit(1);
      }
      
      try 
      { 
    	  out = new PrintWriter( new FileWriter("Destino.txt"));
	  }
      catch (IOException e1) 
      {
    	  System.out.println("error en creacion"); 
    	  System.exit(1);
	  }

      try 
      {
    	  while( (line = in.readLine()) != null)
    	  {
    		  out.println(line);
    	  }  
      }
      
      catch (IOException e) 
      { 
    	  System.out.println("problemas");
      }
	}
}
