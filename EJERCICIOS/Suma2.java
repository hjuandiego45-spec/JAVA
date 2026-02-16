import javax.swing.JOptionPane;

public class Suma2 {

       public static void main(String[] args) {

        int[] numeros = new int[5];
        String lista = "";
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese numero " + (i + 1)));

            lista += numeros[i] + " ";

            suma += numeros[i];
        }

        JOptionPane.showMessageDialog(null,
                "Numeros ingresados:\n" + lista +
                "\n\nSuma total: " + suma);
        JOptionPane.showMessageDialog(null,
                "Numeros ingresados:\n" + lista +
                "\n\nNumero mayor: " + suma);
    }
}