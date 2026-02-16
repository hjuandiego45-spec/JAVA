import javax.swing.JOptionPane;
import java.util.HashMap;

public class Numeros5 {

    public static void main(String[] args) {

        HashMap<Integer, Integer> numeros = new HashMap<>();

        for (int i = 1; i <= 3; i++) {

            int num = Integer.parseInt(
                    JOptionPane.showInputDialog("Numero " + i));

            numeros.put(i, num);
        }

        JOptionPane.showMessageDialog(null, numeros.toString());
    }
}