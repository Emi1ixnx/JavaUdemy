import java.util.Scanner;

public class RetoCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de calificaciones ***");
        var consola = new Scanner(System.in);

        var calificacionTotal = 0;
        System.out.print("¿Cuántas calificaciones deseas agregar?\s");
        int numero = Integer.parseInt(consola.nextLine());

        int[] calificaciones = new int[numero];

        for (var i = 0; i < numero; i++){
            System.out.print("Calificación [" +  i + "] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }

        for (var i = 0; i < calificaciones.length; i++){
            calificacionTotal += calificaciones[i];
        }
        System.out.println("Promedio final:\s" + calificacionTotal/numero);
    }
}
