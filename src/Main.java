import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Versión inicial con gestión básica de productos.");
    }

    public static void buscarProducto(ArrayList<String> productos, String nombreBuscado) {
        boolean encontrado = false;

        for (String producto : productos) {
            if (producto.equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Producto encontrado: " + nombreBuscado);
        } else {
            System.out.println("Producto no encontrado: " + nombreBuscado);
        }
    }
}