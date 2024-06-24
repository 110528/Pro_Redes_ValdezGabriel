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
			ps.println(Utils.ANSI_GREEN_BOLD + "MENU" + Utils.ANSI_RESET);
			ps.println(Utils.ANSI_YELLOW_BOLD + "1 - Agregar producto" + Utils.ANSI_RESET);
			ps.println(Utils.ANSI_YELLOW_BOLD + "2 - Mostrar productos" + Utils.ANSI_RESET);
			ps.println(Utils.ANSI_YELLOW_BOLD + "3 - SALIR" + Utils.ANSI_RESET);

			int opcion = ejercicios.ej1();

			switch (opcion) {
			case 1:
				ps.println(Utils.ANSI_GREEN_BOLD +"DATOS DEL PRODUCTO \n"+ Utils.ANSI_RESET);
				ejercicios.ej5();
				break;
			case 2:
				ps.println(Utils.ANSI_GREEN_BOLD + "PRODUCTOS: \n"+ Utils.ANSI_RESET);
				
				Ficheros.mostrarEnConsola();
				break;
			case 3:
				ps.println(Utils.ANSI_RED_BOLD + "Saliendo"+ Utils.ANSI_RESET);
				continuar = false;
				break;
			default:
				ps.println(Utils.ANSI_RED_BOLD + "Opción incorrecta, ingrese otra opcion." + Utils.ANSI_RESET);
				break;
			}				
		}
	}
	

	

}
