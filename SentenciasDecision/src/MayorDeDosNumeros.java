import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Comparación de dos numeros ***");

        // Iniciar consola
        var consola = new Scanner(System.in);

        // Preguntar por los numeros
        System.out.print("Introduce el primer número: ");
        var primerNum =  consola.nextInt();
        System.out.print("Introduce el segundo número: ");
        var segundoNum = consola.nextInt();

        // Comparación de los números
        var comparacion =
                (primerNum > segundoNum) ? "El número mayor es: " + primerNum :
                        (segundoNum > primerNum) ?  "El número mayor es: " + segundoNum: "Son iguales, lol";
        System.out.println(comparacion);

    }
}
