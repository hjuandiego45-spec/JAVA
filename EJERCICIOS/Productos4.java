import javax.swing.JOptionPane;
import java.util.Hashtable;

public class Productos4 {

    public static void main(String[] args) {

        Hashtable<String, Integer> productos = new Hashtable<>();

        for (int i = 0; i < 3; i++) {

            String nombre = JOptionPane.showInputDialog("Producto");
            int precio = Integer.parseInt(
                    JOptionPane.showInputDialog("Precio"));

            productos.put(nombre, precio);
        }

        JOptionPane.showMessageDialog(null, productos.toString());
    }
}