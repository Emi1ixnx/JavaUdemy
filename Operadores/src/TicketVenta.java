import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación ticket de venta");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio durex: ");
        var precioDurex = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var  precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio xbox: ");
        var precioXbox = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Calcular subtotal sin impuestos

        var subTotal = precioLeche+precioDurex+precioLechuga+precioXbox;

        // Aplicar el descuento
        var descuento = subTotal * (descuentoPorcentaje/100.0);

        // SubTotal con descuento
        var subTotalConDescuento = subTotal - descuento;

        // Cálculo con impuestos (16%)
        var impuestos = subTotal * 0.16;

        // Calculo total de la compra (con impuestos)
        var costoTotalCompra = subTotal + impuestos;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                ---------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subTotal, descuento, descuentoPorcentaje, impuestos, costoTotalCompra);

    }
}
