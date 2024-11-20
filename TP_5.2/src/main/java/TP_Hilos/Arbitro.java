package TP_Hilos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.PrintStream;

public class Arbitro {

    private static final Logger log = Logger.getLogger(Arbitro.class.getName());
    private long tiempoInicio;
    PrintStream ps = new PrintStream(System.out);

    public Arbitro() {
        log.setLevel(Level.INFO);
    }

    public void iniciarCarrera() {
        tiempoInicio = System.currentTimeMillis();
        log.info(Utils.ANSI_BLUE + "INICIO DE CARRERA \n" + Utils.ANSI_RESET);
    }

    public void registrarAvance(Equipo equipo, Atleta atleta, int tiempoEtapa) {
        long tiempoActual = System.currentTimeMillis() - tiempoInicio;
        long min = TimeUnit.MILLISECONDS.toMinutes(tiempoActual);
        long seg = TimeUnit.MILLISECONDS.toSeconds(tiempoActual) % 60;

        log.info(String.format(Utils.ANSI_BLUE_BRIGHT +"\n"+ "**************************************\n" +
                "***** %s *****\n" + 
                "--------------------------------------\n" + 
                Utils.ANSI_CYAN_BRIGHT + "Atleta: %s\n" + 
                Utils.ANSI_YELLOW_BRIGHT + "Actividad: %s\n" + 
                Utils.ANSI_BLUE_BRIGHT + "Tiempo Acumulado: %02d:%02d minutos\n" + 
                "--------------------------------------\n" +
                "**************************************\n" + 
                Utils.ANSI_RESET,
                equipo.getNombreEquipo(), atleta.getName(), equipo.getActividadActual(), min, seg));

    }

    public void terminarCarrera(ArrayList<Equipo> equipos) {
        long tiempoFin = System.currentTimeMillis();
        long tiempoTotalCarrera = tiempoFin - tiempoInicio;
        long minutosCarrera = TimeUnit.MILLISECONDS.toMinutes(tiempoTotalCarrera);
        long segundosCarrera = TimeUnit.MILLISECONDS.toSeconds(tiempoTotalCarrera) % 60;

        ArrayList<Equipo> podio = new ArrayList<Equipo>(equipos);
        Collections.sort(podio, new Comparator<Equipo>() {
            public int compare(Equipo e1, Equipo e2) {
                return Long.compare(e1.getTiempoTotal(), e2.getTiempoTotal());
            }
        });

        log.info(Utils.ANSI_YELLOW + "\n Resultados " + Utils.ANSI_RESET);
        int posicion = 1;
        long ultimoTiempo = -1;
        for (int i = 0; i < podio.size(); i++) {
            Equipo equipo = podio.get(i);
            if (equipo.getTiempoTotal() != ultimoTiempo) {
                posicion = i + 1;
            }
            long minutos = TimeUnit.MILLISECONDS.toMinutes(equipo.getTiempoTotal());
            long segundos = TimeUnit.MILLISECONDS.toSeconds(equipo.getTiempoTotal()) % 60;

            ps.printf(Utils.ANSI_CYAN + "Posición %d: %s - Tiempo: %02d:%02d minutos\n" + Utils.ANSI_RESET, posicion, equipo.getNombreEquipo(), minutos, segundos);
            ultimoTiempo = equipo.getTiempoTotal();
        }

        log.info(String.format(Utils.ANSI_PURPLE + "Carrera completada en %02d:%02d minutos.\n" + Utils.ANSI_RESET, minutosCarrera, segundosCarrera));
    }
}
