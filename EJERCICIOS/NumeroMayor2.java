import javax.swing.JOptionPane;

public class NumeroMayor2 {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        String lista = "";

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese numero " + (i + 1)));

            lista += numeros[i] + " ";
        }

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null,
                "Números ingresados:\n" + lista +
                "\n\nNumero mayor: " + mayor);
    }
}