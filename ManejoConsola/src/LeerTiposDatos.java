import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        System.out.println("*** Leer distintos tipos de datos ***");
        // Aquí se inició el escaner
        Scanner consola = new Scanner(System.in);

        // Leer un tipo int
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        // Consumimos el caracter de salto de linea
        consola.nextLine();

        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversión de datos
        System.out.print("Proporciona un valor entero: ");
        //var enteroString = consola.nextLine(); // recordar que nextLine es para Strings
        //var entero = Integer.parseInt(enteroString); // Integer.parseInt es para convertir de String a Int, o sea, de cadena a entero

        // Esta es una manera más rápida de hacer lo de arriba
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        // Tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        // Double.parseDouble()

        // Boolean.parseBoolean()


    }
}
