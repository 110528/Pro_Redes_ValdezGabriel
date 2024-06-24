package TP2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Ficheros {
	
	public static PrintStream ps;
	static File archivo = new File("inventarioo.dat");
		
	{	try {
			ps = new PrintStream ( new FileOutputStream("inventarioo.dat" , true) );
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void mostrarEnConsola() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Archivo no encontrado.");
        }
    }
	
}

