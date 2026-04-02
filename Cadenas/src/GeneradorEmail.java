public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de email ***");

        var nombre = "Emiliano Aguilar Avendaño";
        var empresa = "Stark industries";
        var dominio = ".com.mx";

        // Eliminar espacios
        var nombrePunto = nombre.replace(" ", ".");
        var empresaPunto = empresa.replace(" ", ".");

        // toLowerCase
        var nombreMinuscula = nombrePunto.toLowerCase();
        var empresaMinuscula = empresaPunto.toLowerCase();


        // Juntar cadenas
        String gmail = new String(nombreMinuscula.concat("@").concat(empresaMinuscula).concat(dominio));

        // Imprimir
        System.out.println("Nombre de usuario: " + nombre);
        System.out.println("Nombre de usuario normalizado: " + nombreMinuscula);
        System.out.println("\nNombre de la empresa: \t" + empresa);
        System.out.println("Extension del dominio: " + dominio);
        System.out.println("Dominio de emal normalizado: " + "@" + empresaMinuscula + dominio);
        System.out.println("Email final generado: " + gmail);

    }
}
