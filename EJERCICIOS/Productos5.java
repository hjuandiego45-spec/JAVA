import javax.swing.JOptionPane;
import java.util.HashMap;

public class Productos5 {

    public static void main(String[] args) {

        HashMap<String, Integer> productos = new HashMap<>();

        for (int i = 0; i < 3; i++) {

            String nombre = JOptionPane.showInputDialog("Producto");
            int precio = Integer.parseInt(
                    JOptionPane.showInputDialog("Precio"));

            productos.put(nombre, precio);
        }

        JOptionPane.showMessageDialog(null, productos.toString());
    }
}