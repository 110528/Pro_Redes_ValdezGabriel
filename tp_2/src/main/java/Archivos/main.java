package Archivos;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

public class main {

    static PrintStream ps = new PrintStream(System.out);

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            mostrarMenu();
            int opcion = leerNumero(reader);
            if (opcion == 0) {
                break;
            }
            try {
                switch (opcion) {
                    case 1:
                        agregarProducto(reader);
                        break;
                    case 2:
                        mostrarProductos();
                        break;
                    default:
                        ps.println("Opción no válida.");
                        break;
                }
            } catch (IOException e) {
                ps.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    public static void mostrarMenu() {
        ps.println("Menú de Opciones:");
        ps.println("1. Agregar Producto");
        ps.println("2. Mostrar Productos");
        ps.println("0. Salir");
        ps.print("Seleccione una opción: ");
    }

    public static String leerTexto(BufferedReader reader) {
        try {
            return reader.readLine();
        } catch (IOException e) {
            ps.println("Error al leer el texto. Inténtelo de nuevo.");
            return "";
        }
    }

    public static int leerNumero(BufferedReader reader) {
        while (true) {
            try {
                String input = reader.readLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                ps.print("Entrada no válida. Por favor, ingrese un número: ");
            } catch (IOException e) {
                ps.println("Error al leer el número. Inténtelo de nuevo.");
            }
        }
    }

    public static double leerDouble(BufferedReader reader) {
        while (true) {
            try {
                String input = reader.readLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                ps.print("Entrada no válida. Por favor, ingrese un número decimal: ");
            } catch (IOException e) {
                ps.println("Error al leer el número decimal. Inténtelo de nuevo.");
            }
        }
    }

    public static void agregarProducto(BufferedReader reader) throws IOException {
        ps.print("Ingrese el nombre del producto: ");
        String nombre = leerTexto(reader);

        ps.print("Ingrese el precio de compra: ");
        double precioCompra = leerDouble(reader);

        ps.print("Ingrese el precio de venta: ");
        double precioVenta = leerDouble(reader);

        ps.print("Ingrese el stock actual: ");
        int stock = leerNumero(reader);

        guardarProducto(nombre, precioCompra, precioVenta, stock);
    }

    public static void guardarProducto(String nombre, double precioCompra, double precioVenta, int stock) {
        try (FileWriter writer = new FileWriter("datos.txt", true)) {
            writer.write(nombre + ";" + precioCompra + ";" + precioVenta + ";" + stock + "\n");
        } catch (IOException e) {
            ps.println("Error al guardar el producto: " + e.getMessage());
        }
    }

    public static void mostrarProductos() {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = fileReader.readLine()) != null) {
                String[] datos = linea.split(";");
                ps.println("Nombre: " + datos[0] + ", Precio Compra: " + datos[1] + ", Precio Venta: " + datos[2] + ", Stock: " + datos[3]);
            }
        } catch (IOException e) {
            ps.println("Error al leer los productos: " + e.getMessage());
        }
    }
}
