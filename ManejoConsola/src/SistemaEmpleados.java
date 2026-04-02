import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");

        // Inicio mi escaner
        Scanner consola = new Scanner(System.in);

        // Pedir los datos
        System.out.print("Ingresa tu nombre: ");
        String nombre = consola.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa tu salario: ");
        double salario = Double.parseDouble(consola.nextLine());

        System.out.print("¿Es jefe de departamento? (true/false): ");
        boolean jefe = Boolean.parseBoolean(consola.nextLine());

        // Imprimir datos
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
        System.out.println("Salario = " + salario);
        System.out.println("¿Jefe? = " + jefe);
    }
}
