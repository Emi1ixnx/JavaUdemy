import java.util.Scanner;

public class SistemaDescuentosVip {
    public static void main(String[] args) {
        System.out.println("*** Sistema de descuentos VIP ***");
        final var noProductosDescuento = 10;
        var consola = new Scanner(System.in);

        System.out.print("¿cuántos productos compraste hoy? ");
        var cantidadDeProductos = Integer.parseInt(consola.nextLine());

        System.out.print("¿Tienes la membresia de la tienda? (true/false) ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleParaDescuento = cantidadDeProductos >= noProductosDescuento && tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP = " + esElegibleParaDescuento);

    }
}
