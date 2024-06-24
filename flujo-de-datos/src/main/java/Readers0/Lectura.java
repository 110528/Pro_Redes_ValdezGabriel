package Readers0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura {
	PrintStream ps;
	public Lectura()
	{
		
		ps = new PrintStream(System.out);
		System.out.println("Byte:");
		//Scanner s = new Scanner(System.in);
		//System.err.println();
		
		
		
		System.out.write(  13  );  // 
		System.out.write(  10  );  // enter 
		System.out.write(  5 );
		System.out.write(  27 );
		System.out.flush();
		byte[] array = {15,52,45,65,84};
		try {
			
		System.out.write(array);
		}catch(IOException e){
			Logger.getLogger(Readers0.Lectura.class.getName()).log(Level.SEVERE,null,e);
			//e.printStackTrace();
		}
		
		
		//System.out.println();
		ps.println("hola");
		ps.printf("las veces que yaz fue gila fue: %d \n",500);
		
		File archivo = new File("error.log");
		
		//crea un canal de comunicaciones de salida, Destino: archivo(file)
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(archivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//                               destino,append
		PrintStream error= new PrintStream(fos, true);
		
		System.setErr(error);
		
	}
	
	
	
	
	public String entradaDeDatos(){
		try {
			int Byte = -1;
			String cadena = "";
		while( (Byte = System.in.read())!= '\n' )
		{
			if(Byte != 13) 
			cadena+=(char)Byte;
			
		}

		System.out.print(cadena);
		} catch(IOException e){
			e.printStackTrace();
		}
		return "";
	}
}



