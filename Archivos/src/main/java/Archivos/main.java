package Archivos;

public class main {

	public static void main(String[] args) {

		Ficheros archivo = new Ficheros();
		
		//archivo.createFilePrintStream(archivo.getArchivo());
	archivo.createFilePrinter(archivo.getArchivo());
	}

}
