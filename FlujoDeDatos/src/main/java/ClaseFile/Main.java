package ClaseFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.System.Logger.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		// Forma facil

		/*
		 * PrintStream ps; //../Archivos de programa ruta relativa //../Archivos de
		 * programa/java/prueba.txt ruta absoluta pq se escribe todo completo de donde
		 * esta el archivo // prueba.txt se crea el archivo en el programa
		 * 
		 * File archivo = new File("prueba.txt");
		 * 
		 * try {
		 * 
		 * 
		 * ps = new PrintStream( new FileOutputStream( archivo , true ) );
		 * 
		 * 
		 * //DONDE ESTA EL TRUE ES EL APPEND, SI ESTA TRUE SIGNIFICA QUE CUANDO NOSOTROS
		 * //GUARDAMOS OTRA COSA EN EL ARCHIVO SE VAN A ALMACENAR LAS COSAS VIEJAS Y
		 * NUEVAS //SI DICE FALSE SIGNIFICA QUE SE VA A EESCRIBIR ELIMINANDO LO QUE
		 * ESTABA ESCRITO
		 * 
		 * 
		 * ps.println("estoy escribiendo en un achivo de texto");
		 * 
		 * ps.println("otra linea en el archivo");
		 * 
		 * ps.append("nueva linea");//Sirve para que esta linea se sobreescriba en el
		 * .txt pero aca no funciona pq esta en TRUE
		 * 
		 * ps.flush(); // te asegura que los datos llegan al archivo y que no quedan en
		 * el medio
		 * 
		 * ps.close(); // Cuando ponemos el close se crea el achivo
		 * 
		 * 
		 * 
		 * System.setErr( new PrintStream( new FileOutputStream("error.pepe" , false) )
		 * );
		 * 
		 * System.err.println("aca estuvo el error");
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 */

		// Forma compleja

		File archivo = new File("D:\\Usuario\\Documents\\GitHub\\Pro_Redes_ValdezGabriel\\FlujoDeDatos\\textos\\datos.dat");

		try {
			if (!archivo.exists()) {

				FileWriter Fw = new FileWriter(archivo, true);
				PrintWriter Pw = new PrintWriter(Fw);

				Pw.println("cacatua");
				Pw.flush();
				Pw.close();
				Fw.close();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Escritura de un archivo ya existente
		try {

			FileWriter Fw = new FileWriter(archivo, true);
			PrintWriter Pw = new PrintWriter(Fw);

			Pw.append("Nueva linea de texto. En la copia");
			Pw.flush();

			Pw.close();
			Fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Lectura de archivos
		try {
			FileReader Fr = new FileReader(archivo);
			BufferedReader Br = new BufferedReader(Fr);

			PrintStream ps = new PrintStream(System.out);
			String aux = "";

			while ((aux = Br.readLine()) != null) // EOF el final de una linea
			{
				//aca se modifica u omitimos las lineas del archivo que no queremos
				//if().....
				ps.println(aux);
			}

			Br.close();
			Fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		File archivoCopia = new File("D:\\Usuario\\Documents\\GitHub\\Pro_Redes_ValdezGabriel\\FlujoDeDatos\\textos\\datosCopia.txt");
		
		
		try {
			
			FileReader Fr = new FileReader (archivo);
			BufferedReader Br = new BufferedReader( Fr );
			
			if(!archivoCopia.exists()) 
			{
				FileWriter Fw = new FileWriter ( archivoCopia, true );
				PrintWriter Pw = new PrintWriter( Fw );
				
				String aux = "";
				while( (aux = Br.readLine()) != null ) //EOF
				{
					Pw.println( aux );
				}
				
				Pw.close();
				Fw.close();
				
			}
			Br.close();
			Fr.close();
			if(archivo.exists()) {
				archivo.delete();
			}
			if(archivoCopia.exists()) {
				archivoCopia.renameTo(archivo);
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

}
