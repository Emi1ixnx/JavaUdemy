import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticacion ***");
        // Inicio escaner
        Scanner consola = new Scanner(System.in);

        // Variables a comprobar
        var usuario = "Sasel3210";
        var password = "12345";

        // Pregunto por el usuario
        System.out.print ("¿Cuál es tu usuario? ");
        String usuarioConsola = consola.nextLine();

        // Preguntar por contraseña
        System.out.print ("¿Cuál es tu contraseña? ");
        String passwordConsola = consola.nextLine();

        // Lógica de comparación
        boolean comprobacion = usuarioConsola.equals(usuario) && passwordConsola.equals(password);
        System.out.println("Acceso aceptado: " + comprobacion);
    }
}
