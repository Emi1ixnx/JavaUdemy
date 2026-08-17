import java.util.Scanner;
public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** ¿En qué estación del año te encuentras? ***");
        // Iniciar la consola
        var consola = new Scanner(System.in);
        // Preguntar por la estación
        System.out.print("¿Qué mes? (1 a 12): ");
        var respuesta = consola.nextInt();
        // Sistema de identificación
        if (respuesta == 1 || respuesta == 2 || respuesta == 12) {
            System.out.println("Invierno");
        }
        else if (respuesta == 3 || respuesta == 4 || respuesta == 5) {
            System.out.println("Primavera");
        }
        else if (respuesta == 6 || respuesta == 7 || respuesta == 8) {
            System.out.println("Verano");
        }
        else if (respuesta == 9 || respuesta == 10 || respuesta == 11) {
            System.out.println("Otoño");
        } else System.out.println("Pues la verdad no sé");


        System.out.println("**** Estación del año con Switch mejorado ****");
        System.out.println("¿En qué mes te encuentras, bro? (del 1 al 12, no te pases de listo)");
        var diita = consola.nextInt();
        // Declaro la variable en la que guardaré mi Switch, tiene que ser variable String, y debo inicializarla
        String anito = switch (diita) {
            case 1, 2, 12 -> "Inviernillo";
            case 3,4,5 -> "Primaverilla";
            case 6,7,8 -> "Veranillo";
            case 9, 10, 11 -> "Otoñito";
            default -> "Invalidillo, como tú, mostro";
        };
        System.out.println(anito);

    }
}
