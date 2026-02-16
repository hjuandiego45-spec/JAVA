import javax.swing.JOptionPane;
import java.util.HashMap;

public class Mascotas5 {

    public static void main(String[] args) {

        HashMap<String, String> mascotas = new HashMap<>();

        for (int i = 0; i < 3; i++) {

            String nombre = JOptionPane.showInputDialog("Nombre mascota");
            String tipo = JOptionPane.showInputDialog("Tipo mascota");

            mascotas.put(nombre, tipo);
        }

        JOptionPane.showMessageDialog(null, mascotas.toString());
    }
}