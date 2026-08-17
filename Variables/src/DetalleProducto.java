public class DetalleProducto {
    public static void main(String[] args) {
        // Tienda en línea -- Jeffrey´s shop
        String nombre = "Keta";
        int precio = 500;
        int cantidad = 20;
        boolean disponible = true;

        // Imprimir detalles
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
        System.out.println("cantidad = " + cantidad);
        System.out.println("disponible = " + disponible);

        // Modificación
        nombre = "Molly";
        precio = 200;
        cantidad = 0;
        disponible = false;

        // Imprimir detalles
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
        System.out.println("cantidad = " + cantidad);
        System.out.println("disponible = " + disponible);
    }
}
