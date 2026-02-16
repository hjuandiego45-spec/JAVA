
import javax.swing.JOptionPane;

public class Productos1 {

    public static void main(String[] args) {

        // arreglos
        String[] nombres = new String[3];
        int[] precios = new int[3];
        int[] cantidades = new int[3];

        // producto 1
        nombres[0] = "Coca-Cola 1.5 L";
        precios[0] = 6500;
        cantidades[0] = 10;

        // producto 2
        nombres[1] = "Pony Malta 1.5 L";
        precios[1] = 4500;
        cantidades[1] = 8;

        // producto 3
        nombres[2] = "Cerveza Corona";
        precios[2] = 5000;
        cantidades[2] = 12;

        // construir mensaje
        String mensaje = "";

        for (int i = 0; i < 3; i++) {

            mensaje += "Producto: " + nombres[i] +
                    "\nPrecio: $" + precios[i] +
                    "\nCantidad: " + cantidades[i] +
                    "\n\n";
        }

        // mostrar ventana
        JOptionPane.showMessageDialog(null, mensaje);

    }
}