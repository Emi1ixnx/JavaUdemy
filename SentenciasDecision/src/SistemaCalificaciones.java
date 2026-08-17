import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de calificaciones ***");
        // Iniciar mi escaner
        var consola = new Scanner(System.in);
        System.out.print("¿Qué calificación sacaste? ");
        var calificacion = consola.nextInt();

        if (calificacion>= 9 && calificacion <= 10) {
            System.out.println("A, de fakin epstein");
        }
        else if (calificacion>= 8 && calificacion <= 9) {
            System.out.println("B, de benson");
        }
        else if (calificacion >= 7 && calificacion <= 8) {
            System.out.println("C, de Curly (R.I.P)");
        }
        else if (calificacion >= 6 && calificacion <= 7) {
            System.out.println("D, de dedos");
        }
        else if (calificacion >= 0 && calificacion <= 6) {
            System.out.println("F, de follada");
        }
        else {
            System.out.println("Intenta de nuevo");
        }
    }
}
