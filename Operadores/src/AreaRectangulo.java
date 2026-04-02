import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Cálculo de área y perímetro de un rectángulo ***");

        // Iniciar consola
        var consola = new Scanner(System.in);

        System.out.println("Ingresa datos del rectángulo (cm)");
        System.out.print("Base: " );
        var baseConsola = consola.nextInt();
        System.out.print("Altura: " );
        var alturaConsola = consola.nextInt();

        // Formula de area
        var area = baseConsola * alturaConsola;

        // Formula perímetro
        var perimetro = 2 * (baseConsola + alturaConsola);

        System.out.println("Area: " + area + " cm");
        System.out.println("Perimetro: " + perimetro + " cm");
    }
}
