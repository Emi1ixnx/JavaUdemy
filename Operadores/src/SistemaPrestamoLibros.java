import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema prestamo libros ***");
        final var distanciaPermitidaKM = 3;
        var consola = new Scanner (System.in);
        System.out.println("¿Cuentas con credencial de estudiante?(true/false) ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.println("¿A cuántos KM vives de la biblioteca? ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tienesCredencial || distanciaBiblioteca <= distanciaPermitidaKM;

        System.out.println("esElegiblePrestamo? = " + esElegiblePrestamo);
    }
}
