package TP2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	static PrintStream ps = new PrintStream(System.out);
	static boolean continuar = true;
	
		
	public static void main(String[] args) {
		
		Ficheros ficheros = new Ficheros();

		while (continuar) { 
			ps.println("MENU\n");
			ps.println("1 - Agregar producto");
			ps.println("2 - Mostrar produco");
			ps.println("3 - Salir\n");

			int opcion = ejercicios.ej1();

			switch (opcion) {
			case 1:
				ps.println("DATOS DEL PRODUCTO \n");
				ejercicios.ej5();
				break;
			case 2:
				ps.println("PRODUCTOS: \n");
				
				Ficheros.mostrarEnConsola();
				break;
			case 3:
				ps.println("Saliendo");
				continuar = false;
				break;
			default:
				ps.println("Opción incorrecta, ingrese otra opcion.");
				break;
			}				
		}
	}
	

	

}
