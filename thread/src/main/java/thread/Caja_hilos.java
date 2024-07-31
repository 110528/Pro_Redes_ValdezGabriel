package thread;

import java.util.ArrayList;

public class Caja_hilos extends Thread {
	
	private int numCaja;
	private String nombreCajero;
	private long tiempoInicial;
	private ArrayList<Persona> filaClientes;
	
	public Caja_hilos(int n, String nombre, long ti, ArrayList<Persona> listaCli) {
		this.numCaja = n;
		this.nombreCajero = nombre;
		this.tiempoInicial = ti;
		this.filaClientes = listaCli;
		
		
	}
	
	@Override
	public void run() {
		
		
		
	}

}
