import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Mascotas3 {

    public static void main(String[] args) {

        ArrayList<String> mascotas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese mascota " + (i + 1));
            mascotas.add(nombre);
        }

        String lista = "";

        for (String m : mascotas) {
            lista += m + "\n";
        }

        JOptionPane.showMessageDialog(null, "Mascotas registradas:\n" + lista);
    }
}