import javax.swing.JOptionPane;
import java.util.Hashtable;

public class Mascotas4 {

    public static void main(String[] args) {

        Hashtable<String, String> mascotas = new Hashtable<>();

        for (int i = 0; i < 3; i++) {

            String nombre = JOptionPane.showInputDialog("Nombre mascota");
            String tipo = JOptionPane.showInputDialog("Tipo mascota");

            mascotas.put(nombre, tipo);
        }

        JOptionPane.showMessageDialog(null, mascotas.toString());
    }
}