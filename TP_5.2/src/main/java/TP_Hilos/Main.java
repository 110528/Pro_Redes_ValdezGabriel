package TP_Hilos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Arbitro arbitro = new Arbitro();
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();

        for (int i = 1; i <= 4; i++) {
            equipos.add(new Equipo("Equipo: " + i, arbitro));
        }

        arbitro.iniciarCarrera();

        for (Equipo equipo : equipos) {
            equipo.empezarCarrera();
        }

        for (Equipo equipo : equipos) {
            for (Atleta atleta : equipo.getAtletas()) {
                try {
                    atleta.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        arbitro.terminarCarrera(equipos);
    }
}
