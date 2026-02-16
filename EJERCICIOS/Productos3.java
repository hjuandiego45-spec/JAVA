import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Productos3 {

    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String prod = JOptionPane.showInputDialog("Ingrese producto " + (i + 1));
            productos.add(prod);
        }

        String lista = "";

        for (String p : productos) {
            lista += p + "\n";
        }

        JOptionPane.showMessageDialog(null, "Productos registrados:\n" + lista);
    }
}