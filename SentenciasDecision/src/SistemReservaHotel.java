import java.util.Scanner;

public class SistemReservaHotel {
    public static void main(String[] args) {
        System.out.println("Sistema de reserva de hotel");

        // Iniciar escaner
        Scanner consola = new Scanner(System.in);
        // Preguntas al usuario
        System.out.print("Nombre de cliente: ");
        var nombreCliente = consola.nextLine();
        System.out.print("¿Cuántos días reservará?: ");
        var numReserva = consola.nextInt();
        System.out.println("¿Cuarto con vista al mar? (true/false)");
        var cuartoVistaMar =  consola.nextBoolean();

        // Calculadora
        var respuesta = (cuartoVistaMar == true) ? 190.50*numReserva : 150.50*numReserva;

        var marRespuesta = "";

        if (cuartoVistaMar == true){
            marRespuesta = ("Sí :)");
        } else marRespuesta = ("No :(");
        // Respuesta al cliente

        System.out.printf("""
                --------------------------
                *** Reserva finalizada ***
                Reserva a nombre de: %s
                Días de estancia: %d
                Cuarto con vista al mar: %s
                Precio total: $%.2f
                """, nombreCliente, numReserva, marRespuesta, respuesta);

    }
}
