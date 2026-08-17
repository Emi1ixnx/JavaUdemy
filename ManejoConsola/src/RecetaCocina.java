import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");

        // Introducir el escaner
        Scanner consola = new Scanner(System.in);

        // Introducir datos
        System.out.print("Nombre de la receta: ");
        var nombre = consola.nextLine();
        System.out.print("Ingredientes principales: ");
        var ingredientes = consola.nextLine();
        System.out.print("Tiempo de preparación (min): ");
        var tiempo = Integer.parseInt(consola.nextLine());
        System.out.print("Dificultad (Fácil, Media, Alta): ");
        var dificultad = consola.nextLine();

        // Imprimir datos
        System.out.println("\nNombre de la receta = " + nombre);
        System.out.println("Ingredientes = " + ingredientes);
        System.out.println("Tiempo de preparación = " + tiempo);
        System.out.println("Dificultad = " + dificultad);
    }
}
