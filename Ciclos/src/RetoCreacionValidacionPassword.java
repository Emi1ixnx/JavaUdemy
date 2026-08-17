import java.util.Scanner;

public class RetoCreacionValidacionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var ciclo = false;
        var password = "";
        System.out.println("Bienvenido");
        while (!ciclo) {
            System.out.print("""
                    1. Crear contraseña
                    2. Validar contraseña
                    Elige la opcion deseada:\s""");

            var opcion = consola.nextInt();
            consola.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\n*** Creación de contraseña ***");
                    password = consola.nextLine();
                     if (password.length()<6){
                        System.out.println("\nNo cumple con los requisitos\n" +
                                "Tu contraseña debe tener al menos 6 caracteres\n");
                    } else System.out.println("\nContraseña creada\n");
                }
                case 2 -> {
                    System.out.print("\n*** Validación de contraseña ***\n" +
                            "Ingresa la contraseña creada:\s");
                    var passwordAValidar = consola.nextLine();
                    if (passwordAValidar.equals(password)) {
                        System.out.println("\nConstraseña correcta");
                        ciclo = true;
                    } else System.out.println("\nContraseña incorrecta, intenta de nuevo\n");
                }
                default -> {
                    System.out.println("\nElige una opcion válida....");
                }
            }
        }
    }
}
