import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Numeros3 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese numero " + (i + 1))
            );

            numeros.add(num);
            suma += num;
        }

        String lista = "  ";

        for (int n : numeros) {
            lista += n + " + ";
        }

        JOptionPane.showMessageDialog(null,
                "Numeros ingresados:\n" + lista +
                "\n\nSuma total: " + suma);
    }
}