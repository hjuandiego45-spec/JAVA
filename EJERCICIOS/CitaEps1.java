

import javax.swing.JOptionPane;

public class CitaEps1 {

    public static void main(String[] args) {

        String[] nombres = new String[5];
        String[] nombreTerapia = new String[5];
        int[] cantidadTerapias = new int[5];

        
        nombres[0] = "JUAN";
        nombreTerapia[0] = "ORTOPEDICA";
        cantidadTerapias[0] = 10;

        nombres[1] = "CARLOS";
        nombreTerapia[1] = "REUMATOLOGICA";
        cantidadTerapias[1] = 3;

        nombres[2] = "VANESSA";
        nombreTerapia[2] = "OBSTETRICIA";
        cantidadTerapias[2] = 5;

        nombres[3] = "MARI";
        nombreTerapia[3] = "PEDIATRICA";
        cantidadTerapias[3] = 5;

        nombres[4] = "JANER";
        nombreTerapia[4] = "GERIATRICA";
        cantidadTerapias[4] = 20;

       
        String mensaje = "";

        for (int i = 0; i < 5; i++) {

            mensaje += "Paciente: " + nombres[i] +
                    "\nTerapia: " + nombreTerapia[i] +
                    "\nCantidad: " + cantidadTerapias[i] +
                    "\n\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
