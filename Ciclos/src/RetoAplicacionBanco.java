import java.util.Scanner;

public class RetoAplicacionBanco {
    public static void main(String[] args) {
        // Depositar, retirar, y consultar el saldo }
        var consola = new Scanner(System.in);
        var banco = false;
        var saldo = 1000.00;
        while (!banco) {
            System.out.println("""
                    \n*** Bienvenido a tu cajero automático ***
                    Operaciones que se pueden realizar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s
                    """);
            switch (consola.nextInt()) {
                case 1 -> System.out.println("Tu saldo es de: $" + saldo);
                case 2 -> {
                    System.out.print("Monto a retirar: ");
                    double monto = consola.nextDouble();
                    if (monto > saldo) {
                        System.out.println("Saldo insuficiente");
                    }
                    else if (monto < 0){
                        System.out.println("Ingresa una cantidad real, nmms");
                    }
                    else saldo = saldo - monto;
                    System.out.println("Saldo actual: " + saldo);
                }
                case 3 -> {
                    System.out.print("Monto a depositar: ");
                    double monto = consola.nextDouble();
                    if (monto < 0) {
                        System.out.println("Ingresa una cantidad válida");
                    }
                    else saldo = saldo + monto;
                    System.out.println("Saldo actual: " + saldo);
                }
                case 4 -> {System.out.println("Saliendo del sistema...");
                    banco = true;
                }
                default -> System.out.println("Opción inválida....");
                }
            }
        }
    }
