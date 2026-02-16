

import javax.swing.JOptionPane;

public class macotas1 {

    public static void main(String[] args) {

        String[] nombreMacota = new String[5];
        String[] tipoDeMascota = new String[5];
        String[] sexo = new String[5];
        int[] edad = new int[5];

        
        nombreMacota[0] = "MAXIMO";
        tipoDeMascota[0] = "GATO";
        sexo[0]= "MACHO";
        edad[0] = 2;

        nombreMacota[1] = "CERATI";
        tipoDeMascota[1] = "GATO";
        sexo[1]= "MACHO";
        edad[1] = 1;

        nombreMacota[2] = "PELUSA";
        tipoDeMascota[2] = "CONEJO";
        sexo[2]= "HEMBRA";
        edad[2] = 3;

        nombreMacota[3] = "LINDA";
        tipoDeMascota[3] = "PERRO";
        sexo[3]= "HEMBRA";
        edad[3] = 1;

        nombreMacota[4] = "MOSCU";
        tipoDeMascota[4] = "GATO";
        sexo[4]= "MACHO";
        edad[4] = 5;

       
        String mensaje = "";

        for (int i = 0; i < 5; i++) {

            mensaje += "Mascota: " + nombreMacota[i] +
                    "\nTipo De Mascota: " + tipoDeMascota[i] +
                     "\nSexo: " + sexo[i] +
                    "\nEdad: " + edad[i] + " Años" +
                    "\n\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
