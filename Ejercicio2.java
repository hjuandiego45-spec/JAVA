import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correo;
        String password;

        do {
            System.out.println("Ingrese la correo: ");
            correo = scanner.nextLine();
        } while (!Validator.validarCorreo(correo));

        do {
            System.out.println("Ingrese la contraseña: ");
            password = scanner.nextLine();
        } while (!Validator.validarPassword(password));

        Validator.registroExitoso();

        scanner.close();
    }
}