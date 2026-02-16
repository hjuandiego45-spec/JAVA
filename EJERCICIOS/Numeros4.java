import javax.swing.JOptionPane;
import java.util.Hashtable;

public class Numeros4 {

    public static void main(String[] args) {

        Hashtable<Integer, Integer> numeros = new Hashtable<>();

        for (int i = 1; i <= 3; i++) {

            int num = Integer.parseInt(
                    JOptionPane.showInputDialog("Numero " + i));

            numeros.put(i, num);
        }

        JOptionPane.showMessageDialog(null, numeros.toString());
    }
}