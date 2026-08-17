import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el número de filas: ");
        var numeroFilas = consola.nextInt();

        // Iterar sobre cada fila del triangulo
        for (var fila = 1; fila <= numeroFilas; fila++){
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}