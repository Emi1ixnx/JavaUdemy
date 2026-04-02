import java.util.Scanner;
public class TiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en línea con descuentos ***");
        // Inicio escaner
        var consola = new Scanner(System.in);
        // Monto de la compra
        System.out.print("¿Cuál fue el monto de tu compra? ");
        var monto = consola.nextDouble();
        // Miembro (lol)
        System.out.print("¿Eres miembro de la tienda? (true/false)");
        var miembro = consola.nextBoolean();
        // Desiciones
        if (miembro == true && monto >= 1000) {
            double descuento = 0.10 * monto;
            System.out.println("Felicidades, fuiste seleccionado para el descuento" +
                    " del 10% ");
            System.out.println("descuento = " + descuento);
            System.out.println("Total de compra: " + (monto - descuento));
        }
        else if (miembro == false && monto > 1000){
            double descuento = 0.05 * monto;
            System.out.println("Felicidades, fuiste seleccionado para el descuento" +
                    " del 5% ");
            System.out.println("descuento = " + descuento);
            System.out.println("Total de compra: " + (monto - descuento));
        }
        else if (miembro == true && monto < 1000){
            double descuento = 0.05 * monto;
            System.out.println("Felicidades, fuiste seleccionado para el descuento" +
                    " del 5% ");
            System.out.println("descuento = " + descuento);
            System.out.println("Total de compra: " + (monto - descuento));
        }
        else {
            System.out.println("Te invitamos a ser miembro para poder acceder a nuestros" +
                    "descuentos exclusivos, no te quedes atras para ahorrar en grande!");
        }
    }
}
