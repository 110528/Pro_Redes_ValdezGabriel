package TP_Hilos;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Atleta> atletas = new ArrayList<Atleta>();
    private int atletaActual = 0;
    private String[] actividades = {"remo", "correr", "nadar", "bicicleta"};
    private int actividadActualIndex = 0;
    private String nombreEquipo;
    private long tiempoTotal = 0;
    private Arbitro arbitro;

    public Equipo(String nombreEquipo, Arbitro arbitro) {
        this.nombreEquipo = nombreEquipo;
        this.arbitro = arbitro;

        for (int i = 0; i < 4; i++) {
            Atleta atleta = new Atleta(nombreEquipo + " _Atleta" + (i + 1), this);
            atletas.add(atleta);
        }
    }

    public void empezarCarrera() {
        atletaActual = 0;
        actividadActualIndex = 0;
        atletas.get(atletaActual).recibir();
        for (Atleta atleta : atletas) {
            atleta.start();
        }
    }

    public synchronized void notificarProximoAtleta() {
        if (atletaActual < atletas.size() - 1) {
            atletaActual++;
            actividadActualIndex = (actividadActualIndex + 1) % actividades.length;
            atletas.get(atletaActual).recibir();
        }
    }

    public String getActividadActual() {
        return actividades[actividadActualIndex];
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void agregarTiempo(int tiempo) {
        tiempoTotal += tiempo;
    }

    public long getTiempoTotal() {
        return tiempoTotal;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }
}
