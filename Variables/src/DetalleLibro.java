public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un libro
        String tituloLibro = "Harry Potter";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        //Imprimir detalles
        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);
        // Modificar el título del libro
        tituloLibro = "Harry Potter y el príncipe mestizo";
        System.out.println(tituloLibro);

    }
}
