import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        // Comenzar con iteración del menú
        while (!salir) {
            System.out.println("""
                    *** Sistema de administración de cuentas ***
                    Menú:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoje una opción:\s
                    """);
            var opcion = consola.nextInt();
            // Evaluar cada opción del menú
            switch (opcion) {
                case 1 -> System.out.println("Creando cuenta...\n");
                case 2 -> System.out.println("Eliminando cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta luego");
                    salir = true;
                }
                default -> System.out.println("Opción inválida, lol\n");
            }
        }
        System.out.println("Fin del sistema...");
    }
}
