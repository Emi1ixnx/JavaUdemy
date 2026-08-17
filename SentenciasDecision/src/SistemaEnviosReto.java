import java.util.Scanner;

public class SistemaEnviosReto {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envíos ***");
        // Pedir los datos -> Destino y Peso
        // Destino
        System.out.print("¿Es envío nacional o internacional?: ");
        var consola = new Scanner(System.in);
        String envio = consola.nextLine();

        // Peso
        System.out.print("¿Cuánto te pesa el paquete? (en kg): " );
        var peso = consola.nextDouble();

        double costo =0.0;

        // Costo de tarifas
        if (envio.equals("nacional") ){
            costo = peso * 10.0;
            System.out.println("Tu tarifa sería de: $" + costo);
        }
        else if (envio.equals("internacional")){
            costo = peso * 20.0;
            System.out.println("Tu tarifa sería de: $" + costo);
        }
        else {
            System.out.println("eres menso o sonso");
        }
    }
}
