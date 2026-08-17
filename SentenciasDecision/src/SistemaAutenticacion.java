import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticación ***");
        // Declaro el usuario y la contraseña a verificar
        final var usuario = "pepito";
        final String password = "123456789";

        // Inicio la consola para introducir los datos
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese su nombre del usuario: ");
        String nombre = consola.nextLine().strip();
        System.out.print("Ingrese su contraseña: ");
        String contrasenia = consola.nextLine().strip();

        // Métodos para evaluar
        // 1 - El usuario lo tiene mal
        if (nombre.equals(usuario) && contrasenia.equals(password)) {
            System.out.println("Bienvenido al sistema");
        }
        else if (nombre.equals(usuario) && !(password.equals(contrasenia))) {
            System.out.println("La contraseña es incorrecta");
        }
        else if (!nombre.equals(usuario) && password.equals(contrasenia)) {
            System.out.println("Usuario incorrecto");
        }
        else if (!nombre.equals(usuario) && !(password.equals(contrasenia))) {
            System.out.println("Usuario y contraseña incorrectos");
        }
        else System.out.println("Inválido... mentalmente");
    }
}
