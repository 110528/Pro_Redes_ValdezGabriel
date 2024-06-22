package TP2;

import java.io.PrintStream;

public class Main {

    static PrintStream ps = new PrintStream(System.out);
    static boolean continuar = true;


    public static void main(String[] args) {




            while (continuar) {
                ps.println("Ingrese la opción a ejecutar:");
                ps.println("1- Agregar producto");
                ps.println("2- Mostrar produco");
                ps.println("3- Salir");

                int opcion = ejercicios. PT1_leerOpcion();

                switch (opcion) {
                case 1:
                    ps.println("Ejecutando Agregar producto");
                    // Lógica del ejercicio 1 (1)
                        // aca llamar al metodo que resuelve el ejercicio
                        // el metodo esta en otra Class y recominedo que el metodo sea
                        // de tipo Static, asi no hay que Instanciarlo (crear el objeto)
                    break;
                case 2:
                    ps.println("Ejecutando Mostrar producto");
                    // Lógica del ejercicio 1 (b)
                    break;
                case 3:
                    ps.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    ps.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
                }
            }
        }






}
