import java.util.Scanner;

public class RetoCalculadoraJava {
    public static void main(String[] args) {
        System.out.print("Iniciando calculadora en Java");
        var consola = new Scanner(System.in);
        var ciclo = false;
        var resultado = 0.0;
        while (!ciclo) {
                System.out.print("""
                        \nOperaciones a realizar:
                        1. Suma
                        2. Resta
                        3. Multiplicacion
                        4. División
                        5. Salir
                        Elige tu opción:\s""");
                var opcion = consola.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Primer número: ");
                        var n1= consola.nextDouble();
                        System.out.print("Segundo número: ");
                        var n2 = consola.nextDouble();
                        resultado = n1 + n2;
                        System.out.print("Resultado: " + resultado);
                    }
                    case 2 -> {
                        System.out.print("Primer número: ");
                        var n1= consola.nextDouble();
                        System.out.print("Segundo número: ");
                        var n2 = consola.nextDouble();
                        resultado = n1 - n2;
                        System.out.print("Resultado: " + resultado);
                    }
                    case 3 -> {
                        System.out.print("Primer número: ");
                        var n1= consola.nextDouble();
                        System.out.print("Segundo número: ");
                        var n2 = consola.nextDouble();
                        resultado = n1 * n2;
                        System.out.print("Resultado: " + resultado);
                    }
                    case 4 -> {
                        System.out.print("Primer número: ");
                        var n1= consola.nextDouble();
                        System.out.print("Segundo número: ");
                        var n2 = consola.nextDouble();
                        if (n1 == 0) {
                            System.out.println("Error");
                        }
                        else if (n2 == 0) {
                                System.out.println("Error");
                        }
                        else {resultado = n1 / n2;
                        System.out.print("Resultado: " + resultado);}
                    }
                    case 5 -> {
                        System.out.println("Saliendo...");
                        ciclo = true;
                    }
                }

            }
        }
    }