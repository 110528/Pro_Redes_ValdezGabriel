package TP2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejercicios {
	
	static PrintStream ps = new PrintStream(System.out);
	static boolean continuar = true;
	
	
	
	static int ej1() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int op = 0;
		boolean entradaValida = false;

		while (!entradaValida) {
			ps.println("Ingrese una opción:");
			try {
				String input = reader.readLine();
				op = Integer.parseInt(input);

				if (op >= 0) {
					entradaValida = true;
				} else {
					ps.println("Error: ingrese un número entero positivo.");
				}
			} catch (NumberFormatException | IOException e) {
				ps.println("Error: ingrese un número entero válido.");
			}
		}

		return op;
	}
	
	
	static String ej2() {
		String cadena = "";
		try {
			int Byte = -1;
			while(    (Byte = System.in.read())  != '\n'    ) 
			{
				if( Byte != 13 )
					cadena += (char)Byte;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cadena;
	}
	
  
	 static String ej3() {
	        ps.println("Ingrese un dato: ");
	        String dato = ej2();
	        
	        try {
	            Integer.parseInt(dato);
	            return "Entero";
	        } catch (NumberFormatException ex1) {
	            try {
	                Float.parseFloat(dato);
	                return "Número con coma";
	            } catch (NumberFormatException ex2) {
	                return "String";
	            }
	        }
	    }
	 
	 
	 static int ej4Int(int num) {
	        ps.println("Ingrese texto");
	        String texto = ej2();
	
	        int nroEntero = Integer.parseInt(texto);
	        ps.println("Enteo: " + nroEntero );
	        return nroEntero;
	        
	    }  
	        
	 static float ej4Float() {
	        ps.println("Ingrese texto (con valor numerico con coma)");
	        String texto = ej2();
	
	        float nroFloat = Float.parseFloat(texto);
	        ps.println("Float: " + nroFloat);
	        return nroFloat;
	        
	    } 
	

	 static void ej5() { 
		 
		 String nombre = "";
		 float pcompra = 0;
		 float pventa = 0;
		 int cant_stock = 0;
		 
		 ps.println("Ingrese nombre del producto: ");
		 nombre = ej2();
		 
		 ps.println("Ingrese precio de compra: ");
		 String d1 = ej2();
		 pcompra = Float.parseFloat(d1);
		 
		 ps.println("Ingrese precio de venta: ");
		 String d2 = ej2();
		 pventa = Float.parseFloat(d2);
		 
		 ps.println("Ingrese la cantidad de stock: ");
		 String d3 = ej2();
		 cant_stock = Integer.parseInt(d3); 
	 
	 
	 
	
		 	Ficheros.ps.println("Nombre del producto: " + nombre);
	        Ficheros.ps.println("Precio de compra: " + pcompra);
	        Ficheros.ps.println("Precio de venta: " + pventa);
	        Ficheros.ps.println("Stock: " + cant_stock);
	        Ficheros.ps.println();
	        Ficheros.ps.flush();
	        //ps.close();
		 
	 }
	 
}
	 
	
	
	
	

